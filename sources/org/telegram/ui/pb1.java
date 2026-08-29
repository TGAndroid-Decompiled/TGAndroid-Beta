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
public final class pb1 implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.c6 f41354a;
    public final SparseIntArray f41355b = new SparseIntArray();
    public final Paint f41356c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f41357e;
    public final TextPaint f41358f;
    public final TextPaint h;
    public final TextPaint f41359n;
    public Bitmap f41360r;
    public BitmapShader f41361s;
    public Matrix v;
    public final qc1 f41362w;
    public final qc1 f41363x;

    public pb1(qc1 qc1Var) {
        this.f41363x = qc1Var;
        this.f41362w = qc1Var;
        Paint paint = new Paint(3);
        this.f41357e = paint;
        TextPaint textPaint = new TextPaint();
        this.f41358f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f41359n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.f23380v3;
    }

    @Override
    public final int C0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f41354a;
        if (c6Var != null) {
            return c6Var.C0(i10);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public final Paint G(String str) {
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c3 = 0;
                    break;
                }
                break;
            case 561929466:
                if (str.equals("paintChatActionBackground")) {
                    c3 = 1;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c3 = 2;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c3 = 4;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c3 = 5;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return this.h;
            case 1:
                return this.f41356c;
            case 2:
                return this.f41359n;
            case 3:
                return this.f41357e;
            case 4:
                return this.d;
            case 5:
                return this.f41358f;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = this.f41354a;
                if (c6Var != null) {
                    return c6Var.G(str);
                }
                return org.telegram.ui.ActionBar.g6.S0(str);
        }
    }

    @Override
    public final boolean a() {
        hc1 hc1Var = this.f41363x.l1;
        if (hc1Var != null) {
            return hc1Var.a();
        }
        hc1 hc1Var2 = this.f41362w.l1;
        if (hc1Var2 != null) {
            return hc1Var2.a();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f41354a;
        if (c6Var != null) {
            return c6Var.a();
        }
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f9) {
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = org.telegram.ui.ActionBar.g6.lc;
        int C0 = C0(i10);
        int C02 = C0(org.telegram.ui.ActionBar.g6.f23228mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.yb0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f41358f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.yb0) drawable).f35026k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f41360r != bitmap) {
                this.f41360r = bitmap;
                Bitmap bitmap2 = this.f41360r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f41361s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.f41359n.setColor(-1);
        } else {
            this.f41360r = null;
            this.f41361s = null;
            int i11 = org.telegram.ui.ActionBar.g6.f23158ic;
            textPaint2.setColor(C0(i11));
            textPaint.setColor(C0(i11));
            textPaint2.linkColor = C0(org.telegram.ui.ActionBar.g6.f23176jc);
        }
        Paint paint = this.f41356c;
        paint.setColor(C0);
        Paint paint2 = this.d;
        paint2.setColor(C02);
        if (this.f41361s != null && (this.f41355b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((org.telegram.ui.Components.yb0) drawable).f35032q >= 0.0f) {
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
                float f15 = ((org.telegram.ui.Components.yb0) drawable).f35032q;
                if (f9 != null) {
                    f15 = f9.floatValue();
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
            paint.setShader(this.f41361s);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f41361s);
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
    public final int g1(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f41354a;
        if (c6Var != null) {
            return c6Var.g1(i10);
        }
        return C0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f41354a;
        if (c6Var != null) {
            return c6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override
    public final int h0(int i10) {
        return C0(i10);
    }

    @Override
    public final void l(float f9, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f41360r;
        if (bitmap != null && (bitmapShader = this.f41361s) != null) {
            org.telegram.ui.ActionBar.g6.r(bitmap, bitmapShader, this.v, i10, i11, f9, f10);
        } else {
            org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
        }
    }

    @Override
    public final boolean l0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.f41354a;
        if (c6Var != null) {
            return c6Var.l0();
        }
        return org.telegram.ui.ActionBar.g6.a1();
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
