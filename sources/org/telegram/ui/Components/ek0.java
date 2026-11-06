package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class ek0 extends Drawable {
    public long f33282a;
    public boolean f33283b;
    public Paint f33284c;
    public float d;
    public float f33285e;
    public float f33286f;
    public int f33287g;
    public int h;
    public int f33288i;
    public org.telegram.ui.Cells.q1 f33289j;
    public float f33290k;
    public int f33291l;
    public int f33292m;
    public org.telegram.ui.ActionBar.f6 f33293n;

    public final void a() {
        if (this.f33283b) {
            return;
        }
        this.f33282a = System.currentTimeMillis();
        this.f33283b = true;
        this.f33289j.invalidate();
    }

    public final void b() {
        if (!this.f33283b) {
            return;
        }
        this.f33283b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f33284c;
        paint.setColor(i0.a.f(this.f33290k, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.f33293n), this.f33291l));
        int i7 = this.f33292m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f33285e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f33286f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f33283b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f33282a;
            this.f33282a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f33287g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f33287g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f33287g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f33285e;
            this.f33285e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f33285e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f33285e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f33288i) + this.f33286f;
            this.f33286f = f13;
            if (f13 > 1.0f) {
                this.f33288i = -1;
                this.f33286f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f33288i = 1;
                this.f33286f = 0.0f;
            }
            this.f33289j.invalidate();
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
        this.f33292m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
