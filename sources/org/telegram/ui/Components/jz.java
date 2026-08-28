package org.telegram.ui.Components;

import android.opengl.GLES20;
import java.util.Locale;
public final class jz {
    public final String f29887a;
    public final String f29888b;
    public int f29889c;
    public int d;
    public int f29890e;
    public int f29891f;
    public int f29892g;
    public int h;

    public jz(float f10, float f11, boolean z10) {
        int i9;
        float f12;
        int i10;
        double d = 6.283185307179586d;
        if (z10) {
            f12 = Math.round(f10);
            if (f12 >= 1.0f) {
                double d9 = f12;
                int floor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(d9, 2.0d) * 6.283185307179586d) * 0.00390625f) * Math.pow(d9, 2.0d) * (-2.0d)));
                i9 = (floor % 2) + floor;
            } else {
                i9 = 0;
            }
        } else {
            i9 = (int) f10;
            f12 = f11;
        }
        int i11 = (i9 * 2) + 1;
        float[] fArr = new float[i11];
        int i12 = 0;
        float f13 = 0.0f;
        while (true) {
            i10 = i9 + 1;
            if (i12 >= i10) {
                break;
            }
            double d10 = d;
            double d11 = f12;
            float[] fArr2 = fArr;
            float exp = (float) (Math.exp((-Math.pow(i12, 2.0d)) / (Math.pow(d11, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d11, 2.0d) * d10)));
            fArr2[i12] = exp;
            if (i12 == 0) {
                f13 += exp;
            } else {
                f13 = (float) ((exp * 2.0d) + f13);
            }
            i12++;
            d = d10;
            fArr = fArr2;
        }
        double d12 = d;
        float[] fArr3 = fArr;
        for (int i13 = 0; i13 < i10; i13++) {
            fArr3[i13] = fArr3[i13] / f13;
        }
        int i14 = (i9 % 2) + (i9 / 2);
        int min = Math.min(i14, 7);
        StringBuilder sb2 = new StringBuilder("uniform sampler2D sTexture;\nuniform highp float texelWidthOffset;\nuniform highp float texelHeightOffset;\n");
        Locale locale = Locale.US;
        sb2.append("varying highp vec2 blurCoordinates[" + ((min * 2) + 1) + "];\n");
        sb2.append("void main()\n{\nlowp vec4 sum = vec4(0.0);\n");
        sb2.append(String.format(locale, "sum += texture2D(sTexture, blurCoordinates[0]) * %f;\n", Float.valueOf(fArr3[0])));
        for (int i15 = 0; i15 < min; i15++) {
            int i16 = i15 * 2;
            int i17 = i16 + 1;
            int i18 = i16 + 2;
            float f14 = fArr3[i17] + fArr3[i18];
            Locale locale2 = Locale.US;
            sb2.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i17), Float.valueOf(f14)));
            sb2.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i18), Float.valueOf(f14)));
        }
        if (i14 > min) {
            sb2.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
            while (min < i14) {
                int i19 = min * 2;
                int i20 = i19 + 1;
                float f15 = fArr3[i20];
                int i21 = i19 + 2;
                float f16 = fArr3[i21];
                float f17 = f15 + f16;
                float y10 = e2.c.y(f16, i21, f15 * i20, f17);
                Locale locale3 = Locale.US;
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(y10), Float.valueOf(f17)));
                sb2.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(y10), Float.valueOf(f17)));
                min++;
            }
        }
        sb2.append("gl_FragColor = sum;\n}\n");
        this.f29888b = sb2.toString();
        float[] fArr4 = new float[i11];
        float f18 = 0.0f;
        for (int i22 = 0; i22 < i10; i22++) {
            double d13 = f12;
            float f19 = f18;
            float exp2 = (float) (Math.exp((-Math.pow(i22, 2.0d)) / (Math.pow(d13, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d13, 2.0d) * d12)));
            fArr4[i22] = exp2;
            if (i22 == 0) {
                f18 = f19 + exp2;
            } else {
                f18 = (float) ((exp2 * 2.0d) + f19);
            }
        }
        float f20 = f18;
        for (int i23 = 0; i23 < i10; i23++) {
            fArr4[i23] = fArr4[i23] / f20;
        }
        int min2 = Math.min(i14, 7);
        float[] fArr5 = new float[min2];
        for (int i24 = 0; i24 < min2; i24++) {
            int i25 = i24 * 2;
            int i26 = i25 + 1;
            float f21 = fArr4[i26];
            int i27 = i25 + 2;
            float f22 = fArr4[i27];
            fArr5[i24] = e2.c.y(f22, i27, f21 * i26, f21 + f22);
        }
        StringBuilder sb3 = new StringBuilder("attribute vec4 position;\nattribute vec4 inputTexCoord;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n");
        Locale locale4 = Locale.US;
        sb3.append("varying vec2 blurCoordinates[" + ((min2 * 2) + 1) + "];\n");
        sb3.append("void main()\n{\ngl_Position = position;\nvec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\nblurCoordinates[0] = inputTexCoord.xy;\n");
        for (int i28 = 0; i28 < min2; i28++) {
            int i29 = i28 * 2;
            sb3.append(String.format(Locale.US, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", Integer.valueOf(i29 + 1), Float.valueOf(fArr5[i28]), Integer.valueOf(i29 + 2), Float.valueOf(fArr5[i28])));
        }
        sb3.append("}");
        this.f29887a = sb3.toString();
    }

    public final boolean a() {
        int h = lz.h(35633, this.f29887a);
        int h10 = lz.h(35632, this.f29888b);
        if (h == 0 || h10 == 0) {
            return false;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.f29889c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.f29889c, h10);
        GLES20.glBindAttribLocation(this.f29889c, 0, "position");
        GLES20.glBindAttribLocation(this.f29889c, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.f29889c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f29889c, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.f29889c);
            this.f29889c = 0;
        } else {
            this.d = GLES20.glGetAttribLocation(this.f29889c, "position");
            this.f29890e = GLES20.glGetAttribLocation(this.f29889c, "inputTexCoord");
            this.f29891f = GLES20.glGetUniformLocation(this.f29889c, "sTexture");
            this.f29892g = GLES20.glGetUniformLocation(this.f29889c, "texelWidthOffset");
            this.h = GLES20.glGetUniformLocation(this.f29889c, "texelHeightOffset");
        }
        return true;
    }
}
