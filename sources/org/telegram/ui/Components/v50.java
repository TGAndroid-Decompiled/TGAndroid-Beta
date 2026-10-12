package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class v50 {
    public final int f31399a;
    public final int f31400b;
    public final int f31401c;
    public final int d;
    public final int f31402e;
    public final int f31403f;

    public v50(int i10) {
        int a2 = w50.a(35633, R.raw.round_blur_vert);
        this.f31400b = a2;
        int a10 = w50.a(35632, i10);
        this.f31401c = a10;
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
        this.f31399a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.f31402e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f31403f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f31399a);
        GLES20.glDeleteShader(this.f31400b);
        GLES20.glDeleteShader(this.f31401c);
    }
}
