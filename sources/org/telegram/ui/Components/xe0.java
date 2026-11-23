package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
public final class xe0 extends bv0 {
    public boolean f42059a = false;
    public final Paint f42060b = new Paint(1);
    public final int f42061c = org.telegram.messenger.k10.f24968t0;
    public long d = 0;
    public boolean f42062e = false;
    public final RectF f42063f = new RectF();
    public float f42064g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.h6 f42065i;

    public xe0(org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this.h = z10;
        this.f42065i = h6Var;
    }

    @Override
    public final void c(boolean z10) {
        this.f42059a = z10;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.f42062e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        float f10;
        int i10;
        int L = org.telegram.messenger.g0.L(10.0f);
        int L2 = ((org.telegram.messenger.g0.L(18.0f) - L) / 2) + getBounds().top;
        if (!this.f42059a) {
            L2 += org.telegram.messenger.g0.L(1.0f);
        }
        int i11 = L2;
        boolean z10 = this.h;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.m6.f29604p9;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29605pa;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.f42065i);
        Paint paint = this.f42060b;
        paint.setColor(w02);
        RectF rectF = this.f42063f;
        rectF.set(0.0f, i11, L, i11 + L);
        float f11 = this.f42064g;
        float f12 = 0.5f;
        if (f11 < 0.5f) {
            f10 = org.telegram.messenger.o10.y(f11, 0.5f, 1.0f, 35.0f);
        } else {
            f10 = ((f11 - 0.5f) * 35.0f) / 0.5f;
        }
        int i12 = (int) f10;
        int i13 = 0;
        while (i13 < 3) {
            int L3 = org.telegram.messenger.g0.L(9.2f);
            float f13 = f12;
            float f14 = this.f42064g;
            float L4 = (L3 + (org.telegram.messenger.g0.L(5.0f) * i13)) - (org.telegram.messenger.g0.L(5.0f) * f14);
            if (i13 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f14 * 255.0f) / f13)));
            } else if (i13 == 0) {
                if (f14 > f13) {
                    paint.setAlpha((int) ((1.0f - ((f14 - f13) / f13)) * 255.0f));
                } else {
                    paint.setAlpha(255);
                }
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(L4, (L / 2) + i11, org.telegram.messenger.g0.L(1.2f), paint);
            i13++;
            f12 = f13;
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, i12, 360 - (i12 * 2), true, paint);
        if (z10) {
            i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f29661s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        canvas.drawCircle(org.telegram.messenger.g0.L(4.0f), ((L / 2) + i11) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f42064g = 0.0f;
        this.f42062e = false;
    }

    public final void f() {
        if (this.f42062e) {
            if (!org.telegram.messenger.ls.f(this.f42061c).g()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j3 > 50) {
                    j3 = 50;
                }
                if (this.f42064g >= 1.0f) {
                    this.f42064g = 0.0f;
                }
                float f10 = (((float) j3) / 300.0f) + this.f42064g;
                this.f42064g = f10;
                if (f10 > 1.0f) {
                    this.f42064g = 1.0f;
                }
                a();
                return;
            }
            org.telegram.messenger.g0.h3(new hb0(this, 10), 100L);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(20.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void b(int i7) {
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
