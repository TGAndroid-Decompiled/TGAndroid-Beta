package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class t50 {
    public final int f30997a;
    public final int f30998b;
    public final int f30999c;
    public final int d;
    public final int f31000e;
    public final int f31001f;

    public t50(int i10) {
        int a2 = u50.a(35633, R.raw.round_blur_vert);
        this.f30998b = a2;
        int a10 = u50.a(35632, i10);
        this.f30999c = a10;
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
        this.f30997a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.f31000e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f31001f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f30997a);
        GLES20.glDeleteShader(this.f30998b);
        GLES20.glDeleteShader(this.f30999c);
    }
}
