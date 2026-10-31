package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class hl0 extends qv0 {
    public float d;
    public final Paint f26757f;
    public boolean f26754a = false;
    public long f26755b = 0;
    public boolean f26756c = false;
    public int e = 1;

    public hl0(boolean z10) {
        if (z10) {
            this.f26757f = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f26757f;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f26754a = z10;
    }

    @Override
    public final void d() {
        this.f26755b = System.currentTimeMillis();
        this.f26756c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        Paint paint = this.f26757f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.f20906c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float L = org.telegram.messenger.i0.L(6.0f);
        if (this.f26754a) {
            f7 = 8.0f;
        } else {
            f7 = 9.0f;
        }
        canvas.drawCircle(L, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(4.0f), paint);
        if (this.f26756c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f26755b;
            this.f26755b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = this.d;
            int i10 = this.e;
            float f11 = (((float) (i10 * j10)) / 400.0f) + f10;
            this.d = f11;
            if (i10 > 0 && f11 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i10 < 0 && f11 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f26756c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(10.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(12.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
