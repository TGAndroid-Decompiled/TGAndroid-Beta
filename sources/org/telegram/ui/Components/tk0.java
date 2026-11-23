package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class tk0 extends Drawable {
    public long f39924a;
    public boolean f39925b;
    public Paint f39926c;
    public float d;
    public float f39927e;
    public float f39928f;
    public int f39929g;
    public int h;
    public int f39930i;
    public org.telegram.ui.Cells.r1 f39931j;
    public float f39932k;
    public int f39933l;
    public int f39934m;
    public org.telegram.ui.ActionBar.h6 f39935n;

    public final void a() {
        if (this.f39925b) {
            return;
        }
        this.f39924a = System.currentTimeMillis();
        this.f39925b = true;
        this.f39931j.invalidate();
    }

    public final void b() {
        if (!this.f39925b) {
            return;
        }
        this.f39925b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f39926c;
        paint.setColor(i0.a.f(this.f39932k, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, this.f39935n), this.f39933l));
        int i7 = this.f39934m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f39927e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f39928f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f39925b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f39924a;
            this.f39924a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f39929g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f39929g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f39929g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f39927e;
            this.f39927e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f39927e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f39927e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f39930i) + this.f39928f;
            this.f39928f = f13;
            if (f13 > 1.0f) {
                this.f39930i = -1;
                this.f39928f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f39930i = 1;
                this.f39928f = 0.0f;
            }
            this.f39931j.invalidate();
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
        this.f39934m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
