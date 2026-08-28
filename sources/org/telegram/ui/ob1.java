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
public final class ob1 implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.b6 f41043a;
    public final SparseIntArray f41044b = new SparseIntArray();
    public final Paint f41045c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f41046e;
    public final TextPaint f41047f;
    public final TextPaint h;
    public final TextPaint f41048n;
    public Bitmap f41049r;
    public BitmapShader f41050s;
    public Matrix v;
    public final oc1 f41051w;
    public final oc1 f41052x;

    public ob1(oc1 oc1Var) {
        this.f41052x = oc1Var;
        this.f41051w = oc1Var;
        Paint paint = new Paint(3);
        this.f41046e = paint;
        TextPaint textPaint = new TextPaint();
        this.f41047f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f41048n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.f23317v3;
    }

    @Override
    public final int N0(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f41043a;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override
    public final Paint O(String str) {
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
                return this.f41045c;
            case 2:
                return this.f41048n;
            case 3:
                return this.f41046e;
            case 4:
                return this.d;
            case 5:
                return this.f41047f;
            default:
                org.telegram.ui.ActionBar.b6 b6Var = this.f41043a;
                if (b6Var != null) {
                    return b6Var.O(str);
                }
                return org.telegram.ui.ActionBar.f6.S0(str);
        }
    }

    @Override
    public final boolean a() {
        fc1 fc1Var = this.f41052x.l1;
        if (fc1Var != null) {
            return fc1Var.a();
        }
        fc1 fc1Var2 = this.f41051w.l1;
        if (fc1Var2 != null) {
            return fc1Var2.a();
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f41043a;
        if (b6Var != null) {
            return b6Var.a();
        }
        return org.telegram.ui.ActionBar.f6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f10) {
        Bitmap bitmap;
        float f11;
        float f12;
        float f13;
        float f14;
        int i9 = org.telegram.ui.ActionBar.f6.f23150lc;
        int N0 = N0(i9);
        int N02 = N0(org.telegram.ui.ActionBar.f6.f23167mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.jb0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f41047f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.jb0) drawable).f29698k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f41049r != bitmap) {
                this.f41049r = bitmap;
                Bitmap bitmap2 = this.f41049r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f41050s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.f41048n.setColor(-1);
        } else {
            this.f41049r = null;
            this.f41050s = null;
            int i10 = org.telegram.ui.ActionBar.f6.f23097ic;
            textPaint2.setColor(N0(i10));
            textPaint.setColor(N0(i10));
            textPaint2.linkColor = N0(org.telegram.ui.ActionBar.f6.jc);
        }
        Paint paint = this.f41045c;
        paint.setColor(N0);
        Paint paint2 = this.d;
        paint2.setColor(N02);
        if (this.f41050s != null && (this.f41044b.indexOfKey(i9) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f15 = -0.06f;
                if (((org.telegram.ui.Components.jb0) drawable).f29704q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (a()) {
                        f14 = 0.97f;
                    } else {
                        f14 = 0.92f;
                    }
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f14);
                    if (a()) {
                        f15 = 0.12f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f15);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (a()) {
                        f13 = 0.4f;
                    } else {
                        f13 = 0.8f;
                    }
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f13);
                    if (a()) {
                        f15 = 0.08f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f15);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (a()) {
                    f11 = 0.9f;
                } else {
                    f11 = 0.84f;
                }
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f11);
                if (a()) {
                    f12 = -0.04f;
                } else {
                    f12 = 0.06f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f12);
            }
            if (z10) {
                float f16 = ((org.telegram.ui.Components.jb0) drawable).f29704q;
                if (f10 != null) {
                    f16 = f10.floatValue();
                }
                if (f16 >= 0.0f) {
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
            paint.setShader(this.f41050s);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f41050s);
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
        org.telegram.ui.ActionBar.b6 b6Var = this.f41043a;
        if (b6Var != null) {
            return b6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.f6.O0(str);
    }

    @Override
    public final void o(float f10, float f11, int i9, int i10) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f41049r;
        if (bitmap != null && (bitmapShader = this.f41050s) != null) {
            org.telegram.ui.ActionBar.f6.r(bitmap, bitmapShader, this.v, i9, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
        }
    }

    @Override
    public final int p0(int i9) {
        return N0(i9);
    }

    @Override
    public final int q1(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f41043a;
        if (b6Var != null) {
            return b6Var.q1(i9);
        }
        return N0(i9);
    }

    @Override
    public final boolean t0() {
        org.telegram.ui.ActionBar.b6 b6Var = this.f41043a;
        if (b6Var != null) {
            return b6Var.t0();
        }
        return org.telegram.ui.ActionBar.f6.a1();
    }

    @Override
    public final void c1(int i9, int i10) {
    }
}
