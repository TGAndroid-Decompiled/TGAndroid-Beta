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

public final class mb1 implements org.telegram.ui.ActionBar.c6 {

    public org.telegram.ui.ActionBar.c6 f40429a;

    public final SparseIntArray f40430b = new SparseIntArray();

    public final Paint f40431c = new Paint(3);
    public final Paint d = new Paint(3);

    public final Paint f40432e;

    public final TextPaint f40433f;
    public final TextPaint h;

    public final TextPaint f40434n;

    public Bitmap f40435r;

    public BitmapShader f40436s;
    public Matrix v;

    public final nc1 f40437w;

    public final nc1 f40438x;

    public mb1(nc1 nc1Var) {
        this.f40438x = nc1Var;
        this.f40437w = nc1Var;
        Paint paint = new Paint(3);
        this.f40432e = paint;
        TextPaint textPaint = new TextPaint();
        this.f40433f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f40434n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.f23371v3;
    }

    @Override
    public final Paint N(String str) {
        str.getClass();
        switch (str) {
            case "paintChatActionText2":
                return this.h;
            case "paintChatActionBackground":
                return this.f40431c;
            case "paintChatBotButton":
                return this.f40434n;
            case "paintChatActionBackgroundDarken":
                return this.f40432e;
            case "paintChatActionBackgroundSelected":
                return this.d;
            case "paintChatActionText":
                return this.f40433f;
            default:
                org.telegram.ui.ActionBar.c6 c6Var = this.f40429a;
                return c6Var != null ? c6Var.N(str) : org.telegram.ui.ActionBar.g6.S0(str);
        }
    }

    @Override
    public final int N0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f40429a;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        ec1 ec1Var = this.f40438x.l1;
        if (ec1Var != null) {
            return ec1Var.a();
        }
        ec1 ec1Var2 = this.f40437w.l1;
        if (ec1Var2 != null) {
            return ec1Var2.a();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f40429a;
        return c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f10) {
        Bitmap bitmap;
        int i10 = org.telegram.ui.ActionBar.g6.f23203lc;
        int iN0 = N0(i10);
        int iN1 = N0(org.telegram.ui.ActionBar.g6.f23221mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.nb0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f40433f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.nb0) drawable).f30929k;
            } else {
                bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            }
            if (this.f40435r != bitmap) {
                this.f40435r = bitmap;
                Bitmap bitmap2 = this.f40435r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f40436s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.f40434n.setColor(-1);
        } else {
            this.f40435r = null;
            this.f40436s = null;
            int i11 = org.telegram.ui.ActionBar.g6.f23150ic;
            textPaint2.setColor(N0(i11));
            textPaint.setColor(N0(i11));
            textPaint2.linkColor = N0(org.telegram.ui.ActionBar.g6.f23168jc);
        }
        Paint paint = this.f40431c;
        paint.setColor(iN0);
        Paint paint2 = this.d;
        paint2.setColor(iN1);
        if (this.f40436s == null || !(this.f40430b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z10) {
            if (((org.telegram.ui.Components.nb0) drawable).f30935q >= 0.0f) {
                colorMatrix.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, a() ? 0.97f : 0.92f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, a() ? 0.12f : -0.06f);
            } else {
                colorMatrix.setSaturation(1.1f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, a() ? 0.4f : 0.8f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, a() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, a() ? 0.9f : 0.84f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, a() ? -0.04f : 0.06f);
        }
        if (z10) {
            float fFloatValue = ((org.telegram.ui.Components.nb0) drawable).f30935q;
            if (f10 != null) {
                fFloatValue = f10.floatValue();
            }
            if (fFloatValue >= 0.0f) {
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
        paint.setShader(this.f40436s);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(255);
        paint2.setShader(this.f40436s);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(255);
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f40429a;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override
    public final void m(float f10, float f11, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f40435r;
        if (bitmap == null || (bitmapShader = this.f40436s) == null) {
            org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.r(bitmap, bitmapShader, this.v, i10, i11, f10, f11);
        }
    }

    @Override
    public final int o1(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f40429a;
        return c6Var != null ? c6Var.o1(i10) : N0(i10);
    }

    @Override
    public final int q0(int i10) {
        return N0(i10);
    }

    @Override
    public final boolean u0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.f40429a;
        return c6Var != null ? c6Var.u0() : org.telegram.ui.ActionBar.g6.a1();
    }

    @Override
    public final void c1(int i10, int i11) {
    }
}
