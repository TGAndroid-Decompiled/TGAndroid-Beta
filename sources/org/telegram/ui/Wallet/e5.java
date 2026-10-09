package org.telegram.ui.Wallet;

import android.content.Context;
import android.opengl.GLES20;
public final class e5 {
    public final int f34860a;
    public final int f34861b;
    public final int f34862c;
    public final int d;
    public final int f34863e;
    public final int f34864f;
    public final int f34865g;
    public final int h;
    public final int f34866i;
    public final int f34867j;
    public final int f34868k;
    public final int f34869l;
    public final int f34870m;
    public final int f34871n;

    public e5(Context context, String str, String str2, String str3, String str4) {
        int b10 = w7.m7.b(context, "wallet-card-".concat(str3), b(str, str4), b(str2, str4), "aPosition", "aNormal");
        this.f34860a = b10;
        this.f34861b = GLES20.glGetAttribLocation(b10, "aPosition");
        this.f34862c = GLES20.glGetAttribLocation(b10, "aNormal");
        this.d = GLES20.glGetUniformLocation(b10, "uMVPMatrix");
        this.f34863e = GLES20.glGetUniformLocation(b10, "uModelViewMatrix");
        this.f34864f = GLES20.glGetUniformLocation(b10, "uCardGradientRotation");
        int glGetUniformLocation = GLES20.glGetUniformLocation(b10, "uCardDetailTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(b10, "uEngravingTexture");
        this.f34865g = GLES20.glGetUniformLocation(b10, "uEngravingTexel");
        this.h = GLES20.glGetAttribLocation(b10, "aFlecksRegion");
        this.f34866i = GLES20.glGetAttribLocation(b10, "aFlecksCorner");
        this.f34867j = GLES20.glGetUniformLocation(b10, "uFlecksPadding");
        this.f34868k = GLES20.glGetUniformLocation(b10, "uMainLightDirection");
        this.f34869l = GLES20.glGetUniformLocation(b10, "uQrCenter");
        this.f34870m = GLES20.glGetUniformLocation(b10, "uDiamondBounds");
        this.f34871n = GLES20.glGetUniformLocation(b10, "uDiamondAlpha");
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
        GLES20.glUseProgram(this.f34860a);
        GLES20.glUniform1f(this.f34864f, f11);
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f34863e, 1, false, fArr2, 0);
        GLES20.glUniform3f(this.f34868k, f7, f10, 0.83f);
        GLES20.glUniform2f(this.f34869l, ((336.0f - f12) - 25.0f) / 336.0f, 0.44878048f);
    }
}
