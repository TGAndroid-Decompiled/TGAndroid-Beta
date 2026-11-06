package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class ek0 extends Drawable {
    public long f33263a;
    public boolean f33264b;
    public Paint f33265c;
    public float d;
    public float f33266e;
    public float f33267f;
    public int f33268g;
    public int h;
    public int f33269i;
    public org.telegram.ui.Cells.q1 f33270j;
    public float f33271k;
    public int f33272l;
    public int f33273m;
    public org.telegram.ui.ActionBar.f6 f33274n;

    public final void a() {
        if (this.f33264b) {
            return;
        }
        this.f33263a = System.currentTimeMillis();
        this.f33264b = true;
        this.f33270j.invalidate();
    }

    public final void b() {
        if (!this.f33264b) {
            return;
        }
        this.f33264b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f33265c;
        paint.setColor(i0.a.f(this.f33271k, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.f33274n), this.f33272l));
        int i7 = this.f33273m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f33266e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f33267f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f33264b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f33263a;
            this.f33263a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f33268g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f33268g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f33268g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f33266e;
            this.f33266e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f33266e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f33266e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f33269i) + this.f33267f;
            this.f33267f = f13;
            if (f13 > 1.0f) {
                this.f33269i = -1;
                this.f33267f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f33269i = 1;
                this.f33267f = 0.0f;
            }
            this.f33270j.invalidate();
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
        this.f33273m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
