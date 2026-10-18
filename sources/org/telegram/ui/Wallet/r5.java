package org.telegram.ui.Wallet;

import android.content.Context;
import android.opengl.GLES20;
public final class r5 {
    public float f34830a = 1.0f;
    public final int f34831b;
    public final int f34832c;
    public final int d;
    public final int e;
    public final int f34833f;
    public final int f34834g;
    public final int h;
    public final int f34835i;
    public final int f34836j;
    public final int f34837k;
    public final int f34838l;
    public final int f34839m;
    public final int f34840n;
    public final int f34841o;
    public final int f34842p;
    public final int f34843q;
    public final int f34844r;
    public final int f34845s;
    public final int f34846t;
    public final int f34847u;
    public final int v;
    public final int f34848w;

    public r5(Context context, String str, String str2, String str3, String str4) {
        this.f34831b = -1;
        int b10 = w7.v7.b(context, "wallet-card-".concat(str3), b(str, str4), b(str2, str4), "aPosition", "aNormal");
        this.f34832c = b10;
        this.d = GLES20.glGetUniformLocation(b10, "uStickerPaletteFrom[0]");
        this.e = GLES20.glGetUniformLocation(b10, "uStickerPaletteTo[0]");
        this.f34833f = GLES20.glGetUniformLocation(b10, "uStickerReveal");
        this.f34834g = GLES20.glGetUniformLocation(b10, "uStickerToneScale");
        this.h = GLES20.glGetUniformLocation(b10, "uDiamondTint[0]");
        this.f34835i = GLES20.glGetUniformLocation(b10, "uEngravingInk[0]");
        this.f34836j = GLES20.glGetAttribLocation(b10, "aPosition");
        this.f34837k = GLES20.glGetAttribLocation(b10, "aNormal");
        this.f34838l = GLES20.glGetUniformLocation(b10, "uMVPMatrix");
        this.f34839m = GLES20.glGetUniformLocation(b10, "uModelViewMatrix");
        this.f34841o = GLES20.glGetUniformLocation(b10, "uFinishPixelScale");
        this.f34831b = GLES20.glGetUniformLocation(b10, "uEngravingAlpha");
        this.f34840n = GLES20.glGetUniformLocation(b10, "uCardGradientRotation");
        int glGetUniformLocation = GLES20.glGetUniformLocation(b10, "uCardDetailTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(b10, "uEngravingTexture");
        this.f34842p = GLES20.glGetUniformLocation(b10, "uEngravingTexel");
        this.f34843q = GLES20.glGetAttribLocation(b10, "aFlecksRegion");
        this.f34844r = GLES20.glGetAttribLocation(b10, "aFlecksCorner");
        this.f34845s = GLES20.glGetUniformLocation(b10, "uFlecksPadding");
        this.f34846t = GLES20.glGetUniformLocation(b10, "uMainLightDirection");
        this.f34847u = GLES20.glGetUniformLocation(b10, "uQrCenter");
        this.v = GLES20.glGetUniformLocation(b10, "uDiamondBounds");
        this.f34848w = GLES20.glGetUniformLocation(b10, "uDiamondAlpha");
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
        GLES20.glUseProgram(this.f34832c);
        GLES20.glUniform1f(this.f34840n, f11);
        GLES20.glUniform1f(this.f34841o, f13);
        int i10 = this.f34831b;
        if (i10 >= 0) {
            GLES20.glUniform1f(i10, this.f34830a);
        }
        GLES20.glUniformMatrix4fv(this.f34838l, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f34839m, 1, false, fArr2, 0);
        GLES20.glUniform3f(this.f34846t, f7, f10, 0.83f);
        GLES20.glUniform2f(this.f34847u, ((336.0f - f12) - 24.0f) / 336.0f, 0.44878048f);
    }
}
