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
public final class l81 implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.ActionBar.p6 f39139a;
    public final SparseIntArray f39140b = new SparseIntArray();
    public final Paint f39141c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f39142f;
    public final TextPaint f39143g;
    public final TextPaint h;
    public Bitmap f39144i;
    public BitmapShader f39145j;
    public Matrix f39146k;
    public final k91 f39147l;
    public final k91 f39148m;

    public l81(k91 k91Var) {
        this.f39148m = k91Var;
        this.f39147l = k91Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f39142f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f39143g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.i0.L(Math.max(16, org.telegram.messenger.uz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, org.telegram.messenger.uz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        c91 c91Var = this.f39148m.f38758q1;
        if (c91Var != null) {
            return c91Var.a();
        }
        c91 c91Var2 = this.f39147l.f38758q1;
        if (c91Var2 != null) {
            return c91Var2.a();
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f39139a;
        if (p6Var != null) {
            return p6Var.a();
        }
        return org.telegram.ui.ActionBar.t6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f39144i;
        if (bitmap != null && (bitmapShader = this.f39145j) != null) {
            org.telegram.ui.ActionBar.t6.s(bitmap, bitmapShader, this.f39146k, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
        }
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.t6.f21257v3;
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
                return this.f39143g;
            case 1:
                return this.f39141c;
            case 2:
                return this.h;
            case 3:
                return this.e;
            case 4:
                return this.d;
            case 5:
                return this.f39142f;
            default:
                org.telegram.ui.ActionBar.p6 p6Var = this.f39139a;
                if (p6Var != null) {
                    return p6Var.d(str);
                }
                return org.telegram.ui.ActionBar.t6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        return org.telegram.messenger.uz.H0;
    }

    @Override
    public final int f(int i10) {
        return h(i10);
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f39139a;
        if (p6Var != null) {
            return p6Var.g();
        }
        return org.telegram.ui.ActionBar.t6.d1();
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f39139a;
        if (p6Var != null) {
            return p6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.t6.R0(str);
    }

    @Override
    public final int h(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f39139a;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return org.telegram.ui.ActionBar.t6.v0(i10);
    }

    @Override
    public final int j(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f39139a;
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
        int h10 = h(org.telegram.ui.ActionBar.t6.f20879ad);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.jb0;
        TextPaint textPaint = this.f39143g;
        TextPaint textPaint2 = this.f39142f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.uz.o() != 0 && org.telegram.messenger.tc.e(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.jb0) drawable).f27342k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f39144i != bitmap) {
                this.f39144i = bitmap;
                Bitmap bitmap2 = this.f39144i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f39145j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.f39146k == null) {
                    this.f39146k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.f39144i = null;
            this.f39145j = null;
            int i11 = org.telegram.ui.ActionBar.t6.Wc;
            textPaint2.setColor(h(i11));
            textPaint.setColor(h(i11));
            textPaint2.linkColor = h(org.telegram.ui.ActionBar.t6.Xc);
        }
        Paint paint = this.f39141c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h10);
        if (this.f39145j != null && (this.f39140b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((org.telegram.ui.Components.jb0) drawable).f27348q >= 0.0f) {
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
                float f15 = ((org.telegram.ui.Components.jb0) drawable).f27348q;
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
            paint.setShader(this.f39145j);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f39145j);
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
