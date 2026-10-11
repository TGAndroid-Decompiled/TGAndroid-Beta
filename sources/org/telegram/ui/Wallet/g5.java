package org.telegram.ui.Wallet;

import android.content.Context;
import android.opengl.GLES20;
public final class g5 {
    public final int f35016a;
    public final int f35017b;
    public final int f35018c;
    public final int d;
    public final int f35019e;
    public final int f35020f;
    public final int f35021g;
    public final int h;
    public final int f35022i;
    public final int f35023j;
    public final int f35024k;
    public final int f35025l;
    public final int f35026m;
    public final int f35027n;

    public g5(Context context, String str, String str2, String str3, String str4) {
        int b10 = w7.m7.b(context, "wallet-card-".concat(str3), b(str, str4), b(str2, str4), "aPosition", "aNormal");
        this.f35016a = b10;
        this.f35017b = GLES20.glGetAttribLocation(b10, "aPosition");
        this.f35018c = GLES20.glGetAttribLocation(b10, "aNormal");
        this.d = GLES20.glGetUniformLocation(b10, "uMVPMatrix");
        this.f35019e = GLES20.glGetUniformLocation(b10, "uModelViewMatrix");
        this.f35020f = GLES20.glGetUniformLocation(b10, "uCardGradientRotation");
        int glGetUniformLocation = GLES20.glGetUniformLocation(b10, "uCardDetailTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(b10, "uEngravingTexture");
        this.f35021g = GLES20.glGetUniformLocation(b10, "uEngravingTexel");
        this.h = GLES20.glGetAttribLocation(b10, "aFlecksRegion");
        this.f35022i = GLES20.glGetAttribLocation(b10, "aFlecksCorner");
        this.f35023j = GLES20.glGetUniformLocation(b10, "uFlecksPadding");
        this.f35024k = GLES20.glGetUniformLocation(b10, "uMainLightDirection");
        this.f35025l = GLES20.glGetUniformLocation(b10, "uQrCenter");
        this.f35026m = GLES20.glGetUniformLocation(b10, "uDiamondBounds");
        this.f35027n = GLES20.glGetUniformLocation(b10, "uDiamondAlpha");
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
        GLES20.glUseProgram(this.f35016a);
        GLES20.glUniform1f(this.f35020f, f11);
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f35019e, 1, false, fArr2, 0);
        GLES20.glUniform3f(this.f35024k, f7, f10, 0.83f);
        GLES20.glUniform2f(this.f35025l, ((336.0f - f12) - 25.0f) / 336.0f, 0.44878048f);
    }
}
