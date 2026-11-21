package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class gm0 extends Drawable {
    public static final int f48137j = 0;
    public float f48138a = org.telegram.messenger.g0.N(10.6665f);
    public final boolean f48139b;
    public Paint f48140c;
    public final Paint d;
    public final Paint f48141e;
    public final Paint f48142f;
    public final Path f48143g;
    public final Path h;
    public final org.telegram.ui.Components.n5 f48144i;

    public gm0(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f48141e = paint2;
        Paint paint3 = new Paint(1);
        this.f48142f = paint3;
        this.f48143g = new Path();
        this.h = new Path();
        this.f48139b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.f48144i = null;
        d();
    }

    public static gm0 a(int i7, int i10) {
        org.telegram.messenger.bp bpVar = null;
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.m6.f29639r8;
            return new gm0(org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false));
        }
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(i7).f25795t4;
        if (cpVar != null) {
            bpVar = cpVar.d(i10);
        }
        return b(bpVar, false);
    }

    public static gm0 b(org.telegram.messenger.bp bpVar, boolean z10) {
        int g10;
        int i7;
        if (bpVar == null) {
            return new gm0(0, 0, 0);
        }
        int f10 = bpVar.f();
        if (z10 && !bpVar.o(org.telegram.ui.ActionBar.m6.I.q())) {
            g10 = bpVar.f();
        } else {
            g10 = bpVar.g();
        }
        if (z10) {
            i7 = bpVar.f();
        } else {
            i7 = bpVar.i();
        }
        return new gm0(f10, g10, i7);
    }

    public static gm0 c(int i7, int i10) {
        org.telegram.messenger.bp d;
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(i7).f25803u4;
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
        float f10 = this.f48138a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f48143g;
        path2.rewind();
        path2.moveTo(this.f48138a * 2.0f, 0.0f);
        float f11 = this.f48138a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f48138a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f48138a, getBounds().centerY() - this.f48138a);
        Paint paint = this.f48140c;
        if (paint != null) {
            float f10 = this.f48138a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f48143g, this.f48141e);
        if (this.f48139b) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f48138a - org.telegram.messenger.g0.L(3.66f), this.f48138a - org.telegram.messenger.g0.L(3.66f), this.f48138a + org.telegram.messenger.g0.L(3.66f), this.f48138a + org.telegram.messenger.g0.L(3.66f));
            float f11 = this.f48138a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.f48142f);
        }
        canvas.restore();
        org.telegram.ui.Components.n5 n5Var = this.f48144i;
        if (n5Var != null) {
            int L = org.telegram.messenger.g0.L(14.0f) / 2;
            n5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            n5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.n5 n5Var = this.f48144i;
        if (view == null) {
            if (n5Var != null) {
                n5Var.b();
                n5Var.l(null);
                return;
            }
            return;
        }
        if (n5Var != null) {
            n5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new e5(this, 4));
    }

    public final void f(float f10, int i7) {
        if (this.f48140c == null) {
            Paint paint = new Paint(1);
            this.f48140c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f48140c.setStrokeWidth(f10);
        this.f48140c.setColor(i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f48138a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f48138a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public gm0(int i7, int i10, int i11, long j3) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f48141e = paint2;
        Paint paint3 = new Paint(1);
        this.f48142f = paint3;
        this.f48143g = new Path();
        this.h = new Path();
        this.f48139b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(14.0f), null);
        this.f48144i = n5Var;
        n5Var.j(j3, false);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
