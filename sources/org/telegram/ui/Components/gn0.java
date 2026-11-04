package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class gn0 extends nu0 {
    public boolean f34156a = false;
    public long f34157b = 0;
    public boolean f34158c = false;
    public float d;
    public final Paint f34159e;

    public gn0(boolean z10) {
        if (z10) {
            Paint paint = new Paint(1);
            this.f34159e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void b(int i3) {
        Paint paint = this.f34159e;
        if (paint != null) {
            paint.setColor(i3);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f34156a = z10;
    }

    @Override
    public final void d() {
        this.f34157b = System.currentTimeMillis();
        this.f34158c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        Paint paint = this.f34159e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.f27874d2;
        }
        Paint paint2 = paint;
        int i3 = 0;
        while (i3 < 3) {
            if (i3 == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i3 == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(255);
            }
            float L = (org.telegram.messenger.g0.L(5.0f) * i3) + (org.telegram.messenger.g0.L(5.0f) * this.d);
            if (this.f34156a) {
                f10 = 3.0f;
            } else {
                f10 = 4.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float L3 = L + org.telegram.messenger.g0.L(4.0f);
            float f13 = 8.0f;
            if (this.f34156a) {
                f11 = 7.0f;
            } else {
                f11 = 8.0f;
            }
            float L4 = org.telegram.messenger.g0.L(f11);
            Canvas canvas2 = canvas;
            canvas2.drawLine(L, L2, L3, L4, paint2);
            if (this.f34156a) {
                f12 = 11.0f;
            } else {
                f12 = 12.0f;
            }
            float L5 = org.telegram.messenger.g0.L(f12);
            float L6 = L + org.telegram.messenger.g0.L(4.0f);
            if (this.f34156a) {
                f13 = 7.0f;
            }
            canvas2.drawLine(L, L5, L6, org.telegram.messenger.g0.L(f13), paint2);
            i3++;
            canvas = canvas2;
        }
        if (this.f34158c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f34157b;
            this.f34157b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            this.d = (((float) j10) / 500.0f) + this.d;
            while (true) {
                float f14 = this.d;
                if (f14 > 1.0f) {
                    this.d = f14 - 1.0f;
                } else {
                    a();
                    return;
                }
            }
        }
    }

    @Override
    public final void e() {
        this.f34158c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(14.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
