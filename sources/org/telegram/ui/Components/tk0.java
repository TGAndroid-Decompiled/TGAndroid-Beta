package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class tk0 extends Drawable {
    public long f39931a;
    public boolean f39932b;
    public Paint f39933c;
    public float d;
    public float f39934e;
    public float f39935f;
    public int f39936g;
    public int h;
    public int f39937i;
    public org.telegram.ui.Cells.r1 f39938j;
    public float f39939k;
    public int f39940l;
    public int f39941m;
    public org.telegram.ui.ActionBar.h6 f39942n;

    public final void a() {
        if (this.f39932b) {
            return;
        }
        this.f39931a = System.currentTimeMillis();
        this.f39932b = true;
        this.f39938j.invalidate();
    }

    public final void b() {
        if (!this.f39932b) {
            return;
        }
        this.f39932b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f39933c;
        paint.setColor(i0.a.f(this.f39939k, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, this.f39942n), this.f39940l));
        int i7 = this.f39941m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f39934e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f39935f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f39932b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f39931a;
            this.f39931a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f39936g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f39936g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f39936g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f39934e;
            this.f39934e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f39934e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f39934e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f39937i) + this.f39935f;
            this.f39935f = f13;
            if (f13 > 1.0f) {
                this.f39937i = -1;
                this.f39935f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f39937i = 1;
                this.f39935f = 0.0f;
            }
            this.f39938j.invalidate();
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
        this.f39941m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
