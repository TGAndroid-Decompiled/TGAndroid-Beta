package org.telegram.ui.Components;

import android.opengl.GLES20;
import java.util.Locale;
public final class o00 {
    public final String f29327a;
    public final String f29328b;
    public int f29329c;
    public int d;
    public int f29330e;
    public int f29331f;
    public int f29332g;
    public int h;

    public o00(float f7, float f10, boolean z10) {
        int i10;
        float f11;
        int i11;
        double d = 6.283185307179586d;
        if (z10) {
            f11 = Math.round(f7);
            if (f11 >= 1.0f) {
                double d10 = f11;
                int floor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(d10, 2.0d) * 6.283185307179586d) * 0.00390625f) * Math.pow(d10, 2.0d) * (-2.0d)));
                i10 = (floor % 2) + floor;
            } else {
                i10 = 0;
            }
        } else {
            i10 = (int) f7;
            f11 = f10;
        }
        int i12 = 1;
        int i13 = (i10 * 2) + 1;
        float[] fArr = new float[i13];
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            i11 = i10 + 1;
            if (i14 >= i11) {
                break;
            }
            double d11 = d;
            double d12 = f11;
            int i15 = i12;
            float[] fArr2 = fArr;
            float exp = (float) (Math.exp((-Math.pow(i14, 2.0d)) / (Math.pow(d12, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d12, 2.0d) * d11)));
            fArr2[i14] = exp;
            if (i14 == 0) {
                f12 += exp;
            } else {
                f12 = (float) ((exp * 2.0d) + f12);
            }
            i14++;
            i12 = i15;
            d = d11;
            fArr = fArr2;
        }
        double d13 = d;
        int i16 = i12;
        float[] fArr3 = fArr;
        for (int i17 = 0; i17 < i11; i17++) {
            fArr3[i17] = fArr3[i17] / f12;
        }
        char c10 = 2;
        int i18 = (i10 % 2) + (i10 / 2);
        int min = Math.min(i18, 7);
        StringBuilder sb2 = new StringBuilder("uniform sampler2D sTexture;\nuniform highp float texelWidthOffset;\nuniform highp float texelHeightOffset;\n");
        Locale locale = Locale.US;
        sb2.append("varying highp vec2 blurCoordinates[" + ((min * 2) + 1) + "];\n");
        sb2.append("void main()\n{\nlowp vec4 sum = vec4(0.0);\n");
        Object[] objArr = new Object[i16];
        objArr[0] = Float.valueOf(fArr3[0]);
        sb2.append(String.format(locale, "sum += texture2D(sTexture, blurCoordinates[0]) * %f;\n", objArr));
        for (int i19 = 0; i19 < min; i19++) {
            int i20 = i19 * 2;
            int i21 = i20 + 1;
            int i22 = i20 + 2;
            float f13 = fArr3[i21] + fArr3[i22];
            Locale locale2 = Locale.US;
            sb2.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i21), Float.valueOf(f13)));
            sb2.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i22), Float.valueOf(f13)));
        }
        if (i18 > min) {
            sb2.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
            while (min < i18) {
                int i23 = min * 2;
                int i24 = i23 + 1;
                float f14 = fArr3[i24];
                int i25 = i23 + 2;
                float f15 = fArr3[i25];
                float f16 = f14 + f15;
                float x10 = com.google.android.gms.internal.vision.e2.x(f15, i25, f14 * i24, f16);
                Locale locale3 = Locale.US;
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(x10), Float.valueOf(f16)));
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(x10), Float.valueOf(f16)));
                min++;
            }
        }
        sb2.append("gl_FragColor = sum;\n}\n");
        this.f29328b = sb2.toString();
        float[] fArr4 = new float[i13];
        int i26 = 0;
        float f17 = 0.0f;
        while (i26 < i11) {
            double d14 = f11;
            char c11 = c10;
            float f18 = f17;
            float exp2 = (float) (Math.exp((-Math.pow(i26, 2.0d)) / (Math.pow(d14, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d14, 2.0d) * d13)));
            fArr4[i26] = exp2;
            if (i26 == 0) {
                f17 = f18 + exp2;
            } else {
                f17 = (float) ((exp2 * 2.0d) + f18);
            }
            i26++;
            c10 = c11;
        }
        char c12 = c10;
        float f19 = f17;
        for (int i27 = 0; i27 < i11; i27++) {
            fArr4[i27] = fArr4[i27] / f19;
        }
        int min2 = Math.min(i18, 7);
        float[] fArr5 = new float[min2];
        for (int i28 = 0; i28 < min2; i28++) {
            int i29 = i28 * 2;
            int i30 = i29 + 1;
            float f20 = fArr4[i30];
            int i31 = i29 + 2;
            float f21 = fArr4[i31];
            fArr5[i28] = com.google.android.gms.internal.vision.e2.x(f21, i31, f20 * i30, f20 + f21);
        }
        StringBuilder sb3 = new StringBuilder("attribute vec4 position;\nattribute vec4 inputTexCoord;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n");
        Locale locale4 = Locale.US;
        sb3.append("varying vec2 blurCoordinates[" + ((min2 * 2) + 1) + "];\n");
        sb3.append("void main()\n{\ngl_Position = position;\nvec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\nblurCoordinates[0] = inputTexCoord.xy;\n");
        for (int i32 = 0; i32 < min2; i32++) {
            Locale locale5 = Locale.US;
            int i33 = i32 * 2;
            Integer valueOf = Integer.valueOf(i33 + 1);
            Float valueOf2 = Float.valueOf(fArr5[i32]);
            Integer valueOf3 = Integer.valueOf(i33 + 2);
            Float valueOf4 = Float.valueOf(fArr5[i32]);
            Object[] objArr2 = new Object[4];
            objArr2[0] = valueOf;
            objArr2[1] = valueOf2;
            objArr2[c12] = valueOf3;
            objArr2[3] = valueOf4;
            sb3.append(String.format(locale5, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", objArr2));
        }
        sb3.append("}");
        this.f29327a = sb3.toString();
    }

    public final boolean a() {
        int h = q00.h(35633, this.f29327a);
        int h10 = q00.h(35632, this.f29328b);
        if (h == 0 || h10 == 0) {
            return false;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.f29329c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.f29329c, h10);
        GLES20.glBindAttribLocation(this.f29329c, 0, "position");
        GLES20.glBindAttribLocation(this.f29329c, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.f29329c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f29329c, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.f29329c);
            this.f29329c = 0;
        } else {
            this.d = GLES20.glGetAttribLocation(this.f29329c, "position");
            this.f29330e = GLES20.glGetAttribLocation(this.f29329c, "inputTexCoord");
            this.f29331f = GLES20.glGetUniformLocation(this.f29329c, "sTexture");
            this.f29332g = GLES20.glGetUniformLocation(this.f29329c, "texelWidthOffset");
            this.h = GLES20.glGetUniformLocation(this.f29329c, "texelHeightOffset");
        }
        return true;
    }
}
