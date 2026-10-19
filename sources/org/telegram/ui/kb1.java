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
public final class kb1 implements org.telegram.ui.ActionBar.d6 {
    public org.telegram.ui.ActionBar.d6 f38499a;
    public final SparseIntArray f38500b = new SparseIntArray();
    public final Paint f38501c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f38502f;
    public final TextPaint h;
    public final TextPaint f38503n;
    public Bitmap f38504r;
    public BitmapShader f38505s;
    public Matrix v;
    public final kc1 f38506w;
    public final kc1 f38507x;

    public kb1(kc1 kc1Var) {
        this.f38507x = kc1Var;
        this.f38506w = kc1Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f38502f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f38503n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final int G(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f38499a;
        if (d6Var != null) {
            return d6Var.G(i10);
        }
        return w(i10);
    }

    @Override
    public final boolean a() {
        bc1 bc1Var = this.f38507x.f38553p1;
        if (bc1Var != null) {
            return bc1Var.a();
        }
        bc1 bc1Var2 = this.f38506w.f38553p1;
        if (bc1Var2 != null) {
            return bc1Var2.a();
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f38499a;
        if (d6Var != null) {
            return d6Var.a();
        }
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f7) {
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = org.telegram.ui.ActionBar.h6.f21137lc;
        int w9 = w(i10);
        int w10 = w(org.telegram.ui.ActionBar.h6.f21156mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.wc0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f38502f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.wc0) drawable).f32088k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f38504r != bitmap) {
                this.f38504r = bitmap;
                Bitmap bitmap2 = this.f38504r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f38505s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.f38503n.setColor(-1);
        } else {
            this.f38504r = null;
            this.f38505s = null;
            int i11 = org.telegram.ui.ActionBar.h6.f21081ic;
            textPaint2.setColor(w(i11));
            textPaint.setColor(w(i11));
            textPaint2.linkColor = w(org.telegram.ui.ActionBar.h6.f21100jc);
        }
        Paint paint = this.f38501c;
        paint.setColor(w9);
        Paint paint2 = this.d;
        paint2.setColor(w10);
        if (this.f38505s != null && (this.f38500b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((org.telegram.ui.Components.wc0) drawable).f32094q >= 0.0f) {
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
                float f15 = ((org.telegram.ui.Components.wc0) drawable).f32094q;
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
            paint.setShader(this.f38505s);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f38505s);
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
    public final void d(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f38504r;
        if (bitmap != null && (bitmapShader = this.f38505s) != null) {
            org.telegram.ui.ActionBar.h6.r(bitmap, bitmapShader, this.v, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f38499a;
        if (d6Var != null) {
            return d6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.h6.P0(str);
    }

    @Override
    public final ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.f21317v3;
    }

    @Override
    public final Paint n(String str) {
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
                return this.f38501c;
            case 2:
                return this.f38503n;
            case 3:
                return this.e;
            case 4:
                return this.d;
            case 5:
                return this.f38502f;
            default:
                org.telegram.ui.ActionBar.d6 d6Var = this.f38499a;
                if (d6Var != null) {
                    return d6Var.n(str);
                }
                return org.telegram.ui.ActionBar.h6.T0(str);
        }
    }

    @Override
    public final int r(int i10) {
        return w(i10);
    }

    @Override
    public final boolean s() {
        org.telegram.ui.ActionBar.d6 d6Var = this.f38499a;
        if (d6Var != null) {
            return d6Var.s();
        }
        return org.telegram.ui.ActionBar.h6.b1();
    }

    @Override
    public final int w(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f38499a;
        if (d6Var != null) {
            return d6Var.w(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override
    public final void B(int i10, int i11) {
    }
}
