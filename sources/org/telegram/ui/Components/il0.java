package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class il0 extends Drawable {
    public long f26997a;
    public boolean f26998b;
    public Paint f26999c;
    public float d;
    public float e;
    public float f27000f;
    public int f27001g;
    public int h;
    public int f27002i;
    public org.telegram.ui.Cells.q1 f27003j;
    public float f27004k;
    public int f27005l;
    public int f27006m;
    public org.telegram.ui.ActionBar.p6 f27007n;

    public final void a() {
        if (this.f26998b) {
            return;
        }
        this.f26997a = System.currentTimeMillis();
        this.f26998b = true;
        this.f27003j.invalidate();
    }

    public final void b() {
        if (!this.f26998b) {
            return;
        }
        this.f26998b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f26999c;
        paint.setColor(i0.b.f(this.f27004k, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, this.f27007n), this.f27005l));
        int i10 = this.f27006m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.i0.L(2.0f) + i11, org.telegram.messenger.i0.L((this.d * 7.0f) + 2.0f) + i12, org.telegram.messenger.i0.L(4.0f) + i11, org.telegram.messenger.i0.L(10.0f) + i12, paint);
            canvas2.drawRect(org.telegram.messenger.i0.L(5.0f) + i11, org.telegram.messenger.i0.L((this.e * 7.0f) + 2.0f) + i12, org.telegram.messenger.i0.L(7.0f) + i11, org.telegram.messenger.i0.L(10.0f) + i12, paint);
            canvas2.drawRect(org.telegram.messenger.i0.L(8.0f) + i11, org.telegram.messenger.i0.L((this.f27000f * 7.0f) + 2.0f) + i12, org.telegram.messenger.i0.L(10.0f) + i11, org.telegram.messenger.i0.L(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f26998b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f26997a;
            this.f26997a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f27001g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f27001g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f27001g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.e;
            this.e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f27002i) + this.f27000f;
            this.f27000f = f12;
            if (f12 > 1.0f) {
                this.f27002i = -1;
                this.f27000f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f27002i = 1;
                this.f27000f = 0.0f;
            }
            this.f27003j.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27006m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
