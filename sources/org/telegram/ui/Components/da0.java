package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class da0 extends Drawable {
    public mv A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f23557a;
    public final Paint f23558b;
    public final Paint f23559c;
    public final Paint d;
    public final Paint e;
    public final RectF f23560f;
    public PorterDuffColorFilter f23561g;
    public float h;
    public final DecelerateInterpolator f23562i;
    public boolean f23563j;
    public float f23564k;
    public int f23565l;
    public String f23566m;
    public int f23567n;
    public float f23568o;
    public int f23569p;
    public int f23570q;
    public float f23571r;
    public float f23572s;
    public long f23573t;
    public boolean f23574u;
    public float v;
    public float f23575w;
    public float f23576x;
    public float f23577y;
    public float f23578z;

    public da0() {
        TextPaint textPaint = new TextPaint(1);
        this.f23557a = textPaint;
        Paint paint = new Paint(1);
        this.f23558b = paint;
        this.f23559c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f23560f = new RectF();
        this.h = 1.0f;
        this.f23562i = new DecelerateInterpolator();
        this.f23564k = 400.0f;
        this.f23565l = -1;
        this.f23568o = 1.0f;
        this.f23571r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var = this.B;
        if (d5Var != null && d5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.d5 d5Var2 = this.B;
            Shader shader = d5Var2.f18807a;
            Matrix matrix = d5Var2.f18814k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18821r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18821r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f23574u) {
            return this.f23571r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f23558b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f23557a.setColor(i11);
        this.f23561g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f23569p == i10 && (i12 = this.f23570q) != i10) {
            this.f23569p = i12;
            this.f23571r = 1.0f;
        }
        if (z10) {
            int i13 = this.f23569p;
            if (i13 != i10 && (i11 = this.f23570q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f23564k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f23564k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f23564k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f23564k = 160.0f;
                } else {
                    this.f23564k = 220.0f;
                }
                if (this.f23574u) {
                    this.f23569p = i11;
                }
                this.f23574u = true;
                this.f23570q = i10;
                this.f23572s = this.f23571r;
                this.f23571r = 0.0f;
            } else {
                return;
            }
        } else if (this.f23569p == i10) {
            return;
        } else {
            this.f23574u = false;
            this.f23570q = i10;
            this.f23569p = i10;
            this.f23572s = this.f23571r;
            this.f23571r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f23576x = 0.0f;
            this.f23577y = 0.0f;
            this.f23578z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f23575w == f7) {
            return;
        }
        if (!z10) {
            this.f23576x = f7;
            this.f23577y = f7;
        } else {
            if (this.f23576x > f7) {
                this.f23576x = f7;
            }
            this.f23577y = this.f23576x;
        }
        this.f23575w = f7;
        this.f23578z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        mv mvVar = this.A;
        if (mvVar != null) {
            ((View) mvVar.f26584b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f23558b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23558b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f23557a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
