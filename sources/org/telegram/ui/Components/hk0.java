package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class hk0 extends nu0 {
    public float d;
    public final Paint f34439f;
    public boolean f34435a = false;
    public long f34436b = 0;
    public boolean f34437c = false;
    public int f34438e = 1;

    public hk0(boolean z10) {
        if (z10) {
            this.f34439f = new Paint(1);
        }
    }

    @Override
    public final void b(int i3) {
        Paint paint = this.f34439f;
        if (paint != null) {
            paint.setColor(i3);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f34435a = z10;
    }

    @Override
    public final void d() {
        this.f34436b = System.currentTimeMillis();
        this.f34437c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = this.f34439f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float L = org.telegram.messenger.g0.L(6.0f);
        if (this.f34435a) {
            f10 = 8.0f;
        } else {
            f10 = 9.0f;
        }
        canvas.drawCircle(L, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f34437c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f34436b;
            this.f34436b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f11 = this.d;
            int i3 = this.f34438e;
            float f12 = (((float) (i3 * j10)) / 400.0f) + f11;
            this.d = f12;
            if (i3 > 0 && f12 >= 1.0f) {
                this.f34438e = -1;
                this.d = 1.0f;
            } else if (i3 < 0 && f12 <= 0.0f) {
                this.f34438e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f34437c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(10.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(12.0f);
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
