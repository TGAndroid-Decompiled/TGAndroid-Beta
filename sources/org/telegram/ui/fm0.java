package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class fm0 extends Drawable {
    public static final int f45796j = 0;
    public float f45797a = org.telegram.messenger.g0.N(10.6665f);
    public final boolean f45798b;
    public Paint f45799c;
    public final Paint d;
    public final Paint f45800e;
    public final Paint f45801f;
    public final Path f45802g;
    public final Path h;
    public final org.telegram.ui.Components.f5 f45803i;

    public fm0(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f45800e = paint2;
        Paint paint3 = new Paint(1);
        this.f45801f = paint3;
        this.f45802g = new Path();
        this.h = new Path();
        this.f45798b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.f45803i = null;
        d();
    }

    public static fm0 a(int i7, int i10) {
        org.telegram.messenger.fp fpVar = null;
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.m6.f28151r8;
            return new fm0(org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false));
        }
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(i7).f24878q4;
        if (gpVar != null) {
            fpVar = gpVar.d(i10);
        }
        return b(fpVar, false);
    }

    public static fm0 b(org.telegram.messenger.fp fpVar, boolean z9) {
        int g10;
        int i7;
        if (fpVar == null) {
            return new fm0(0, 0, 0);
        }
        int f10 = fpVar.f();
        if (z9 && !fpVar.o(org.telegram.ui.ActionBar.m6.I.q())) {
            g10 = fpVar.f();
        } else {
            g10 = fpVar.g();
        }
        if (z9) {
            i7 = fpVar.f();
        } else {
            i7 = fpVar.i();
        }
        return new fm0(f10, g10, i7);
    }

    public static fm0 c(int i7, int i10) {
        org.telegram.messenger.fp d;
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(i7).f24888r4;
        if (gpVar == null) {
            d = null;
        } else {
            d = gpVar.d(i10);
        }
        return b(d, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.f45797a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f45802g;
        path2.rewind();
        path2.moveTo(this.f45797a * 2.0f, 0.0f);
        float f11 = this.f45797a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f45797a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f45797a, getBounds().centerY() - this.f45797a);
        Paint paint = this.f45799c;
        if (paint != null) {
            float f10 = this.f45797a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f45802g, this.f45800e);
        if (this.f45798b) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f45797a - org.telegram.messenger.g0.L(3.66f), this.f45797a - org.telegram.messenger.g0.L(3.66f), this.f45797a + org.telegram.messenger.g0.L(3.66f), this.f45797a + org.telegram.messenger.g0.L(3.66f));
            float f11 = this.f45797a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.f45801f);
        }
        canvas.restore();
        org.telegram.ui.Components.f5 f5Var = this.f45803i;
        if (f5Var != null) {
            int L = org.telegram.messenger.g0.L(14.0f) / 2;
            f5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            f5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.f5 f5Var = this.f45803i;
        if (view == null) {
            if (f5Var != null) {
                f5Var.b();
                f5Var.l(null);
                return;
            }
            return;
        }
        if (f5Var != null) {
            f5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new e5(this, 4));
    }

    public final void f(float f10, int i7) {
        if (this.f45799c == null) {
            Paint paint = new Paint(1);
            this.f45799c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f45799c.setStrokeWidth(f10);
        this.f45799c.setColor(i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f45797a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f45797a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public fm0(int i7, int i10, int i11, long j3) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f45800e = paint2;
        Paint paint3 = new Paint(1);
        this.f45801f = paint3;
        this.f45802g = new Path();
        this.h = new Path();
        this.f45798b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(14.0f), null);
        this.f45803i = f5Var;
        f5Var.j(j3, false);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
