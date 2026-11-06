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
public final class p80 extends Drawable {
    public ax A;
    public org.telegram.ui.ActionBar.t4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f36921a;
    public final Paint f36922b;
    public final Paint f36923c;
    public final Paint d;
    public final Paint f36924e;
    public final RectF f36925f;
    public PorterDuffColorFilter f36926g;
    public float h;
    public final DecelerateInterpolator f36927i;
    public boolean f36928j;
    public float f36929k;
    public int f36930l;
    public String f36931m;
    public int f36932n;
    public float f36933o;
    public int f36934p;
    public int f36935q;
    public float f36936r;
    public float f36937s;
    public long f36938t;
    public boolean f36939u;
    public float v;
    public float f36940w;
    public float f36941x;
    public float f36942y;
    public float f36943z;

    public p80() {
        TextPaint textPaint = new TextPaint(1);
        this.f36921a = textPaint;
        Paint paint = new Paint(1);
        this.f36922b = paint;
        this.f36923c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f36924e = paint3;
        this.f36925f = new RectF();
        this.h = 1.0f;
        this.f36927i = new DecelerateInterpolator();
        this.f36929k = 400.0f;
        this.f36930l = -1;
        this.f36933o = 1.0f;
        this.f36936r = 1.0f;
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

    public final void a(boolean z9) {
        org.telegram.ui.ActionBar.t4 t4Var = this.B;
        if (t4Var != null && t4Var.m() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.t4 t4Var2 = this.B;
            Shader shader = t4Var2.f28506a;
            Matrix matrix = t4Var2.f28514k;
            matrix.reset();
            this.B.a();
            if (z9) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f28521r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f28521r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f36939u) {
            return this.f36936r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f36922b.setColor(i10);
        this.d.setColor(i10);
        this.f36924e.setColor(i10);
        this.f36921a.setColor(i10);
        this.f36926g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z9) {
        int i10;
        int i11;
        if (this.f36934p == i7 && (i11 = this.f36935q) != i7) {
            this.f36934p = i11;
            this.f36936r = 1.0f;
        }
        if (z9) {
            int i12 = this.f36934p;
            if (i12 != i7 && (i10 = this.f36935q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f36929k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f36929k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f36929k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f36929k = 160.0f;
                } else {
                    this.f36929k = 220.0f;
                }
                if (this.f36939u) {
                    this.f36934p = i10;
                }
                this.f36939u = true;
                this.f36935q = i7;
                this.f36937s = this.f36936r;
                this.f36936r = 0.0f;
            } else {
                return;
            }
        } else if (this.f36934p == i7) {
            return;
        } else {
            this.f36939u = false;
            this.f36935q = i7;
            this.f36934p = i7;
            this.f36937s = this.f36936r;
            this.f36936r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f36941x = 0.0f;
            this.f36942y = 0.0f;
            this.f36943z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p80.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9, float f10) {
        if (this.f36940w == f10) {
            return;
        }
        if (!z9) {
            this.f36941x = f10;
            this.f36942y = f10;
        } else {
            if (this.f36941x > f10) {
                this.f36941x = f10;
            }
            this.f36942y = this.f36941x;
        }
        this.f36940w = f10;
        this.f36943z = 0.0f;
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
        ax axVar = this.A;
        if (axVar != null) {
            ((View) axVar.f31929b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f36922b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36922b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f36924e.setColorFilter(colorFilter);
        this.f36921a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
