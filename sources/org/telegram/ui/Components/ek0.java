package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class ek0 extends Drawable {
    public long f33274a;
    public boolean f33275b;
    public Paint f33276c;
    public float d;
    public float f33277e;
    public float f33278f;
    public int f33279g;
    public int h;
    public int f33280i;
    public org.telegram.ui.Cells.q1 f33281j;
    public float f33282k;
    public int f33283l;
    public int f33284m;
    public org.telegram.ui.ActionBar.h6 f33285n;

    public final void a() {
        if (this.f33275b) {
            return;
        }
        this.f33274a = System.currentTimeMillis();
        this.f33275b = true;
        this.f33281j.invalidate();
    }

    public final void b() {
        if (!this.f33275b) {
            return;
        }
        this.f33275b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f33276c;
        paint.setColor(i0.a.f(this.f33282k, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, this.f33285n), this.f33283l));
        int i7 = this.f33284m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f33277e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f33278f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f33275b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f33274a;
            this.f33274a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f33279g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f33279g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f33279g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f33277e;
            this.f33277e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f33277e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f33277e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f33280i) + this.f33278f;
            this.f33278f = f13;
            if (f13 > 1.0f) {
                this.f33280i = -1;
                this.f33278f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f33280i = 1;
                this.f33278f = 0.0f;
            }
            this.f33281j.invalidate();
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
        this.f33284m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
