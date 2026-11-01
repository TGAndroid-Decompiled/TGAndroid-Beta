package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class mn0 extends Drawable {
    public static final int f39578j = 0;
    public float f39579a = org.telegram.messenger.i0.N(10.6665f);
    public final boolean f39580b;
    public Paint f39581c;
    public final Paint d;
    public final Paint e;
    public final Paint f39582f;
    public final Path f39583g;
    public final Path h;
    public final org.telegram.ui.Components.d5 f39584i;

    public mn0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f39582f = paint3;
        this.f39583g = new Path();
        this.h = new Path();
        this.f39580b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f39584i = null;
        d();
    }

    public static mn0 a(int i10, int i11) {
        org.telegram.messenger.lp lpVar = null;
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.t6.f21189r8;
            return new mn0(org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.t6.x0(null, iArr[i11], false));
        }
        org.telegram.messenger.mp mpVar = org.telegram.messenger.wp.r1(i10).f19231r4;
        if (mpVar != null) {
            lpVar = mpVar.d(i11);
        }
        return b(lpVar, false);
    }

    public static mn0 b(org.telegram.messenger.lp lpVar, boolean z10) {
        int g10;
        int i10;
        if (lpVar == null) {
            return new mn0(0, 0, 0);
        }
        int f7 = lpVar.f();
        if (z10 && !lpVar.o(org.telegram.ui.ActionBar.t6.I.q())) {
            g10 = lpVar.f();
        } else {
            g10 = lpVar.g();
        }
        if (z10) {
            i10 = lpVar.f();
        } else {
            i10 = lpVar.i();
        }
        return new mn0(f7, g10, i10);
    }

    public static mn0 c(int i10, int i11) {
        org.telegram.messenger.lp d;
        org.telegram.messenger.mp mpVar = org.telegram.messenger.wp.r1(i10).f19241s4;
        if (mpVar == null) {
            d = null;
        } else {
            d = mpVar.d(i11);
        }
        return b(d, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f7 = this.f39579a;
        path.addCircle(f7, f7, f7, Path.Direction.CW);
        Path path2 = this.f39583g;
        path2.rewind();
        path2.moveTo(this.f39579a * 2.0f, 0.0f);
        float f10 = this.f39579a;
        path2.lineTo(f10 * 2.0f, f10 * 2.0f);
        path2.lineTo(0.0f, this.f39579a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f39579a, getBounds().centerY() - this.f39579a);
        Paint paint = this.f39581c;
        if (paint != null) {
            float f7 = this.f39579a;
            canvas.drawCircle(f7, f7, f7, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f39583g, this.e);
        if (this.f39580b) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(this.f39579a - org.telegram.messenger.i0.L(3.66f), this.f39579a - org.telegram.messenger.i0.L(3.66f), this.f39579a + org.telegram.messenger.i0.L(3.66f), this.f39579a + org.telegram.messenger.i0.L(3.66f));
            float f10 = this.f39579a;
            canvas.rotate(45.0f, f10, f10);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), this.f39582f);
        }
        canvas.restore();
        org.telegram.ui.Components.d5 d5Var = this.f39584i;
        if (d5Var != null) {
            int L = org.telegram.messenger.i0.L(14.0f) / 2;
            d5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            d5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.d5 d5Var = this.f39584i;
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
        if (this.f39581c == null) {
            Paint paint = new Paint(1);
            this.f39581c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f39581c.setStrokeWidth(f7);
        this.f39581c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f39579a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f39579a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public mn0(int i10, int i11, int i12, long j10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f39582f = paint3;
        this.f39583g = new Path();
        this.h = new Path();
        this.f39580b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(14.0f), null);
        this.f39584i = d5Var;
        d5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
