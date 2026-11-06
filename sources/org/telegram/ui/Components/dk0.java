package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class dk0 extends ou0 {
    public float d;
    public final Paint f32981f;
    public boolean f32977a = false;
    public long f32978b = 0;
    public boolean f32979c = false;
    public int f32980e = 1;

    public dk0(boolean z9) {
        if (z9) {
            this.f32981f = new Paint(1);
        }
    }

    @Override
    public final void b(int i7) {
        Paint paint = this.f32981f;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    @Override
    public final void c(boolean z9) {
        this.f32977a = z9;
    }

    @Override
    public final void d() {
        this.f32978b = System.currentTimeMillis();
        this.f32979c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = this.f32981f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.f27826c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float L = org.telegram.messenger.g0.L(6.0f);
        if (this.f32977a) {
            f10 = 8.0f;
        } else {
            f10 = 9.0f;
        }
        canvas.drawCircle(L, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f32979c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32978b;
            this.f32978b = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f11 = this.d;
            int i7 = this.f32980e;
            float f12 = (((float) (i7 * j3)) / 400.0f) + f11;
            this.d = f12;
            if (i7 > 0 && f12 >= 1.0f) {
                this.f32980e = -1;
                this.d = 1.0f;
            } else if (i7 < 0 && f12 <= 0.0f) {
                this.f32980e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f32979c = false;
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
