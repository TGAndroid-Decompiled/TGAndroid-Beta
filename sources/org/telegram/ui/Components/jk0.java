package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class jk0 extends Drawable {
    public long f36023a;
    public boolean f36024b;
    public Paint f36025c;
    public float d;
    public float f36026e;
    public float f36027f;
    public int f36028g;
    public int h;
    public int f36029i;
    public org.telegram.ui.Cells.q1 f36030j;
    public float f36031k;
    public int f36032l;
    public int f36033m;
    public org.telegram.ui.ActionBar.e6 f36034n;

    public final void a() {
        if (this.f36024b) {
            return;
        }
        this.f36023a = System.currentTimeMillis();
        this.f36024b = true;
        this.f36030j.invalidate();
    }

    public final void b() {
        if (!this.f36024b) {
            return;
        }
        this.f36024b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f36025c;
        paint.setColor(i0.a.f(this.f36031k, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zc, this.f36034n), this.f36032l));
        int i7 = this.f36033m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f36026e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f36027f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f36024b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f36023a;
            this.f36023a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f36028g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f36028g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f36028g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f36026e;
            this.f36026e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f36026e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f36026e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f36029i) + this.f36027f;
            this.f36027f = f13;
            if (f13 > 1.0f) {
                this.f36029i = -1;
                this.f36027f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f36029i = 1;
                this.f36027f = 0.0f;
            }
            this.f36030j.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f36033m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
