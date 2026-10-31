package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class on0 extends Drawable {
    public static final int f40307j = 0;
    public float f40308a = org.telegram.messenger.i0.N(10.6665f);
    public final boolean f40309b;
    public Paint f40310c;
    public final Paint d;
    public final Paint e;
    public final Paint f40311f;
    public final Path f40312g;
    public final Path h;
    public final org.telegram.ui.Components.d5 f40313i;

    public on0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f40311f = paint3;
        this.f40312g = new Path();
        this.h = new Path();
        this.f40309b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f40313i = null;
        d();
    }

    public static on0 a(int i10, int i11) {
        org.telegram.messenger.kp kpVar = null;
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.t6.f21188r8;
            return new on0(org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false));
        }
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(i10).f18888r4;
        if (lpVar != null) {
            kpVar = lpVar.d(i11);
        }
        return b(kpVar, false);
    }

    public static on0 b(org.telegram.messenger.kp kpVar, boolean z10) {
        int g10;
        int i10;
        if (kpVar == null) {
            return new on0(0, 0, 0);
        }
        int f7 = kpVar.f();
        if (z10 && !kpVar.o(org.telegram.ui.ActionBar.t6.I.q())) {
            g10 = kpVar.f();
        } else {
            g10 = kpVar.g();
        }
        if (z10) {
            i10 = kpVar.f();
        } else {
            i10 = kpVar.i();
        }
        return new on0(f7, g10, i10);
    }

    public static on0 c(int i10, int i11) {
        org.telegram.messenger.kp d;
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(i10).f18898s4;
        if (lpVar == null) {
            d = null;
        } else {
            d = lpVar.d(i11);
        }
        return b(d, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f7 = this.f40308a;
        path.addCircle(f7, f7, f7, Path.Direction.CW);
        Path path2 = this.f40312g;
        path2.rewind();
        path2.moveTo(this.f40308a * 2.0f, 0.0f);
        float f10 = this.f40308a;
        path2.lineTo(f10 * 2.0f, f10 * 2.0f);
        path2.lineTo(0.0f, this.f40308a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f40308a, getBounds().centerY() - this.f40308a);
        Paint paint = this.f40310c;
        if (paint != null) {
            float f7 = this.f40308a;
            canvas.drawCircle(f7, f7, f7, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f40312g, this.e);
        if (this.f40309b) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(this.f40308a - org.telegram.messenger.i0.L(3.66f), this.f40308a - org.telegram.messenger.i0.L(3.66f), this.f40308a + org.telegram.messenger.i0.L(3.66f), this.f40308a + org.telegram.messenger.i0.L(3.66f));
            float f10 = this.f40308a;
            canvas.rotate(45.0f, f10, f10);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), this.f40311f);
        }
        canvas.restore();
        org.telegram.ui.Components.d5 d5Var = this.f40313i;
        if (d5Var != null) {
            int L = org.telegram.messenger.i0.L(14.0f) / 2;
            d5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            d5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.d5 d5Var = this.f40313i;
        if (view == null) {
            if (d5Var != null) {
                d5Var.b();
                d5Var.l(null);
                return;
            }
            return;
        }
        if (d5Var != null) {
            d5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new d5(this, 4));
    }

    public final void f(float f7, int i10) {
        if (this.f40310c == null) {
            Paint paint = new Paint(1);
            this.f40310c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f40310c.setStrokeWidth(f7);
        this.f40310c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f40308a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f40308a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public on0(int i10, int i11, int i12, long j10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f40311f = paint3;
        this.f40312g = new Path();
        this.h = new Path();
        this.f40309b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(14.0f), null);
        this.f40313i = d5Var;
        d5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
