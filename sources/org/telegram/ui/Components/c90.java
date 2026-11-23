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
public final class c90 extends Drawable {
    public hy A;
    public org.telegram.ui.ActionBar.u4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f33972a;
    public final Paint f33973b;
    public final Paint f33974c;
    public final Paint d;
    public final Paint f33975e;
    public final RectF f33976f;
    public PorterDuffColorFilter f33977g;
    public float h;
    public final DecelerateInterpolator f33978i;
    public boolean f33979j;
    public float f33980k;
    public int f33981l;
    public String f33982m;
    public int f33983n;
    public float f33984o;
    public int f33985p;
    public int f33986q;
    public float f33987r;
    public float f33988s;
    public long f33989t;
    public boolean f33990u;
    public float v;
    public float f33991w;
    public float f33992x;
    public float f33993y;
    public float f33994z;

    public c90() {
        TextPaint textPaint = new TextPaint(1);
        this.f33972a = textPaint;
        Paint paint = new Paint(1);
        this.f33973b = paint;
        this.f33974c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f33975e = paint3;
        this.f33976f = new RectF();
        this.h = 1.0f;
        this.f33978i = new DecelerateInterpolator();
        this.f33980k = 400.0f;
        this.f33981l = -1;
        this.f33984o = 1.0f;
        this.f33987r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.u4 u4Var = this.B;
        if (u4Var != null && u4Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.u4 u4Var2 = this.B;
            Shader shader = u4Var2.f30140a;
            Matrix matrix = u4Var2.f30148k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f30155r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f30155r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f33990u) {
            return this.f33987r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f33973b.setColor(i10);
        this.d.setColor(i10);
        this.f33975e.setColor(i10);
        this.f33972a.setColor(i10);
        this.f33977g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z10) {
        int i10;
        int i11;
        if (this.f33985p == i7 && (i11 = this.f33986q) != i7) {
            this.f33985p = i11;
            this.f33987r = 1.0f;
        }
        if (z10) {
            int i12 = this.f33985p;
            if (i12 != i7 && (i10 = this.f33986q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f33980k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f33980k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f33980k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f33980k = 160.0f;
                } else {
                    this.f33980k = 220.0f;
                }
                if (this.f33990u) {
                    this.f33985p = i10;
                }
                this.f33990u = true;
                this.f33986q = i7;
                this.f33988s = this.f33987r;
                this.f33987r = 0.0f;
            } else {
                return;
            }
        } else if (this.f33985p == i7) {
            return;
        } else {
            this.f33990u = false;
            this.f33986q = i7;
            this.f33985p = i7;
            this.f33988s = this.f33987r;
            this.f33987r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f33992x = 0.0f;
            this.f33993y = 0.0f;
            this.f33994z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c90.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10, float f10) {
        if (this.f33991w == f10) {
            return;
        }
        if (!z10) {
            this.f33992x = f10;
            this.f33993y = f10;
        } else {
            if (this.f33992x > f10) {
                this.f33992x = f10;
            }
            this.f33993y = this.f33992x;
        }
        this.f33991w = f10;
        this.f33994z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        hy hyVar = this.A;
        if (hyVar != null) {
            ((View) hyVar.f35848b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f33973b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33973b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f33975e.setColorFilter(colorFilter);
        this.f33972a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
