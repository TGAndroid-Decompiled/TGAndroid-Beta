package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class ik0 extends qu0 {
    public float d;
    public final Paint f35634f;
    public boolean f35630a = false;
    public long f35631b = 0;
    public boolean f35632c = false;
    public int f35633e = 1;

    public ik0(boolean z10) {
        if (z10) {
            this.f35634f = new Paint(1);
        }
    }

    @Override
    public final void b(int i7) {
        Paint paint = this.f35634f;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f35630a = z10;
    }

    @Override
    public final void d() {
        this.f35631b = System.currentTimeMillis();
        this.f35632c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = this.f35634f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.f28827c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float L = org.telegram.messenger.g0.L(6.0f);
        if (this.f35630a) {
            f10 = 8.0f;
        } else {
            f10 = 9.0f;
        }
        canvas.drawCircle(L, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f35632c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f35631b;
            this.f35631b = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f11 = this.d;
            int i7 = this.f35633e;
            float f12 = (((float) (i7 * j3)) / 400.0f) + f11;
            this.d = f12;
            if (i7 > 0 && f12 >= 1.0f) {
                this.f35633e = -1;
                this.d = 1.0f;
            } else if (i7 < 0 && f12 <= 0.0f) {
                this.f35633e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f35632c = false;
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
