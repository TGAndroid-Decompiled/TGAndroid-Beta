package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public class a50 {
    public final int f24279a;
    public final int f24280b;
    public final int f24281c;
    public final int d;
    public final int f24282e;
    public final int f24283f;

    public a50(int i10) {
        int a2 = b50.a(35633, R.raw.round_blur_vert);
        this.f24280b = a2;
        int a10 = b50.a(35632, i10);
        this.f24281c = a10;
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
        this.f24279a = glCreateProgram;
        this.d = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
        this.f24282e = GLES20.glGetAttribLocation(glCreateProgram, "aTextureCoord");
        this.f24283f = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f24279a);
        GLES20.glDeleteShader(this.f24280b);
        GLES20.glDeleteShader(this.f24281c);
    }
}
