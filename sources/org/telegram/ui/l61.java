package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
public final class l61 implements org.telegram.ui.ActionBar.e6 {
    public org.telegram.ui.ActionBar.e6 f47115a;
    public final SparseIntArray f47116b = new SparseIntArray();
    public final Paint f47117c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f47118e;
    public final TextPaint f47119f;
    public final TextPaint f47120g;
    public final TextPaint h;
    public Bitmap f47121i;
    public BitmapShader f47122j;
    public Matrix f47123k;
    public final l71 f47124l;
    public final l71 f47125m;

    public l61(l71 l71Var) {
        this.f47125m = l71Var;
        this.f47124l = l71Var;
        Paint paint = new Paint(3);
        this.f47118e = paint;
        TextPaint textPaint = new TextPaint();
        this.f47119f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f47120g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.az.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.az.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        d71 d71Var = this.f47125m.f47191r1;
        if (d71Var != null) {
            return d71Var.a();
        }
        d71 d71Var2 = this.f47124l.f47191r1;
        if (d71Var2 != null) {
            return d71Var2.a();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f47115a;
        if (e6Var != null) {
            return e6Var.a();
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i3, int i10) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f47121i;
        if (bitmap != null && (bitmapShader = this.f47122j) != null) {
            org.telegram.ui.ActionBar.k6.s(bitmap, bitmapShader, this.f47123k, i3, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
        }
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.f28211v3;
    }

    @Override
    public final Paint d(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c2 = 0;
                    break;
                }
                break;
            case 561929466:
                if (str.equals("paintChatActionBackground")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c2 = 4;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return this.f47120g;
            case 1:
                return this.f47117c;
            case 2:
                return this.h;
            case 3:
                return this.f47118e;
            case 4:
                return this.d;
            case 5:
                return this.f47119f;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = this.f47115a;
                if (e6Var != null) {
                    return e6Var.d(str);
                }
                return org.telegram.ui.ActionBar.k6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        return org.telegram.messenger.az.H0;
    }

    @Override
    public final int f(int i3) {
        return h(i3);
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f47115a;
        if (e6Var != null) {
            return e6Var.g();
        }
        return org.telegram.ui.ActionBar.k6.d1();
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f47115a;
        if (e6Var != null) {
            return e6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.k6.R0(str);
    }

    @Override
    public final int h(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f47115a;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return org.telegram.ui.ActionBar.k6.v0(i3);
    }

    @Override
    public final int j(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f47115a;
        if (e6Var != null) {
            return e6Var.j(i3);
        }
        return h(i3);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f10) {
        Bitmap bitmap;
        float f11;
        float f12;
        float f13;
        float f14;
        int i3 = org.telegram.ui.ActionBar.k6.Zc;
        int h = h(i3);
        int h7 = h(org.telegram.ui.ActionBar.k6.f27829ad);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.la0;
        TextPaint textPaint = this.f47120g;
        TextPaint textPaint2 = this.f47119f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.az.o() != 0 && org.telegram.messenger.lc.e(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.la0) drawable).f35658k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f47121i != bitmap) {
                this.f47121i = bitmap;
                Bitmap bitmap2 = this.f47121i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f47122j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.f47123k == null) {
                    this.f47123k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.f47121i = null;
            this.f47122j = null;
            int i10 = org.telegram.ui.ActionBar.k6.Wc;
            textPaint2.setColor(h(i10));
            textPaint.setColor(h(i10));
            textPaint2.linkColor = h(org.telegram.ui.ActionBar.k6.Xc);
        }
        Paint paint = this.f47117c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h7);
        if (this.f47122j != null && (this.f47116b.indexOfKey(i3) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f15 = -0.06f;
                if (((org.telegram.ui.Components.la0) drawable).f35664q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (a()) {
                        f14 = 0.97f;
                    } else {
                        f14 = 0.92f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix, f14);
                    if (a()) {
                        f15 = 0.12f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix, f15);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (a()) {
                        f13 = 0.4f;
                    } else {
                        f13 = 0.8f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix, f13);
                    if (a()) {
                        f15 = 0.08f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix, f15);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (a()) {
                    f11 = 0.9f;
                } else {
                    f11 = 0.84f;
                }
                org.telegram.messenger.g0.n2(colorMatrix, f11);
                if (a()) {
                    f12 = -0.04f;
                } else {
                    f12 = 0.06f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f12);
            }
            if (z10) {
                float f16 = ((org.telegram.ui.Components.la0) drawable).f35664q;
                if (f10 != null) {
                    f16 = f10.floatValue();
                }
                if (f16 >= 0.0f) {
                    colorMatrix.setSaturation(1.8f);
                    org.telegram.messenger.g0.n2(colorMatrix, 0.97f);
                    org.telegram.messenger.g0.h(colorMatrix, 0.03f);
                } else {
                    colorMatrix.setSaturation(0.5f);
                    org.telegram.messenger.g0.n2(colorMatrix, 0.35f);
                    org.telegram.messenger.g0.h(colorMatrix, 0.03f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                org.telegram.messenger.g0.n2(colorMatrix, 0.97f);
                org.telegram.messenger.g0.h(colorMatrix, 0.06f);
            }
            paint.setShader(this.f47122j);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f47122j);
            ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
            org.telegram.messenger.g0.n2(colorMatrix2, 0.85f);
            paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            paint2.setAlpha(255);
            return;
        }
        paint.setColorFilter(null);
        paint.setShader(null);
        paint2.setColorFilter(null);
        paint2.setShader(null);
    }

    @Override
    public final void i(int i3, int i10) {
    }
}
