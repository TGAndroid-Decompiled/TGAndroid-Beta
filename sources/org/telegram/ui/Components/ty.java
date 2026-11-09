package org.telegram.ui.Components;

import android.opengl.GLES20;
import java.util.Locale;
public final class ty {
    public final String f38528a;
    public final String f38529b;
    public int f38530c;
    public int d;
    public int f38531e;
    public int f38532f;
    public int f38533g;
    public int h;

    public ty(float f10, float f11, boolean z9) {
        int i7;
        float f12;
        int i10;
        double d = 6.283185307179586d;
        if (z9) {
            f12 = Math.round(f10);
            if (f12 >= 1.0f) {
                double d2 = f12;
                int floor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(d2, 2.0d) * 6.283185307179586d) * 0.00390625f) * Math.pow(d2, 2.0d) * (-2.0d)));
                i7 = (floor % 2) + floor;
            } else {
                i7 = 0;
            }
        } else {
            i7 = (int) f10;
            f12 = f11;
        }
        int i11 = 1;
        int i12 = (i7 * 2) + 1;
        float[] fArr = new float[i12];
        int i13 = 0;
        float f13 = 0.0f;
        while (true) {
            i10 = i7 + 1;
            if (i13 >= i10) {
                break;
            }
            double d10 = d;
            double d11 = f12;
            int i14 = i11;
            float[] fArr2 = fArr;
            float exp = (float) (Math.exp((-Math.pow(i13, 2.0d)) / (Math.pow(d11, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d11, 2.0d) * d10)));
            fArr2[i13] = exp;
            if (i13 == 0) {
                f13 += exp;
            } else {
                f13 = (float) ((exp * 2.0d) + f13);
            }
            i13++;
            i11 = i14;
            d = d10;
            fArr = fArr2;
        }
        double d12 = d;
        int i15 = i11;
        float[] fArr3 = fArr;
        for (int i16 = 0; i16 < i10; i16++) {
            fArr3[i16] = fArr3[i16] / f13;
        }
        char c10 = 2;
        int i17 = (i7 % 2) + (i7 / 2);
        int min = Math.min(i17, 7);
        StringBuilder sb2 = new StringBuilder("uniform sampler2D sTexture;\nuniform highp float texelWidthOffset;\nuniform highp float texelHeightOffset;\n");
        Locale locale = Locale.US;
        sb2.append("varying highp vec2 blurCoordinates[" + ((min * 2) + 1) + "];\n");
        sb2.append("void main()\n{\nlowp vec4 sum = vec4(0.0);\n");
        Object[] objArr = new Object[i15];
        objArr[0] = Float.valueOf(fArr3[0]);
        sb2.append(String.format(locale, "sum += texture2D(sTexture, blurCoordinates[0]) * %f;\n", objArr));
        for (int i18 = 0; i18 < min; i18++) {
            int i19 = i18 * 2;
            int i20 = i19 + 1;
            int i21 = i19 + 2;
            float f14 = fArr3[i20] + fArr3[i21];
            Locale locale2 = Locale.US;
            sb2.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i20), Float.valueOf(f14)));
            sb2.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i21), Float.valueOf(f14)));
        }
        if (i17 > min) {
            sb2.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
            while (min < i17) {
                int i22 = min * 2;
                int i23 = i22 + 1;
                float f15 = fArr3[i23];
                int i24 = i22 + 2;
                float f16 = fArr3[i24];
                float f17 = f15 + f16;
                float y10 = com.google.android.recaptcha.internal.a.y(f16, i24, f15 * i23, f17);
                Locale locale3 = Locale.US;
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(y10), Float.valueOf(f17)));
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(y10), Float.valueOf(f17)));
                min++;
            }
        }
        sb2.append("gl_FragColor = sum;\n}\n");
        this.f38529b = sb2.toString();
        float[] fArr4 = new float[i12];
        int i25 = 0;
        float f18 = 0.0f;
        while (i25 < i10) {
            double d13 = f12;
            char c11 = c10;
            float f19 = f18;
            float exp2 = (float) (Math.exp((-Math.pow(i25, 2.0d)) / (Math.pow(d13, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d13, 2.0d) * d12)));
            fArr4[i25] = exp2;
            if (i25 == 0) {
                f18 = f19 + exp2;
            } else {
                f18 = (float) ((exp2 * 2.0d) + f19);
            }
            i25++;
            c10 = c11;
        }
        char c12 = c10;
        float f20 = f18;
        for (int i26 = 0; i26 < i10; i26++) {
            fArr4[i26] = fArr4[i26] / f20;
        }
        int min2 = Math.min(i17, 7);
        float[] fArr5 = new float[min2];
        for (int i27 = 0; i27 < min2; i27++) {
            int i28 = i27 * 2;
            int i29 = i28 + 1;
            float f21 = fArr4[i29];
            int i30 = i28 + 2;
            float f22 = fArr4[i30];
            fArr5[i27] = com.google.android.recaptcha.internal.a.y(f22, i30, f21 * i29, f21 + f22);
        }
        StringBuilder sb3 = new StringBuilder("attribute vec4 position;\nattribute vec4 inputTexCoord;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n");
        Locale locale4 = Locale.US;
        sb3.append("varying vec2 blurCoordinates[" + ((min2 * 2) + 1) + "];\n");
        sb3.append("void main()\n{\ngl_Position = position;\nvec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\nblurCoordinates[0] = inputTexCoord.xy;\n");
        for (int i31 = 0; i31 < min2; i31++) {
            Locale locale5 = Locale.US;
            int i32 = i31 * 2;
            Integer valueOf = Integer.valueOf(i32 + 1);
            Float valueOf2 = Float.valueOf(fArr5[i31]);
            Integer valueOf3 = Integer.valueOf(i32 + 2);
            Float valueOf4 = Float.valueOf(fArr5[i31]);
            Object[] objArr2 = new Object[4];
            objArr2[0] = valueOf;
            objArr2[1] = valueOf2;
            objArr2[c12] = valueOf3;
            objArr2[3] = valueOf4;
            sb3.append(String.format(locale5, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", objArr2));
        }
        sb3.append("}");
        this.f38528a = sb3.toString();
    }

    public final boolean a() {
        int h = wy.h(35633, this.f38528a);
        int h7 = wy.h(35632, this.f38529b);
        if (h == 0 || h7 == 0) {
            return false;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.f38530c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.f38530c, h7);
        GLES20.glBindAttribLocation(this.f38530c, 0, "position");
        GLES20.glBindAttribLocation(this.f38530c, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.f38530c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f38530c, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.f38530c);
            this.f38530c = 0;
        } else {
            this.d = GLES20.glGetAttribLocation(this.f38530c, "position");
            this.f38531e = GLES20.glGetAttribLocation(this.f38530c, "inputTexCoord");
            this.f38532f = GLES20.glGetUniformLocation(this.f38530c, "sTexture");
            this.f38533g = GLES20.glGetUniformLocation(this.f38530c, "texelWidthOffset");
            this.h = GLES20.glGetUniformLocation(this.f38530c, "texelHeightOffset");
        }
        return true;
    }
}
