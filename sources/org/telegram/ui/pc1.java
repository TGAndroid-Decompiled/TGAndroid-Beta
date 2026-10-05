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
public final class pc1 implements org.telegram.ui.ActionBar.d6 {
    public org.telegram.ui.ActionBar.d6 f39473a;
    public final SparseIntArray f39474b = new SparseIntArray();
    public final Paint f39475c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f39476e;
    public final TextPaint f39477f;
    public final TextPaint h;
    public final TextPaint f39478n;
    public Bitmap f39479r;
    public BitmapShader f39480s;
    public Matrix v;
    public final pd1 f39481w;
    public final pd1 f39482x;

    public pc1(pd1 pd1Var) {
        this.f39482x = pd1Var;
        this.f39481w = pd1Var;
        Paint paint = new Paint(3);
        this.f39476e = paint;
        TextPaint textPaint = new TextPaint();
        this.f39477f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f39478n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final Paint H(String str) {
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
                return this.f39475c;
            case 2:
                return this.f39478n;
            case 3:
                return this.f39476e;
            case 4:
                return this.d;
            case 5:
                return this.f39477f;
            default:
                org.telegram.ui.ActionBar.d6 d6Var = this.f39473a;
                if (d6Var != null) {
                    return d6Var.H(str);
                }
                return org.telegram.ui.ActionBar.i6.S0(str);
        }
    }

    @Override
    public final int H0(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f39473a;
        if (d6Var != null) {
            return d6Var.H0(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        gd1 gd1Var = this.f39482x.f39531p1;
        if (gd1Var != null) {
            return gd1Var.a();
        }
        gd1 gd1Var2 = this.f39481w.f39531p1;
        if (gd1Var2 != null) {
            return gd1Var2.a();
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f39473a;
        if (d6Var != null) {
            return d6Var.a();
        }
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f7) {
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = org.telegram.ui.ActionBar.i6.f20980lc;
        int H0 = H0(i10);
        int H02 = H0(org.telegram.ui.ActionBar.i6.f20999mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.pc0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f39477f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.pc0) drawable).f29711k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f39479r != bitmap) {
                this.f39479r = bitmap;
                Bitmap bitmap2 = this.f39479r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f39480s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.f39478n.setColor(-1);
        } else {
            this.f39479r = null;
            this.f39480s = null;
            int i11 = org.telegram.ui.ActionBar.i6.f20924ic;
            textPaint2.setColor(H0(i11));
            textPaint.setColor(H0(i11));
            textPaint2.linkColor = H0(org.telegram.ui.ActionBar.i6.f20942jc);
        }
        Paint paint = this.f39475c;
        paint.setColor(H0);
        Paint paint2 = this.d;
        paint2.setColor(H02);
        if (this.f39480s != null && (this.f39474b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((org.telegram.ui.Components.pc0) drawable).f29717q >= 0.0f) {
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
                float f15 = ((org.telegram.ui.Components.pc0) drawable).f29717q;
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
            paint.setShader(this.f39480s);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f39480s);
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
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f39473a;
        if (d6Var != null) {
            return d6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public final int j0(int i10) {
        return H0(i10);
    }

    @Override
    public final int j1(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.f39473a;
        if (d6Var != null) {
            return d6Var.j1(i10);
        }
        return H0(i10);
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f39479r;
        if (bitmap != null && (bitmapShader = this.f39480s) != null) {
            org.telegram.ui.ActionBar.i6.r(bitmap, bitmapShader, this.v, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public final boolean r0() {
        org.telegram.ui.ActionBar.d6 d6Var = this.f39473a;
        if (d6Var != null) {
            return d6Var.r0();
        }
        return org.telegram.ui.ActionBar.i6.a1();
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21159v3;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
