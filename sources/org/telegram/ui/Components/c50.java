package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class c50 {
    public final int f23209a;
    public final int f23210b;
    public final int f23211c;
    public final int d;
    public final int e;
    public final int f23212f;

    public c50(int i10) {
        int a2 = d50.a(35633, R.raw.round_blur_vert);
        this.f23210b = a2;
        int a10 = d50.a(35632, i10);
        this.f23211c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(glCreateProgram);
            glCreateProgram = 0;
        }
        this.f23209a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f23212f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f23209a);
        GLES20.glDeleteShader(this.f23210b);
        GLES20.glDeleteShader(this.f23211c);
    }
}
