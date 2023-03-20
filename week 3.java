package week3;
import java.util.Scanner; //package 밑에 선언

public class week3 {
	public static void main(String[] args) { //main 메서드 안 자료형:string[](배열)과 변수명 args
        //상수 사용하는 방법으로 원의 면적 구하기
        final double PI = 3.14;
        double radius = 10;
        double circleArea = 0;
        
        circleArea = radius*radius*PI;
        
        System.out.print("원의 면적 : ");
        System.out.println(circleArea);
	}
}
		
public class 실행판 {
	public static void main(String[] args) {	
	//반지름 입력받는 방식으로 원의 면적 구하기 
	double radius;
	final double PI = 3.14;
	double circleArea;
		
	Scanner sc = new Scanner(System.in); //Scanner, System.in 에 대해서 더 알아보기
	System.out.print("반지름 입력 :");
	radius = sc.nextDouble(); //형태 : next+자료형() ex) nextDouble();
	circleArea = radius*radius*PI;
	System.out.print("원의 면적 :");
	System.out.println(circleArea);
	}
}


/* Scanner
