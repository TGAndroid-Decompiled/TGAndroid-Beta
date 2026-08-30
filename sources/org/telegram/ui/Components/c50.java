package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class c50 {
    public final int f23843a;
    public final int f23844b;
    public final int f23845c;
    public final int d;
    public final int e;
    public final int f23846f;

    public c50(int i10) {
        int a2 = d50.a(35633, R.raw.round_blur_vert);
        this.f23844b = a2;
        int a10 = d50.a(35632, i10);
        this.f23845c = a10;
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
        this.f23843a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f23846f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f23843a);
        GLES20.glDeleteShader(this.f23844b);
        GLES20.glDeleteShader(this.f23845c);
    }
}
