package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class tk0 extends Drawable {
    public long f39877a;
    public boolean f39878b;
    public Paint f39879c;
    public float d;
    public float f39880e;
    public float f39881f;
    public int f39882g;
    public int h;
    public int f39883i;
    public org.telegram.ui.Cells.r1 f39884j;
    public float f39885k;
    public int f39886l;
    public int f39887m;
    public org.telegram.ui.ActionBar.h6 f39888n;

    public final void a() {
        if (this.f39878b) {
            return;
        }
        this.f39877a = System.currentTimeMillis();
        this.f39878b = true;
        this.f39884j.invalidate();
    }

    public final void b() {
        if (!this.f39878b) {
            return;
        }
        this.f39878b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f39879c;
        paint.setColor(i0.a.f(this.f39885k, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, this.f39888n), this.f39886l));
        int i7 = this.f39887m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f39880e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f39881f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f39878b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f39877a;
            this.f39877a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f39882g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f39882g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f39882g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f39880e;
            this.f39880e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f39880e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f39880e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f39883i) + this.f39881f;
            this.f39881f = f13;
            if (f13 > 1.0f) {
                this.f39883i = -1;
                this.f39881f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f39883i = 1;
                this.f39881f = 0.0f;
            }
            this.f39884j.invalidate();
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
        this.f39887m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
