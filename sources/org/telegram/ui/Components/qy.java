package org.telegram.ui.Components;

import android.opengl.GLES20;
import java.util.Locale;
public final class qy {
    public final String f37562a;
    public final String f37563b;
    public int f37564c;
    public int d;
    public int f37565e;
    public int f37566f;
    public int f37567g;
    public int h;

    public qy(float f10, float f11, boolean z10) {
        int i3;
        float f12;
        int i10;
        double d = 6.283185307179586d;
        if (z10) {
            f12 = Math.round(f10);
            if (f12 >= 1.0f) {
                double d10 = f12;
                int floor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(d10, 2.0d) * 6.283185307179586d) * 0.00390625f) * Math.pow(d10, 2.0d) * (-2.0d)));
                i3 = (floor % 2) + floor;
            } else {
                i3 = 0;
            }
        } else {
            i3 = (int) f10;
            f12 = f11;
        }
        int i11 = 1;
        int i12 = (i3 * 2) + 1;
        float[] fArr = new float[i12];
        int i13 = 0;
        float f13 = 0.0f;
        while (true) {
            i10 = i3 + 1;
            if (i13 >= i10) {
                break;
            }
            double d11 = d;
            double d12 = f12;
            int i14 = i11;
            float[] fArr2 = fArr;
            float exp = (float) (Math.exp((-Math.pow(i13, 2.0d)) / (Math.pow(d12, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d12, 2.0d) * d11)));
            fArr2[i13] = exp;
            if (i13 == 0) {
                f13 += exp;
            } else {
                f13 = (float) ((exp * 2.0d) + f13);
            }
            i13++;
            i11 = i14;
            d = d11;
            fArr = fArr2;
        }
        double d13 = d;
        int i15 = i11;
        float[] fArr3 = fArr;
        for (int i16 = 0; i16 < i10; i16++) {
            fArr3[i16] = fArr3[i16] / f13;
        }
        char c2 = 2;
        int i17 = (i3 % 2) + (i3 / 2);
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
                float x10 = com.google.android.recaptcha.internal.a.x(f16, i24, f15 * i23, f17);
                Locale locale3 = Locale.US;
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(x10), Float.valueOf(f17)));
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(x10), Float.valueOf(f17)));
                min++;
            }
        }
        sb2.append("gl_FragColor = sum;\n}\n");
        this.f37563b = sb2.toString();
        float[] fArr4 = new float[i12];
        int i25 = 0;
        float f18 = 0.0f;
        while (i25 < i10) {
            double d14 = f12;
            char c10 = c2;
            float f19 = f18;
            float exp2 = (float) (Math.exp((-Math.pow(i25, 2.0d)) / (Math.pow(d14, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d14, 2.0d) * d13)));
            fArr4[i25] = exp2;
            if (i25 == 0) {
                f18 = f19 + exp2;
            } else {
                f18 = (float) ((exp2 * 2.0d) + f19);
            }
            i25++;
            c2 = c10;
        }
        char c11 = c2;
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
            fArr5[i27] = com.google.android.recaptcha.internal.a.x(f22, i30, f21 * i29, f21 + f22);
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
            objArr2[c11] = valueOf3;
            objArr2[3] = valueOf4;
            sb3.append(String.format(locale5, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", objArr2));
        }
        sb3.append("}");
        this.f37562a = sb3.toString();
    }

    public final boolean a() {
        int h = sy.h(35633, this.f37562a);
        int h7 = sy.h(35632, this.f37563b);
        if (h == 0 || h7 == 0) {
            return false;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.f37564c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.f37564c, h7);
        GLES20.glBindAttribLocation(this.f37564c, 0, "position");
        GLES20.glBindAttribLocation(this.f37564c, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.f37564c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f37564c, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.f37564c);
            this.f37564c = 0;
        } else {
            this.d = GLES20.glGetAttribLocation(this.f37564c, "position");
            this.f37565e = GLES20.glGetAttribLocation(this.f37564c, "inputTexCoord");
            this.f37566f = GLES20.glGetUniformLocation(this.f37564c, "sTexture");
            this.f37567g = GLES20.glGetUniformLocation(this.f37564c, "texelWidthOffset");
            this.h = GLES20.glGetUniformLocation(this.f37564c, "texelHeightOffset");
        }
        return true;
    }
}
