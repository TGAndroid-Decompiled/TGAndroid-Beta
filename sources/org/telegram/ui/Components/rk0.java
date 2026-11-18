package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class rk0 extends Drawable {
    public long f39157a;
    public boolean f39158b;
    public Paint f39159c;
    public float d;
    public float f39160e;
    public float f39161f;
    public int f39162g;
    public int h;
    public int f39163i;
    public org.telegram.ui.Cells.r1 f39164j;
    public float f39165k;
    public int f39166l;
    public int f39167m;
    public org.telegram.ui.ActionBar.i6 f39168n;

    public final void a() {
        if (this.f39158b) {
            return;
        }
        this.f39157a = System.currentTimeMillis();
        this.f39158b = true;
        this.f39164j.invalidate();
    }

    public final void b() {
        if (!this.f39158b) {
            return;
        }
        this.f39158b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f39159c;
        paint.setColor(i0.a.f(this.f39165k, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zc, this.f39168n), this.f39166l));
        int i7 = this.f39167m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f39160e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f39161f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f39158b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f39157a;
            this.f39157a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f39162g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f39162g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f39162g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f39160e;
            this.f39160e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f39160e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f39160e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f39163i) + this.f39161f;
            this.f39161f = f13;
            if (f13 > 1.0f) {
                this.f39163i = -1;
                this.f39161f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f39163i = 1;
                this.f39161f = 0.0f;
            }
            this.f39164j.invalidate();
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
        this.f39167m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
