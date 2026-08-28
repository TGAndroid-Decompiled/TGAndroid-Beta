package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class k40 {
    public final int f29932a;
    public final int f29933b;
    public final int f29934c;
    public final int d;
    public final int f29935e;
    public final int f29936f;

    public k40(int i9) {
        int a2 = l40.a(35633, R.raw.round_blur_vert);
        this.f29933b = a2;
        int a3 = l40.a(35632, i9);
        this.f29934c = a3;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a3);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(glCreateProgram);
            glCreateProgram = 0;
        }
        this.f29932a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.f29935e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f29936f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f29932a);
        GLES20.glDeleteShader(this.f29933b);
        GLES20.glDeleteShader(this.f29934c);
    }
}
