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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public final class cd1 implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.c6 f34838a;
    public final SparseIntArray f34839b = new SparseIntArray();
    public final Paint f34840c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f34841f;
    public final TextPaint h;
    public final TextPaint f34842n;
    public Bitmap f34843r;
    public BitmapShader f34844s;
    public Matrix v;
    public final ce1 f34845w;
    public final ce1 f34846x;

    public cd1(ce1 ce1Var) {
        this.f34846x = ce1Var;
        this.f34845w = ce1Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f34841f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f34842n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final int F0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f34838a;
        if (c6Var != null) {
            return c6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override
    public final Paint G(String str) {
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
                return this.h;
            case 1:
                return this.f34840c;
            case 2:
                return this.f34842n;
            case 3:
                return this.e;
            case 4:
                return this.d;
            case 5:
                return this.f34841f;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = this.f34838a;
                if (c6Var != null) {
                    return c6Var.G(str);
                }
                return org.telegram.ui.ActionBar.g6.T0(str);
        }
    }

    @Override
    public final boolean a() {
        td1 td1Var = this.f34846x.f34896p1;
        if (td1Var != null) {
            return td1Var.a();
        }
        td1 td1Var2 = this.f34845w.f34896p1;
        if (td1Var2 != null) {
            return td1Var2.a();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f34838a;
        if (c6Var != null) {
            return c6Var.a();
        }
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f7) {
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = org.telegram.ui.ActionBar.g6.f20051lc;
        int F0 = F0(i10);
        int F02 = F0(org.telegram.ui.ActionBar.g6.f20070mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.cd0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f34841f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.cd0) drawable).f24046k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f34843r != bitmap) {
                this.f34843r = bitmap;
                Bitmap bitmap2 = this.f34843r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f34844s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.f34842n.setColor(-1);
        } else {
            this.f34843r = null;
            this.f34844s = null;
            int i11 = org.telegram.ui.ActionBar.g6.f19995ic;
            textPaint2.setColor(F0(i11));
            textPaint.setColor(F0(i11));
            textPaint2.linkColor = F0(org.telegram.ui.ActionBar.g6.f20014jc);
        }
        Paint paint = this.f34840c;
        paint.setColor(F0);
        Paint paint2 = this.d;
        paint2.setColor(F02);
        if (this.f34844s != null && (this.f34839b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((org.telegram.ui.Components.cd0) drawable).f24052q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (a()) {
                        f13 = 0.97f;
                    } else {
                        f13 = 0.92f;
                    }
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f13);
                    if (a()) {
                        f14 = 0.12f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f14);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (a()) {
                        f12 = 0.4f;
                    } else {
                        f12 = 0.8f;
                    }
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f12);
                    if (a()) {
                        f14 = 0.08f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f14);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (a()) {
                    f10 = 0.9f;
                } else {
                    f10 = 0.84f;
                }
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f10);
                if (a()) {
                    f11 = -0.04f;
                } else {
                    f11 = 0.06f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
            }
            if (z10) {
                float f15 = ((org.telegram.ui.Components.cd0) drawable).f24052q;
                if (f7 != null) {
                    f15 = f7.floatValue();
                }
                if (f15 >= 0.0f) {
                    colorMatrix.setSaturation(1.8f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.97f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.03f);
                } else {
                    colorMatrix.setSaturation(0.5f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.35f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.03f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.97f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.06f);
            }
            paint.setShader(this.f34844s);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f34844s);
            ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.85f);
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
    public final int b0(int i10) {
        return F0(i10);
    }

    @Override
    public final int g1(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f34838a;
        if (c6Var != null) {
            return c6Var.g1(i10);
        }
        return F0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f34838a;
        if (c6Var != null) {
            return c6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.g6.P0(str);
    }

    @Override
    public final void l(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f34843r;
        if (bitmap != null && (bitmapShader = this.f34844s) != null) {
            org.telegram.ui.ActionBar.g6.r(bitmap, bitmapShader, this.v, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public final boolean m0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.f34838a;
        if (c6Var != null) {
            return c6Var.m0();
        }
        return org.telegram.ui.ActionBar.g6.b1();
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.g6.f20230v3;
    }

    @Override
    public final void N0(int i10, int i11) {
    }
}
