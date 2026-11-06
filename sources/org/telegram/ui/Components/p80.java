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
    public final TextPaint f36800a;
    public final Paint f36801b;
    public final Paint f36802c;
    public final Paint d;
    public final Paint f36803e;
    public final RectF f36804f;
    public PorterDuffColorFilter f36805g;
    public float h;
    public final DecelerateInterpolator f36806i;
    public boolean f36807j;
    public float f36808k;
    public int f36809l;
    public String f36810m;
    public int f36811n;
    public float f36812o;
    public int f36813p;
    public int f36814q;
    public float f36815r;
    public float f36816s;
    public long f36817t;
    public boolean f36818u;
    public float v;
    public float f36819w;
    public float f36820x;
    public float f36821y;
    public float f36822z;

    public p80() {
        TextPaint textPaint = new TextPaint(1);
        this.f36800a = textPaint;
        Paint paint = new Paint(1);
        this.f36801b = paint;
        this.f36802c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f36803e = paint3;
        this.f36804f = new RectF();
        this.h = 1.0f;
        this.f36806i = new DecelerateInterpolator();
        this.f36808k = 400.0f;
        this.f36809l = -1;
        this.f36812o = 1.0f;
        this.f36815r = 1.0f;
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
        if (this.f36818u) {
            return this.f36815r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f36801b.setColor(i10);
        this.d.setColor(i10);
        this.f36803e.setColor(i10);
        this.f36800a.setColor(i10);
        this.f36805g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z9) {
        int i10;
        int i11;
        if (this.f36813p == i7 && (i11 = this.f36814q) != i7) {
            this.f36813p = i11;
            this.f36815r = 1.0f;
        }
        if (z9) {
            int i12 = this.f36813p;
            if (i12 != i7 && (i10 = this.f36814q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f36808k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f36808k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f36808k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f36808k = 160.0f;
                } else {
                    this.f36808k = 220.0f;
                }
                if (this.f36818u) {
                    this.f36813p = i10;
                }
                this.f36818u = true;
                this.f36814q = i7;
                this.f36816s = this.f36815r;
                this.f36815r = 0.0f;
            } else {
                return;
            }
        } else if (this.f36813p == i7) {
            return;
        } else {
            this.f36818u = false;
            this.f36814q = i7;
            this.f36813p = i7;
            this.f36816s = this.f36815r;
            this.f36815r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f36820x = 0.0f;
            this.f36821y = 0.0f;
            this.f36822z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p80.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9, float f10) {
        if (this.f36819w == f10) {
            return;
        }
        if (!z9) {
            this.f36820x = f10;
            this.f36821y = f10;
        } else {
            if (this.f36820x > f10) {
                this.f36820x = f10;
            }
            this.f36821y = this.f36820x;
        }
        this.f36819w = f10;
        this.f36822z = 0.0f;
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
            ((View) axVar.f31941b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f36801b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36801b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f36803e.setColorFilter(colorFilter);
        this.f36800a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
