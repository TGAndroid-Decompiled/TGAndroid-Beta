package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class ek0 extends qu0 {
    public float d;
    public final Paint f33434f;
    public boolean f33430a = false;
    public long f33431b = 0;
    public boolean f33432c = false;
    public int f33433e = 1;

    public ek0(boolean z9) {
        if (z9) {
            this.f33434f = new Paint(1);
        }
    }

    @Override
    public final void b(int i7) {
        Paint paint = this.f33434f;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    @Override
    public final void c(boolean z9) {
        this.f33430a = z9;
    }

    @Override
    public final void d() {
        this.f33431b = System.currentTimeMillis();
        this.f33432c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = this.f33434f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.l6.f27843c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float L = org.telegram.messenger.g0.L(6.0f);
        if (this.f33430a) {
            f10 = 8.0f;
        } else {
            f10 = 9.0f;
        }
        canvas.drawCircle(L, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f33432c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f33431b;
            this.f33431b = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f11 = this.d;
            int i7 = this.f33433e;
            float f12 = (((float) (i7 * j3)) / 400.0f) + f11;
            this.d = f12;
            if (i7 > 0 && f12 >= 1.0f) {
                this.f33433e = -1;
                this.d = 1.0f;
            } else if (i7 < 0 && f12 <= 0.0f) {
                this.f33433e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f33432c = false;
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
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
