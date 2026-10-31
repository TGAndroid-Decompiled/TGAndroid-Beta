package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
public final class lf0 extends qv0 {
    public boolean f28101a = false;
    public final Paint f28102b = new Paint(1);
    public final int f28103c = org.telegram.messenger.d20.f15147s0;
    public long d = 0;
    public boolean e = false;
    public final RectF f28104f = new RectF();
    public float f28105g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.p6 f28106i;

    public lf0(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this.h = z10;
        this.f28106i = p6Var;
    }

    @Override
    public final void c(boolean z10) {
        this.f28101a = z10;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f7;
        int i11;
        int L = org.telegram.messenger.i0.L(10.0f);
        int L2 = ((org.telegram.messenger.i0.L(18.0f) - L) / 2) + getBounds().top;
        if (!this.f28101a) {
            L2 += org.telegram.messenger.i0.L(1.0f);
        }
        int i12 = L2;
        boolean z10 = this.h;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.t6.p9;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21155pa;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.f28106i);
        Paint paint = this.f28102b;
        paint.setColor(w02);
        RectF rectF = this.f28104f;
        rectF.set(0.0f, i12, L, i12 + L);
        float f10 = this.f28105g;
        float f11 = 0.5f;
        if (f10 < 0.5f) {
            f7 = org.telegram.messenger.z20.x(f10, 0.5f, 1.0f, 35.0f);
        } else {
            f7 = ((f10 - 0.5f) * 35.0f) / 0.5f;
        }
        int i13 = (int) f7;
        int i14 = 0;
        while (i14 < 3) {
            int L3 = org.telegram.messenger.i0.L(9.2f);
            float f12 = f11;
            float f13 = this.f28105g;
            float L4 = (L3 + (org.telegram.messenger.i0.L(5.0f) * i14)) - (org.telegram.messenger.i0.L(5.0f) * f13);
            if (i14 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f13 * 255.0f) / f12)));
            } else if (i14 == 0) {
                if (f13 > f12) {
                    paint.setAlpha((int) ((1.0f - ((f13 - f12) / f12)) * 255.0f));
                } else {
                    paint.setAlpha(255);
                }
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(L4, (L / 2) + i12, org.telegram.messenger.i0.L(1.2f), paint);
            i14++;
            f11 = f12;
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, i13, 360 - (i13 * 2), true, paint);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f21206s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        canvas.drawCircle(org.telegram.messenger.i0.L(4.0f), ((L / 2) + i12) - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f28105g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (!org.telegram.messenger.zs.f(this.f28103c).g()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j10 > 50) {
                    j10 = 50;
                }
                if (this.f28105g >= 1.0f) {
                    this.f28105g = 0.0f;
                }
                float f7 = (((float) j10) / 300.0f) + this.f28105g;
                this.f28105g = f7;
                if (f7 > 1.0f) {
                    this.f28105g = 1.0f;
                }
                a();
                return;
            }
            org.telegram.messenger.i0.h3(new eb0(this, 13), 100L);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(20.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void b(int i10) {
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
