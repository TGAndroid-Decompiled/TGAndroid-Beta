package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class gm0 extends Drawable {
    public static final int f48077j = 0;
    public float f48078a = org.telegram.messenger.g0.N(10.6665f);
    public final boolean f48079b;
    public Paint f48080c;
    public final Paint d;
    public final Paint f48081e;
    public final Paint f48082f;
    public final Path f48083g;
    public final Path h;
    public final org.telegram.ui.Components.n5 f48084i;

    public gm0(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f48081e = paint2;
        Paint paint3 = new Paint(1);
        this.f48082f = paint3;
        this.f48083g = new Path();
        this.h = new Path();
        this.f48079b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.f48084i = null;
        d();
    }

    public static gm0 a(int i7, int i10) {
        org.telegram.messenger.cp cpVar = null;
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.m6.f29608r8;
            return new gm0(org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.m6.x0(null, iArr[i10], false));
        }
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(i7).f25930t4;
        if (dpVar != null) {
            cpVar = dpVar.d(i10);
        }
        return b(cpVar, false);
    }

    public static gm0 b(org.telegram.messenger.cp cpVar, boolean z10) {
        int g10;
        int i7;
        if (cpVar == null) {
            return new gm0(0, 0, 0);
        }
        int f10 = cpVar.f();
        if (z10 && !cpVar.o(org.telegram.ui.ActionBar.m6.I.q())) {
            g10 = cpVar.f();
        } else {
            g10 = cpVar.g();
        }
        if (z10) {
            i7 = cpVar.f();
        } else {
            i7 = cpVar.i();
        }
        return new gm0(f10, g10, i7);
    }

    public static gm0 c(int i7, int i10) {
        org.telegram.messenger.cp d;
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(i7).f25938u4;
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
        float f10 = this.f48078a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f48083g;
        path2.rewind();
        path2.moveTo(this.f48078a * 2.0f, 0.0f);
        float f11 = this.f48078a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f48078a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f48078a, getBounds().centerY() - this.f48078a);
        Paint paint = this.f48080c;
        if (paint != null) {
            float f10 = this.f48078a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f48083g, this.f48081e);
        if (this.f48079b) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f48078a - org.telegram.messenger.g0.L(3.66f), this.f48078a - org.telegram.messenger.g0.L(3.66f), this.f48078a + org.telegram.messenger.g0.L(3.66f), this.f48078a + org.telegram.messenger.g0.L(3.66f));
            float f11 = this.f48078a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.f48082f);
        }
        canvas.restore();
        org.telegram.ui.Components.n5 n5Var = this.f48084i;
        if (n5Var != null) {
            int L = org.telegram.messenger.g0.L(14.0f) / 2;
            n5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            n5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.n5 n5Var = this.f48084i;
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
        if (this.f48080c == null) {
            Paint paint = new Paint(1);
            this.f48080c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f48080c.setStrokeWidth(f10);
        this.f48080c.setColor(i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f48078a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f48078a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public gm0(int i7, int i10, int i11, long j3) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f48081e = paint2;
        Paint paint3 = new Paint(1);
        this.f48082f = paint3;
        this.f48083g = new Path();
        this.h = new Path();
        this.f48079b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(14.0f), null);
        this.f48084i = n5Var;
        n5Var.j(j3, false);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
