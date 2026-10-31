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
public final class n81 implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.ActionBar.p6 f39868a;
    public final SparseIntArray f39869b = new SparseIntArray();
    public final Paint f39870c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f39871f;
    public final TextPaint f39872g;
    public final TextPaint h;
    public Bitmap f39873i;
    public BitmapShader f39874j;
    public Matrix f39875k;
    public final m91 f39876l;
    public final m91 f39877m;

    public n81(m91 m91Var) {
        this.f39877m = m91Var;
        this.f39876l = m91Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f39871f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f39872g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.i0.L(Math.max(16, org.telegram.messenger.tz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, org.telegram.messenger.tz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        e91 e91Var = this.f39877m.f39583q1;
        if (e91Var != null) {
            return e91Var.a();
        }
        e91 e91Var2 = this.f39876l.f39583q1;
        if (e91Var2 != null) {
            return e91Var2.a();
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f39868a;
        if (p6Var != null) {
            return p6Var.a();
        }
        return org.telegram.ui.ActionBar.t6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f39873i;
        if (bitmap != null && (bitmapShader = this.f39874j) != null) {
            org.telegram.ui.ActionBar.t6.s(bitmap, bitmapShader, this.f39875k, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
        }
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.t6.f21256v3;
    }

    @Override
    public final Paint d(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c10 = 0;
                    break;
                }
                break;
            case 561929466:
                if (str.equals("paintChatActionBackground")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return this.f39872g;
            case 1:
                return this.f39870c;
            case 2:
                return this.h;
            case 3:
                return this.e;
            case 4:
                return this.d;
            case 5:
                return this.f39871f;
            default:
                org.telegram.ui.ActionBar.p6 p6Var = this.f39868a;
                if (p6Var != null) {
                    return p6Var.d(str);
                }
                return org.telegram.ui.ActionBar.t6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        return org.telegram.messenger.tz.H0;
    }

    @Override
    public final int f(int i10) {
        return h(i10);
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f39868a;
        if (p6Var != null) {
            return p6Var.g();
        }
        return org.telegram.ui.ActionBar.t6.d1();
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f39868a;
        if (p6Var != null) {
            return p6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.t6.R0(str);
    }

    @Override
    public final int h(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f39868a;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return org.telegram.ui.ActionBar.t6.v0(i10);
    }

    @Override
    public final int j(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f39868a;
        if (p6Var != null) {
            return p6Var.j(i10);
        }
        return h(i10);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f7) {
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = org.telegram.ui.ActionBar.t6.Zc;
        int h = h(i10);
        int h10 = h(org.telegram.ui.ActionBar.t6.f20878ad);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.jb0;
        TextPaint textPaint = this.f39872g;
        TextPaint textPaint2 = this.f39871f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.tz.o() != 0 && org.telegram.messenger.sc.e(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.jb0) drawable).f27287k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f39873i != bitmap) {
                this.f39873i = bitmap;
                Bitmap bitmap2 = this.f39873i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f39874j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.f39875k == null) {
                    this.f39875k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.f39873i = null;
            this.f39874j = null;
            int i11 = org.telegram.ui.ActionBar.t6.Wc;
            textPaint2.setColor(h(i11));
            textPaint.setColor(h(i11));
            textPaint2.linkColor = h(org.telegram.ui.ActionBar.t6.Xc);
        }
        Paint paint = this.f39870c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h10);
        if (this.f39874j != null && (this.f39869b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((org.telegram.ui.Components.jb0) drawable).f27293q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (a()) {
                        f13 = 0.97f;
                    } else {
                        f13 = 0.92f;
                    }
                    org.telegram.messenger.i0.n2(colorMatrix, f13);
                    if (a()) {
                        f14 = 0.12f;
                    }
                    org.telegram.messenger.i0.h(colorMatrix, f14);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (a()) {
                        f12 = 0.4f;
                    } else {
                        f12 = 0.8f;
                    }
                    org.telegram.messenger.i0.n2(colorMatrix, f12);
                    if (a()) {
                        f14 = 0.08f;
                    }
                    org.telegram.messenger.i0.h(colorMatrix, f14);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (a()) {
                    f10 = 0.9f;
                } else {
                    f10 = 0.84f;
                }
                org.telegram.messenger.i0.n2(colorMatrix, f10);
                if (a()) {
                    f11 = -0.04f;
                } else {
                    f11 = 0.06f;
                }
                org.telegram.messenger.i0.h(colorMatrix, f11);
            }
            if (z10) {
                float f15 = ((org.telegram.ui.Components.jb0) drawable).f27293q;
                if (f7 != null) {
                    f15 = f7.floatValue();
                }
                if (f15 >= 0.0f) {
                    colorMatrix.setSaturation(1.8f);
                    org.telegram.messenger.i0.n2(colorMatrix, 0.97f);
                    org.telegram.messenger.i0.h(colorMatrix, 0.03f);
                } else {
                    colorMatrix.setSaturation(0.5f);
                    org.telegram.messenger.i0.n2(colorMatrix, 0.35f);
                    org.telegram.messenger.i0.h(colorMatrix, 0.03f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                org.telegram.messenger.i0.n2(colorMatrix, 0.97f);
                org.telegram.messenger.i0.h(colorMatrix, 0.06f);
            }
            paint.setShader(this.f39874j);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f39874j);
            ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
            org.telegram.messenger.i0.n2(colorMatrix2, 0.85f);
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
    public final void i(int i10, int i11) {
    }
}
