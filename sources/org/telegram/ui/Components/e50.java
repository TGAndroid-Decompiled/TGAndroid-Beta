package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class e50 {
    public final int f26446a;
    public final int f26447b;
    public final int f26448c;
    public final int d;
    public final int f26449e;
    public final int f26450f;

    public e50(int i10) {
        int a2 = f50.a(35633, R.raw.round_blur_vert);
        this.f26447b = a2;
        int a10 = f50.a(35632, i10);
        this.f26448c = a10;
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
        this.f26446a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.f26449e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f26450f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f26446a);
        GLES20.glDeleteShader(this.f26447b);
        GLES20.glDeleteShader(this.f26448c);
    }
}
