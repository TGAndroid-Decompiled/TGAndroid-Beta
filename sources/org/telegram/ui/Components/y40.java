package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class y40 {
    public final int f34917a;
    public final int f34918b;
    public final int f34919c;
    public final int d;
    public final int f34920e;
    public final int f34921f;

    public y40(int i10) {
        int a2 = z40.a(35633, R.raw.round_blur_vert);
        this.f34918b = a2;
        int a10 = z40.a(35632, i10);
        this.f34919c = a10;
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
        this.f34917a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.f34920e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f34921f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f34917a);
        GLES20.glDeleteShader(this.f34918b);
        GLES20.glDeleteShader(this.f34919c);
    }
}
