import java.util.Scanner;

class Person{
    private String name;
    private String dateOfBirth;
    private String gender;
    private String mobileNumber;
    private String bloodGroup;
    
    public void setName(String name){
        this.name = name;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup =bloodGroup;
    }
    
    
    public String getName(){
        return name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getGender(){
        return gender;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getBloodGroup(){
        return bloodGroup;
    }
}

class Donor extends Person{
    private String bloodBankName;
    private String donorType;
    private String donationDate;
    
    public void setName(String name){
        super.setName(name);
    }
    public void setDateOfBirth(String dateOfBirth){
        super.setDateOfBirth(dateOfBirth);
    }
    public void setGender(String gender){
        super.setGender(gender);
    }
    public void setMobileNumber(String mobileNumber){
        super.setMobileNumber(mobileNumber);
    }
    public void setBloodGroup(String bloodGroup){
        super.setBloodGroup(bloodGroup);
    }
    public void setBloodBankName(String bloodBankName){
        this.bloodBankName = bloodBankName;
    }
    public void setDonarType(String donorType){
        this.donorType = donorType;
    }
    public void setDonationDate(String donationDate){
        this.donationDate = donationDate;
    }
    
    public void displayDonationDetails(){
        System.out.println("Donation Details : ");
        System.out.println("Name : "+ super.getName());
        System.out.println("Date Of Birth : "+ super.getDateOfBirth());
        System.out.println("Gender : "+ super.getGender());
        System.out.println("Mobile Number : "+ super.getMobileNumber());
        System.out.println("Blood Group : "+ super.getBloodGroup());
        System.out.println("Blood Bank Name : "+ bloodBankName);
        System.out.println("Donor Type : "+ donorType);
        System.out.println("Donation Date : "+ donationDate);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Donor d = new Donor();
        
        d.setName(sc.nextLine());
        d.setDateOfBirth(sc.nextLine());
        d.setGender(sc.nextLine());
        d.setMobileNumber(sc.nextLine());
        d.setBloodGroup(sc.nextLine());
        d.setBloodBankName(sc.nextLine());
        d.setDonarType(sc.nextLine());
        d.setDonationDate(sc.nextLine());
        
        d.displayDonationDetails();
    }
}
