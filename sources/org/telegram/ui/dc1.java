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
public final class dc1 implements org.telegram.ui.ActionBar.g6 {
    public org.telegram.ui.ActionBar.g6 f36188a;
    public final SparseIntArray f36189b = new SparseIntArray();
    public final Paint f36190c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f36191e;
    public final TextPaint f36192f;
    public final TextPaint h;
    public final TextPaint f36193n;
    public Bitmap f36194r;
    public BitmapShader f36195s;
    public Matrix v;
    public final ed1 f36196w;
    public final ed1 f36197x;

    public dc1(ed1 ed1Var) {
        this.f36197x = ed1Var;
        this.f36196w = ed1Var;
        Paint paint = new Paint(3);
        this.f36191e = paint;
        TextPaint textPaint = new TextPaint();
        this.f36192f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f36193n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final int B0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f36188a;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override
    public final Paint F(String str) {
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
                return this.f36190c;
            case 2:
                return this.f36193n;
            case 3:
                return this.f36191e;
            case 4:
                return this.d;
            case 5:
                return this.f36192f;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = this.f36188a;
                if (g6Var != null) {
                    return g6Var.F(str);
                }
                return org.telegram.ui.ActionBar.k6.S0(str);
        }
    }

    @Override
    public final int Z0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f36188a;
        if (g6Var != null) {
            return g6Var.Z0(i10);
        }
        return B0(i10);
    }

    @Override
    public final boolean a() {
        vc1 vc1Var = this.f36197x.f36520m1;
        if (vc1Var != null) {
            return vc1Var.a();
        }
        vc1 vc1Var2 = this.f36196w.f36520m1;
        if (vc1Var2 != null) {
            return vc1Var2.a();
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f36188a;
        if (g6Var != null) {
            return g6Var.a();
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f10) {
        Bitmap bitmap;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = org.telegram.ui.ActionBar.k6.f21809lc;
        int B0 = B0(i10);
        int B02 = B0(org.telegram.ui.ActionBar.k6.f21826mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z4 = drawable instanceof org.telegram.ui.Components.fc0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f36192f;
        if ((z4 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z4) {
                bitmap = ((org.telegram.ui.Components.fc0) drawable).f26879k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f36194r != bitmap) {
                this.f36194r = bitmap;
                Bitmap bitmap2 = this.f36194r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f36195s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.f36193n.setColor(-1);
        } else {
            this.f36194r = null;
            this.f36195s = null;
            int i11 = org.telegram.ui.ActionBar.k6.ic;
            textPaint2.setColor(B0(i11));
            textPaint.setColor(B0(i11));
            textPaint2.linkColor = B0(org.telegram.ui.ActionBar.k6.jc);
        }
        Paint paint = this.f36190c;
        paint.setColor(B0);
        Paint paint2 = this.d;
        paint2.setColor(B02);
        if (this.f36195s != null && (this.f36189b.indexOfKey(i10) < 0 || z4 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z4) {
                float f15 = -0.06f;
                if (((org.telegram.ui.Components.fc0) drawable).f26885q >= 0.0f) {
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
            if (z4) {
                float f16 = ((org.telegram.ui.Components.fc0) drawable).f26885q;
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
            paint.setShader(this.f36195s);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f36195s);
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
    public final int e0(int i10) {
        return B0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f36188a;
        if (g6Var != null) {
            return g6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.k6.O0(str);
    }

    @Override
    public final void l(float f10, float f11, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f36194r;
        if (bitmap != null && (bitmapShader = this.f36195s) != null) {
            org.telegram.ui.ActionBar.k6.r(bitmap, bitmapShader, this.v, i10, i11, f10, f11);
        } else {
            org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
        }
    }

    @Override
    public final boolean o0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f36188a;
        if (g6Var != null) {
            return g6Var.o0();
        }
        return org.telegram.ui.ActionBar.k6.a1();
    }

    @Override
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.f21976v3;
    }

    @Override
    public final void J0(int i10, int i11) {
    }
}
