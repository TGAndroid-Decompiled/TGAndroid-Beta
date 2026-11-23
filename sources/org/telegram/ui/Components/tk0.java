package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class tk0 extends Drawable {
    public long f39923a;
    public boolean f39924b;
    public Paint f39925c;
    public float d;
    public float f39926e;
    public float f39927f;
    public int f39928g;
    public int h;
    public int f39929i;
    public org.telegram.ui.Cells.r1 f39930j;
    public float f39931k;
    public int f39932l;
    public int f39933m;
    public org.telegram.ui.ActionBar.h6 f39934n;

    public final void a() {
        if (this.f39924b) {
            return;
        }
        this.f39923a = System.currentTimeMillis();
        this.f39924b = true;
        this.f39930j.invalidate();
    }

    public final void b() {
        if (!this.f39924b) {
            return;
        }
        this.f39924b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f39925c;
        paint.setColor(i0.a.f(this.f39931k, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, this.f39934n), this.f39932l));
        int i7 = this.f39933m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f39926e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f39927f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f39924b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f39923a;
            this.f39923a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f39928g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f39928g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f39928g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f39926e;
            this.f39926e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f39926e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f39926e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f39929i) + this.f39927f;
            this.f39927f = f13;
            if (f13 > 1.0f) {
                this.f39929i = -1;
                this.f39927f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f39929i = 1;
                this.f39927f = 0.0f;
            }
            this.f39930j.invalidate();
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
        this.f39933m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
