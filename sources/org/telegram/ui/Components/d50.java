package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class d50 {
    public final int f24168a;
    public final int f24169b;
    public final int f24170c;
    public final int d;
    public final int e;
    public final int f24171f;

    public d50(int i10) {
        int a2 = e50.a(35633, R.raw.round_blur_vert);
        this.f24169b = a2;
        int a10 = e50.a(35632, i10);
        this.f24170c = a10;
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
        this.f24168a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f24171f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f24168a);
        GLES20.glDeleteShader(this.f24169b);
        GLES20.glDeleteShader(this.f24170c);
    }
}
