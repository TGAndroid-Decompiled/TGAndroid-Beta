package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class em0 extends Drawable {
    public static final int f47578j = 0;
    public float f47579a = org.telegram.messenger.g0.N(10.6665f);
    public final boolean f47580b;
    public Paint f47581c;
    public final Paint d;
    public final Paint f47582e;
    public final Paint f47583f;
    public final Path f47584g;
    public final Path h;
    public final org.telegram.ui.Components.m5 f47585i;

    public em0(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f47582e = paint2;
        Paint paint3 = new Paint(1);
        this.f47583f = paint3;
        this.f47584g = new Path();
        this.h = new Path();
        this.f47580b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.f47585i = null;
        d();
    }

    public static em0 a(int i7, int i10) {
        org.telegram.messenger.bp bpVar = null;
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.n6.f29712r8;
            return new em0(org.telegram.ui.ActionBar.n6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.n6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.n6.x0(null, iArr[i10], false));
        }
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(i7).f25862t4;
        if (cpVar != null) {
            bpVar = cpVar.d(i10);
        }
        return b(bpVar, false);
    }

    public static em0 b(org.telegram.messenger.bp bpVar, boolean z10) {
        int g10;
        int i7;
        if (bpVar == null) {
            return new em0(0, 0, 0);
        }
        int f10 = bpVar.f();
        if (z10 && !bpVar.o(org.telegram.ui.ActionBar.n6.I.q())) {
            g10 = bpVar.f();
        } else {
            g10 = bpVar.g();
        }
        if (z10) {
            i7 = bpVar.f();
        } else {
            i7 = bpVar.i();
        }
        return new em0(f10, g10, i7);
    }

    public static em0 c(int i7, int i10) {
        org.telegram.messenger.bp d;
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(i7).f25870u4;
        if (cpVar == null) {
            d = null;
        } else {
            d = cpVar.d(i10);
        }
        return b(d, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.f47579a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f47584g;
        path2.rewind();
        path2.moveTo(this.f47579a * 2.0f, 0.0f);
        float f11 = this.f47579a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f47579a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f47579a, getBounds().centerY() - this.f47579a);
        Paint paint = this.f47581c;
        if (paint != null) {
            float f10 = this.f47579a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f47584g, this.f47582e);
        if (this.f47580b) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f47579a - org.telegram.messenger.g0.L(3.66f), this.f47579a - org.telegram.messenger.g0.L(3.66f), this.f47579a + org.telegram.messenger.g0.L(3.66f), this.f47579a + org.telegram.messenger.g0.L(3.66f));
            float f11 = this.f47579a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.f47583f);
        }
        canvas.restore();
        org.telegram.ui.Components.m5 m5Var = this.f47585i;
        if (m5Var != null) {
            int L = org.telegram.messenger.g0.L(14.0f) / 2;
            m5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            m5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.m5 m5Var = this.f47585i;
        if (view == null) {
            if (m5Var != null) {
                m5Var.b();
                m5Var.l(null);
                return;
            }
            return;
        }
        if (m5Var != null) {
            m5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new e5(this, 4));
    }

    public final void f(float f10, int i7) {
        if (this.f47581c == null) {
            Paint paint = new Paint(1);
            this.f47581c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f47581c.setStrokeWidth(f10);
        this.f47581c.setColor(i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f47579a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f47579a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public em0(int i7, int i10, int i11, long j3) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f47582e = paint2;
        Paint paint3 = new Paint(1);
        this.f47583f = paint3;
        this.f47584g = new Path();
        this.h = new Path();
        this.f47580b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(14.0f), null);
        this.f47585i = m5Var;
        m5Var.j(j3, false);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
