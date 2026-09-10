package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class k50 {
    public final int f24609a;
    public final int f24610b;
    public final int f24611c;
    public final int d;
    public final int e;
    public final int f24612f;

    public k50(int i10) {
        int a2 = l50.a(35633, R.raw.round_blur_vert);
        this.f24610b = a2;
        int a10 = l50.a(35632, i10);
        this.f24611c = a10;
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
        this.f24609a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f24612f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f24609a);
        GLES20.glDeleteShader(this.f24610b);
        GLES20.glDeleteShader(this.f24611c);
    }
}
