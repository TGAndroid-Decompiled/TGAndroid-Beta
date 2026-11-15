package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class em0 extends Drawable {
    public static final int f46860j = 0;
    public float f46861a = org.telegram.messenger.g0.N(10.6665f);
    public final boolean f46862b;
    public Paint f46863c;
    public final Paint d;
    public final Paint f46864e;
    public final Paint f46865f;
    public final Path f46866g;
    public final Path h;
    public final org.telegram.ui.Components.e5 f46867i;

    public em0(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f46864e = paint2;
        Paint paint3 = new Paint(1);
        this.f46865f = paint3;
        this.f46866g = new Path();
        this.h = new Path();
        this.f46862b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.f46867i = null;
        d();
    }

    public static em0 a(int i7, int i10) {
        org.telegram.messenger.cp cpVar = null;
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.j6.f29110r8;
            return new em0(org.telegram.ui.ActionBar.j6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.j6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.j6.x0(null, iArr[i10], false));
        }
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(i7).f25383r4;
        if (dpVar != null) {
            cpVar = dpVar.d(i10);
        }
        return b(cpVar, false);
    }

    public static em0 b(org.telegram.messenger.cp cpVar, boolean z10) {
        int g10;
        int i7;
        if (cpVar == null) {
            return new em0(0, 0, 0);
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
        return new em0(f10, g10, i7);
    }

    public static em0 c(int i7, int i10) {
        org.telegram.messenger.cp d;
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(i7).f25393s4;
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
        float f10 = this.f46861a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f46866g;
        path2.rewind();
        path2.moveTo(this.f46861a * 2.0f, 0.0f);
        float f11 = this.f46861a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f46861a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f46861a, getBounds().centerY() - this.f46861a);
        Paint paint = this.f46863c;
        if (paint != null) {
            float f10 = this.f46861a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f46866g, this.f46864e);
        if (this.f46862b) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f46861a - org.telegram.messenger.g0.L(3.66f), this.f46861a - org.telegram.messenger.g0.L(3.66f), this.f46861a + org.telegram.messenger.g0.L(3.66f), this.f46861a + org.telegram.messenger.g0.L(3.66f));
            float f11 = this.f46861a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.f46865f);
        }
        canvas.restore();
        org.telegram.ui.Components.e5 e5Var = this.f46867i;
        if (e5Var != null) {
            int L = org.telegram.messenger.g0.L(14.0f) / 2;
            e5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            e5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.e5 e5Var = this.f46867i;
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
        if (this.f46863c == null) {
            Paint paint = new Paint(1);
            this.f46863c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f46863c.setStrokeWidth(f10);
        this.f46863c.setColor(i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f46861a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f46861a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public em0(int i7, int i10, int i11, long j3) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f46864e = paint2;
        Paint paint3 = new Paint(1);
        this.f46865f = paint3;
        this.f46866g = new Path();
        this.h = new Path();
        this.f46862b = i11 != i7;
        paint.setColor(i7);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(14.0f), null);
        this.f46867i = e5Var;
        e5Var.j(j3, false);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
