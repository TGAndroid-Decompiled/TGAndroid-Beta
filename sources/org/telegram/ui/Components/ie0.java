package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
public final class ie0 extends pu0 {
    public boolean f34595a = false;
    public final Paint f34596b = new Paint(1);
    public final int f34597c = org.telegram.messenger.p10.f24474s0;
    public long d = 0;
    public boolean f34598e = false;
    public final RectF f34599f = new RectF();
    public float f34600g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.h6 f34601i;

    public ie0(org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        this.h = z9;
        this.f34601i = h6Var;
    }

    @Override
    public final void c(boolean z9) {
        this.f34595a = z9;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.f34598e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        float f10;
        int i10;
        int L = org.telegram.messenger.g0.L(10.0f);
        int L2 = ((org.telegram.messenger.g0.L(18.0f) - L) / 2) + getBounds().top;
        if (!this.f34595a) {
            L2 += org.telegram.messenger.g0.L(1.0f);
        }
        int i11 = L2;
        boolean z9 = this.h;
        if (z9) {
            i7 = org.telegram.ui.ActionBar.m6.f28113p9;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f28114pa;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.f34601i);
        Paint paint = this.f34596b;
        paint.setColor(w02);
        RectF rectF = this.f34599f;
        rectF.set(0.0f, i11, L, i11 + L);
        float f11 = this.f34600g;
        float f12 = 0.5f;
        if (f11 < 0.5f) {
            f10 = org.telegram.messenger.camera.q.x(f11, 0.5f, 1.0f, 35.0f);
        } else {
            f10 = ((f11 - 0.5f) * 35.0f) / 0.5f;
        }
        int i12 = (int) f10;
        int i13 = 0;
        while (i13 < 3) {
            int L3 = org.telegram.messenger.g0.L(9.2f);
            float f13 = f12;
            float f14 = this.f34600g;
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
        if (z9) {
            i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f28170s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        canvas.drawCircle(org.telegram.messenger.g0.L(4.0f), ((L / 2) + i11) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f34600g = 0.0f;
        this.f34598e = false;
    }

    public final void f() {
        if (this.f34598e) {
            if (!org.telegram.messenger.qs.f(this.f34597c).g()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j3 > 50) {
                    j3 = 50;
                }
                if (this.f34600g >= 1.0f) {
                    this.f34600g = 0.0f;
                }
                float f10 = (((float) j3) / 300.0f) + this.f34600g;
                this.f34600g = f10;
                if (f10 > 1.0f) {
                    this.f34600g = 1.0f;
                }
                a();
                return;
            }
            org.telegram.messenger.g0.i3(new ob0(this, 8), 100L);
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
