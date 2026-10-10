package org.telegram.ui.Wallet;

import android.content.Context;
import android.opengl.GLES20;
public final class f5 {
    public final int f34953a;
    public final int f34954b;
    public final int f34955c;
    public final int d;
    public final int f34956e;
    public final int f34957f;
    public final int f34958g;
    public final int h;
    public final int f34959i;
    public final int f34960j;
    public final int f34961k;
    public final int f34962l;
    public final int f34963m;
    public final int f34964n;

    public f5(Context context, String str, String str2, String str3, String str4) {
        int b10 = w7.m7.b(context, "wallet-card-".concat(str3), b(str, str4), b(str2, str4), "aPosition", "aNormal");
        this.f34953a = b10;
        this.f34954b = GLES20.glGetAttribLocation(b10, "aPosition");
        this.f34955c = GLES20.glGetAttribLocation(b10, "aNormal");
        this.d = GLES20.glGetUniformLocation(b10, "uMVPMatrix");
        this.f34956e = GLES20.glGetUniformLocation(b10, "uModelViewMatrix");
        this.f34957f = GLES20.glGetUniformLocation(b10, "uCardGradientRotation");
        int glGetUniformLocation = GLES20.glGetUniformLocation(b10, "uCardDetailTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(b10, "uEngravingTexture");
        this.f34958g = GLES20.glGetUniformLocation(b10, "uEngravingTexel");
        this.h = GLES20.glGetAttribLocation(b10, "aFlecksRegion");
        this.f34959i = GLES20.glGetAttribLocation(b10, "aFlecksCorner");
        this.f34960j = GLES20.glGetUniformLocation(b10, "uFlecksPadding");
        this.f34961k = GLES20.glGetUniformLocation(b10, "uMainLightDirection");
        this.f34962l = GLES20.glGetUniformLocation(b10, "uQrCenter");
        this.f34963m = GLES20.glGetUniformLocation(b10, "uDiamondBounds");
        this.f34964n = GLES20.glGetUniformLocation(b10, "uDiamondAlpha");
        GLES20.glUseProgram(b10);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFinishLut"), 4);
        GLES20.glUniform1i(glGetUniformLocation, 0);
        GLES20.glUniform1i(glGetUniformLocation2, 1);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFlecksTiles"), 2);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFlecksTail"), 3);
    }

    public static String b(String str, String str2) {
        int indexOf = str.indexOf(10) + 1;
        return str.substring(0, indexOf) + str2 + str.substring(indexOf);
    }

    public final void a(float[] fArr, float[] fArr2, float f7, float f10, float f11, float f12) {
        GLES20.glUseProgram(this.f34953a);
        GLES20.glUniform1f(this.f34957f, f11);
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f34956e, 1, false, fArr2, 0);
        GLES20.glUniform3f(this.f34961k, f7, f10, 0.83f);
        GLES20.glUniform2f(this.f34962l, ((336.0f - f12) - 25.0f) / 336.0f, 0.44878048f);
    }
}
