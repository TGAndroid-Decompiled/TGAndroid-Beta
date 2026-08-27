package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;

public class p40 {

    public final int f31497a;

    public final int f31498b;

    public final int f31499c;
    public final int d;

    public final int f31500e;

    public final int f31501f;

    public p40(int i10) {
        int iA = q40.a(35633, R.raw.round_blur_vert);
        this.f31498b = iA;
        int iA2 = q40.a(35632, i10);
        this.f31499c = iA2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iA);
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(iGlCreateProgram);
            iGlCreateProgram = 0;
        }
        this.f31497a = iGlCreateProgram;
        this.d = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        this.f31500e = GLES20.glGetAttribLocation(iGlCreateProgram, "aTextureCoord");
        this.f31501f = GLES20.glGetUniformLocation(iGlCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f31497a);
        GLES20.glDeleteShader(this.f31498b);
        GLES20.glDeleteShader(this.f31499c);
    }
}
