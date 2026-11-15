package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class dm0 extends Drawable {
    public static final int f46427j = 0;
    public float f46428a = org.telegram.messenger.g0.N(10.6665f);
    public final boolean f46429b;
    public Paint f46430c;
    public final Paint d;
    public final Paint f46431e;
    public final Paint f46432f;
    public final Path f46433g;
    public final Path h;
    public final org.telegram.ui.Components.e5 f46434i;

    public dm0(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f46431e = paint2;
        Paint paint3 = new Paint(1);
        this.f46432f = paint3;
        this.f46433g = new Path();
        this.h = new Path();
        this.f46429b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.f46434i = null;
        d();
    }

    public static dm0 a(int i7, int i10) {
        org.telegram.messenger.cp cpVar = null;
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.j6.f29110r8;
            return new dm0(org.telegram.ui.ActionBar.j6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.j6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.j6.x0(null, iArr[i10], false));
        }
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(i7).f25380r4;
        if (dpVar != null) {
            cpVar = dpVar.d(i10);
        }
        return b(cpVar, false);
    }

    public static dm0 b(org.telegram.messenger.cp cpVar, boolean z10) {
        int g10;
        int i7;
        if (cpVar == null) {
            return new dm0(0, 0, 0);
        }
        int f10 = cpVar.f();
        if (z10 && !cpVar.o(org.telegram.ui.ActionBar.j6.I.q())) {
            g10 = cpVar.f();
        } else {
            g10 = cpVar.g();
        }
        if (z10) {
            i7 = cpVar.f();
        } else {
            i7 = cpVar.i();
        }
        return new dm0(f10, g10, i7);
    }

    public static dm0 c(int i7, int i10) {
        org.telegram.messenger.cp d;
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(i7).f25390s4;
        if (dpVar == null) {
            d = null;
        } else {
            d = dpVar.d(i10);
        }
        return b(d, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.f46428a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f46433g;
        path2.rewind();
        path2.moveTo(this.f46428a * 2.0f, 0.0f);
        float f11 = this.f46428a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f46428a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f46428a, getBounds().centerY() - this.f46428a);
        Paint paint = this.f46430c;
        if (paint != null) {
            float f10 = this.f46428a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f46433g, this.f46431e);
        if (this.f46429b) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f46428a - org.telegram.messenger.g0.L(3.66f), this.f46428a - org.telegram.messenger.g0.L(3.66f), this.f46428a + org.telegram.messenger.g0.L(3.66f), this.f46428a + org.telegram.messenger.g0.L(3.66f));
            float f11 = this.f46428a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.f46432f);
        }
        canvas.restore();
        org.telegram.ui.Components.e5 e5Var = this.f46434i;
        if (e5Var != null) {
            int L = org.telegram.messenger.g0.L(14.0f) / 2;
            e5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            e5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.e5 e5Var = this.f46434i;
        if (view == null) {
            if (e5Var != null) {
                e5Var.b();
                e5Var.l(null);
                return;
            }
            return;
        }
        if (e5Var != null) {
            e5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new e5(this, 4));
    }

    public final void f(float f10, int i7) {
        if (this.f46430c == null) {
            Paint paint = new Paint(1);
            this.f46430c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f46430c.setStrokeWidth(f10);
        this.f46430c.setColor(i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f46428a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f46428a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public dm0(int i7, int i10, int i11, long j3) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f46431e = paint2;
        Paint paint3 = new Paint(1);
        this.f46432f = paint3;
        this.f46433g = new Path();
        this.h = new Path();
        this.f46429b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(14.0f), null);
        this.f46434i = e5Var;
        e5Var.j(j3, false);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
