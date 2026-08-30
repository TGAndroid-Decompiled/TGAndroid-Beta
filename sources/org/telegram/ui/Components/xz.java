package org.telegram.ui.Components;

import android.opengl.GLES20;
import java.util.Locale;
public final class xz {
    public final String f30794a;
    public final String f30795b;
    public int f30796c;
    public int d;
    public int e;
    public int f30797f;
    public int f30798g;
    public int h;

    public xz(float f10, float f11, boolean z4) {
        int i10;
        float f12;
        int i11;
        double d = 6.283185307179586d;
        if (z4) {
            f12 = Math.round(f10);
            if (f12 >= 1.0f) {
                double d10 = f12;
                int floor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(d10, 2.0d) * 6.283185307179586d) * 0.00390625f) * Math.pow(d10, 2.0d) * (-2.0d)));
                i10 = (floor % 2) + floor;
            } else {
                i10 = 0;
            }
        } else {
            i10 = (int) f10;
            f12 = f11;
        }
        int i12 = (i10 * 2) + 1;
        float[] fArr = new float[i12];
        int i13 = 0;
        float f13 = 0.0f;
        while (true) {
            i11 = i10 + 1;
            if (i13 >= i11) {
                break;
            }
            double d11 = d;
            double d12 = f12;
            float[] fArr2 = fArr;
            float exp = (float) (Math.exp((-Math.pow(i13, 2.0d)) / (Math.pow(d12, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d12, 2.0d) * d11)));
            fArr2[i13] = exp;
            if (i13 == 0) {
                f13 += exp;
            } else {
                f13 = (float) ((exp * 2.0d) + f13);
            }
            i13++;
            d = d11;
            fArr = fArr2;
        }
        double d13 = d;
        float[] fArr3 = fArr;
        for (int i14 = 0; i14 < i11; i14++) {
            fArr3[i14] = fArr3[i14] / f13;
        }
        int i15 = (i10 % 2) + (i10 / 2);
        int min = Math.min(i15, 7);
        StringBuilder sb = new StringBuilder("uniform sampler2D sTexture;\nuniform highp float texelWidthOffset;\nuniform highp float texelHeightOffset;\n");
        Locale locale = Locale.US;
        sb.append("varying highp vec2 blurCoordinates[" + ((min * 2) + 1) + "];\n");
        sb.append("void main()\n{\nlowp vec4 sum = vec4(0.0);\n");
        sb.append(String.format(locale, "sum += texture2D(sTexture, blurCoordinates[0]) * %f;\n", Float.valueOf(fArr3[0])));
        for (int i16 = 0; i16 < min; i16++) {
            int i17 = i16 * 2;
            int i18 = i17 + 1;
            int i19 = i17 + 2;
            float f14 = fArr3[i18] + fArr3[i19];
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i18), Float.valueOf(f14)));
            sb.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i19), Float.valueOf(f14)));
        }
        if (i15 > min) {
            sb.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
            while (min < i15) {
                int i20 = min * 2;
                int i21 = i20 + 1;
                float f15 = fArr3[i21];
                int i22 = i20 + 2;
                float f16 = fArr3[i22];
                float f17 = f15 + f16;
                float v = e2.c.v(f16, i22, f15 * i21, f17);
                Locale locale3 = Locale.US;
                sb.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(v), Float.valueOf(f17)));
                sb.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(v), Float.valueOf(f17)));
                min++;
            }
        }
        sb.append("gl_FragColor = sum;\n}\n");
        this.f30795b = sb.toString();
        float[] fArr4 = new float[i12];
        float f18 = 0.0f;
        for (int i23 = 0; i23 < i11; i23++) {
            double d14 = f12;
            float f19 = f18;
            float exp2 = (float) (Math.exp((-Math.pow(i23, 2.0d)) / (Math.pow(d14, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d14, 2.0d) * d13)));
            fArr4[i23] = exp2;
            if (i23 == 0) {
                f18 = f19 + exp2;
            } else {
                f18 = (float) ((exp2 * 2.0d) + f19);
            }
        }
        float f20 = f18;
        for (int i24 = 0; i24 < i11; i24++) {
            fArr4[i24] = fArr4[i24] / f20;
        }
        int min2 = Math.min(i15, 7);
        float[] fArr5 = new float[min2];
        for (int i25 = 0; i25 < min2; i25++) {
            int i26 = i25 * 2;
            int i27 = i26 + 1;
            float f21 = fArr4[i27];
            int i28 = i26 + 2;
            float f22 = fArr4[i28];
            fArr5[i25] = e2.c.v(f22, i28, f21 * i27, f21 + f22);
        }
        StringBuilder sb2 = new StringBuilder("attribute vec4 position;\nattribute vec4 inputTexCoord;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n");
        Locale locale4 = Locale.US;
        sb2.append("varying vec2 blurCoordinates[" + ((min2 * 2) + 1) + "];\n");
        sb2.append("void main()\n{\ngl_Position = position;\nvec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\nblurCoordinates[0] = inputTexCoord.xy;\n");
        for (int i29 = 0; i29 < min2; i29++) {
            int i30 = i29 * 2;
            sb2.append(String.format(Locale.US, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", Integer.valueOf(i30 + 1), Float.valueOf(fArr5[i29]), Integer.valueOf(i30 + 2), Float.valueOf(fArr5[i29])));
        }
        sb2.append("}");
        this.f30794a = sb2.toString();
    }

    public final boolean a() {
        int h = zz.h(35633, this.f30794a);
        int h9 = zz.h(35632, this.f30795b);
        if (h == 0 || h9 == 0) {
            return false;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.f30796c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.f30796c, h9);
        GLES20.glBindAttribLocation(this.f30796c, 0, "position");
        GLES20.glBindAttribLocation(this.f30796c, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.f30796c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f30796c, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.f30796c);
            this.f30796c = 0;
        } else {
            this.d = GLES20.glGetAttribLocation(this.f30796c, "position");
            this.e = GLES20.glGetAttribLocation(this.f30796c, "inputTexCoord");
            this.f30797f = GLES20.glGetUniformLocation(this.f30796c, "sTexture");
            this.f30798g = GLES20.glGetUniformLocation(this.f30796c, "texelWidthOffset");
            this.h = GLES20.glGetUniformLocation(this.f30796c, "texelHeightOffset");
        }
        return true;
    }
}
