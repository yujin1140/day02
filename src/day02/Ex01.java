package day02;

public class Ex01 {
public static void main(String[] args) {
	/*
	 변수: 데이터를 저장하는 공간
	 자료형: 데이터가 어떤 값인지에 따라 사용하는 값
	 - int : 정수를 표현 :4byte
	 - float / double " 실수를 표현 : 4 / 8 byte
	 - char : 문자 표현: 2byte
	 - boolean " trus 또는 false 표현 : 1byte 변수 생성
	 - 자료형 변수명; 또는 자료현 변수명 = 값;
	 - 1number(x), n22u11m33(o)
	 - changenumber => changeNumber
	 - 예약어는 사용할 수 없다
	 */
	
	int age = 50;
	float height = 150; 
	double weight = 20.0; 
	System.out.println("나의 나이는 "+age+"살 입니다");
	System.out.println(age+"살의 홍길동 입니다");
	System.out.println("나의 나이는 "+age+"살 입니다");
	System.out.println("나의 키는 "+height+"(cm) 입니다");
	System.out.println("나의 몸무게는 "+weight+"(kg) 입니다");
	}
}
