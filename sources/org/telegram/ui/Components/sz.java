package org.telegram.ui.Components;

import android.opengl.GLES20;
import java.util.Locale;
public final class sz {
    public final String f32760a;
    public final String f32761b;
    public int f32762c;
    public int d;
    public int f32763e;
    public int f32764f;
    public int f32765g;
    public int h;

    public sz(float f9, float f10, boolean z10) {
        int i10;
        float f11;
        int i11;
        double d = 6.283185307179586d;
        if (z10) {
            f11 = Math.round(f9);
            if (f11 >= 1.0f) {
                double d10 = f11;
                int floor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(d10, 2.0d) * 6.283185307179586d) * 0.00390625f) * Math.pow(d10, 2.0d) * (-2.0d)));
                i10 = (floor % 2) + floor;
            } else {
                i10 = 0;
            }
        } else {
            i10 = (int) f9;
            f11 = f10;
        }
        int i12 = (i10 * 2) + 1;
        float[] fArr = new float[i12];
        int i13 = 0;
        float f12 = 0.0f;
        while (true) {
            i11 = i10 + 1;
            if (i13 >= i11) {
                break;
            }
            double d11 = d;
            double d12 = f11;
            float[] fArr2 = fArr;
            float exp = (float) (Math.exp((-Math.pow(i13, 2.0d)) / (Math.pow(d12, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d12, 2.0d) * d11)));
            fArr2[i13] = exp;
            if (i13 == 0) {
                f12 += exp;
            } else {
                f12 = (float) ((exp * 2.0d) + f12);
            }
            i13++;
            d = d11;
            fArr = fArr2;
        }
        double d13 = d;
        float[] fArr3 = fArr;
        for (int i14 = 0; i14 < i11; i14++) {
            fArr3[i14] = fArr3[i14] / f12;
        }
        int i15 = (i10 % 2) + (i10 / 2);
        int min = Math.min(i15, 7);
        StringBuilder sb2 = new StringBuilder("uniform sampler2D sTexture;\nuniform highp float texelWidthOffset;\nuniform highp float texelHeightOffset;\n");
        Locale locale = Locale.US;
        sb2.append("varying highp vec2 blurCoordinates[" + ((min * 2) + 1) + "];\n");
        sb2.append("void main()\n{\nlowp vec4 sum = vec4(0.0);\n");
        sb2.append(String.format(locale, "sum += texture2D(sTexture, blurCoordinates[0]) * %f;\n", Float.valueOf(fArr3[0])));
        for (int i16 = 0; i16 < min; i16++) {
            int i17 = i16 * 2;
            int i18 = i17 + 1;
            int i19 = i17 + 2;
            float f13 = fArr3[i18] + fArr3[i19];
            Locale locale2 = Locale.US;
            sb2.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i18), Float.valueOf(f13)));
            sb2.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i19), Float.valueOf(f13)));
        }
        if (i15 > min) {
            sb2.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
            while (min < i15) {
                int i20 = min * 2;
                int i21 = i20 + 1;
                float f14 = fArr3[i21];
                int i22 = i20 + 2;
                float f15 = fArr3[i22];
                float f16 = f14 + f15;
                float y8 = com.google.android.recaptcha.internal.a.y(f15, i22, f14 * i21, f16);
                Locale locale3 = Locale.US;
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(y8), Float.valueOf(f16)));
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(y8), Float.valueOf(f16)));
                min++;
            }
        }
        sb2.append("gl_FragColor = sum;\n}\n");
        this.f32761b = sb2.toString();
        float[] fArr4 = new float[i12];
        float f17 = 0.0f;
        for (int i23 = 0; i23 < i11; i23++) {
            double d14 = f11;
            float f18 = f17;
            float exp2 = (float) (Math.exp((-Math.pow(i23, 2.0d)) / (Math.pow(d14, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d14, 2.0d) * d13)));
            fArr4[i23] = exp2;
            if (i23 == 0) {
                f17 = f18 + exp2;
            } else {
                f17 = (float) ((exp2 * 2.0d) + f18);
            }
        }
        float f19 = f17;
        for (int i24 = 0; i24 < i11; i24++) {
            fArr4[i24] = fArr4[i24] / f19;
        }
        int min2 = Math.min(i15, 7);
        float[] fArr5 = new float[min2];
        for (int i25 = 0; i25 < min2; i25++) {
            int i26 = i25 * 2;
            int i27 = i26 + 1;
            float f20 = fArr4[i27];
            int i28 = i26 + 2;
            float f21 = fArr4[i28];
            fArr5[i25] = com.google.android.recaptcha.internal.a.y(f21, i28, f20 * i27, f20 + f21);
        }
        StringBuilder sb3 = new StringBuilder("attribute vec4 position;\nattribute vec4 inputTexCoord;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n");
        Locale locale4 = Locale.US;
        sb3.append("varying vec2 blurCoordinates[" + ((min2 * 2) + 1) + "];\n");
        sb3.append("void main()\n{\ngl_Position = position;\nvec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\nblurCoordinates[0] = inputTexCoord.xy;\n");
        for (int i29 = 0; i29 < min2; i29++) {
            int i30 = i29 * 2;
            sb3.append(String.format(Locale.US, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", Integer.valueOf(i30 + 1), Float.valueOf(fArr5[i29]), Integer.valueOf(i30 + 2), Float.valueOf(fArr5[i29])));
        }
        sb3.append("}");
        this.f32760a = sb3.toString();
    }

    public final boolean a() {
        int h = uz.h(35633, this.f32760a);
        int h10 = uz.h(35632, this.f32761b);
        if (h == 0 || h10 == 0) {
            return false;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.f32762c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.f32762c, h10);
        GLES20.glBindAttribLocation(this.f32762c, 0, "position");
        GLES20.glBindAttribLocation(this.f32762c, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.f32762c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f32762c, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.f32762c);
            this.f32762c = 0;
        } else {
            this.d = GLES20.glGetAttribLocation(this.f32762c, "position");
            this.f32763e = GLES20.glGetAttribLocation(this.f32762c, "inputTexCoord");
            this.f32764f = GLES20.glGetUniformLocation(this.f32762c, "sTexture");
            this.f32765g = GLES20.glGetUniformLocation(this.f32762c, "texelWidthOffset");
            this.h = GLES20.glGetUniformLocation(this.f32762c, "texelHeightOffset");
        }
        return true;
    }
}
