package org.telegram.ui.Wallet;

import android.content.Context;
import android.opengl.GLES20;
public final class p5 {
    public float f34708a = 1.0f;
    public final int f34709b;
    public final int f34710c;
    public final int d;
    public final int e;
    public final int f34711f;
    public final int f34712g;
    public final int h;
    public final int f34713i;
    public final int f34714j;
    public final int f34715k;
    public final int f34716l;
    public final int f34717m;
    public final int f34718n;
    public final int f34719o;
    public final int f34720p;
    public final int f34721q;
    public final int f34722r;
    public final int f34723s;
    public final int f34724t;
    public final int f34725u;
    public final int v;
    public final int f34726w;

    public p5(Context context, String str, String str2, String str3, String str4) {
        this.f34709b = -1;
        int b10 = w7.v7.b(context, "wallet-card-".concat(str3), b(str, str4), b(str2, str4), "aPosition", "aNormal");
        this.f34710c = b10;
        this.d = GLES20.glGetUniformLocation(b10, "uStickerPaletteFrom[0]");
        this.e = GLES20.glGetUniformLocation(b10, "uStickerPaletteTo[0]");
        this.f34711f = GLES20.glGetUniformLocation(b10, "uStickerReveal");
        this.f34712g = GLES20.glGetUniformLocation(b10, "uStickerToneScale");
        this.h = GLES20.glGetUniformLocation(b10, "uDiamondTint[0]");
        this.f34713i = GLES20.glGetUniformLocation(b10, "uEngravingInk[0]");
        this.f34714j = GLES20.glGetAttribLocation(b10, "aPosition");
        this.f34715k = GLES20.glGetAttribLocation(b10, "aNormal");
        this.f34716l = GLES20.glGetUniformLocation(b10, "uMVPMatrix");
        this.f34717m = GLES20.glGetUniformLocation(b10, "uModelViewMatrix");
        this.f34719o = GLES20.glGetUniformLocation(b10, "uFinishPixelScale");
        this.f34709b = GLES20.glGetUniformLocation(b10, "uEngravingAlpha");
        this.f34718n = GLES20.glGetUniformLocation(b10, "uCardGradientRotation");
        int glGetUniformLocation = GLES20.glGetUniformLocation(b10, "uCardDetailTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(b10, "uEngravingTexture");
        this.f34720p = GLES20.glGetUniformLocation(b10, "uEngravingTexel");
        this.f34721q = GLES20.glGetAttribLocation(b10, "aFlecksRegion");
        this.f34722r = GLES20.glGetAttribLocation(b10, "aFlecksCorner");
        this.f34723s = GLES20.glGetUniformLocation(b10, "uFlecksPadding");
        this.f34724t = GLES20.glGetUniformLocation(b10, "uMainLightDirection");
        this.f34725u = GLES20.glGetUniformLocation(b10, "uQrCenter");
        this.v = GLES20.glGetUniformLocation(b10, "uDiamondBounds");
        this.f34726w = GLES20.glGetUniformLocation(b10, "uDiamondAlpha");
        GLES20.glUseProgram(b10);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFinishLut"), 4);
        GLES20.glUniform1i(glGetUniformLocation, 0);
        GLES20.glUniform1i(glGetUniformLocation2, 1);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uEngravingNormalTexture"), 5);
        GLES20.glUniform4f(GLES20.glGetUniformLocation(b10, "uEngravingFieldBounds"), 0.875f, 0.0f, 0.125f, 1.0f);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFlecksTiles"), 2);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(b10, "uFlecksTail"), 3);
    }

    public static String b(String str, String str2) {
        int indexOf = str.indexOf(10) + 1;
        return str.substring(0, indexOf) + str2 + str.substring(indexOf);
    }

    public final void a(float[] fArr, float[] fArr2, float f7, float f10, float f11, float f12, float f13) {
        GLES20.glUseProgram(this.f34710c);
        GLES20.glUniform1f(this.f34718n, f11);
        GLES20.glUniform1f(this.f34719o, f13);
        int i10 = this.f34709b;
        if (i10 >= 0) {
            GLES20.glUniform1f(i10, this.f34708a);
        }
        GLES20.glUniformMatrix4fv(this.f34716l, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f34717m, 1, false, fArr2, 0);
        GLES20.glUniform3f(this.f34724t, f7, f10, 0.83f);
        GLES20.glUniform2f(this.f34725u, ((336.0f - f12) - 24.0f) / 336.0f, 0.44878048f);
    }
}
