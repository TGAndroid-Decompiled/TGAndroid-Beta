package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class ik0 extends Drawable {
    public long f34724a;
    public boolean f34725b;
    public Paint f34726c;
    public float d;
    public float f34727e;
    public float f34728f;
    public int f34729g;
    public int h;
    public int f34730i;
    public org.telegram.ui.Cells.q1 f34731j;
    public float f34732k;
    public int f34733l;
    public int f34734m;
    public org.telegram.ui.ActionBar.e6 f34735n;

    public final void a() {
        if (this.f34725b) {
            return;
        }
        this.f34724a = System.currentTimeMillis();
        this.f34725b = true;
        this.f34731j.invalidate();
    }

    public final void b() {
        if (!this.f34725b) {
            return;
        }
        this.f34725b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f34726c;
        paint.setColor(i0.a.f(this.f34732k, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.f34735n), this.f34733l));
        int i3 = this.f34734m;
        if (i3 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i3));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f34727e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f34728f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f34725b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f34724a;
            this.f34724a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = (float) j10;
            float f11 = ((f10 / 300.0f) * this.f34729g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f34729g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f34729g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f34727e;
            this.f34727e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f34727e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f34727e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f34730i) + this.f34728f;
            this.f34728f = f13;
            if (f13 > 1.0f) {
                this.f34730i = -1;
                this.f34728f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f34730i = 1;
                this.f34728f = 0.0f;
            }
            this.f34731j.invalidate();
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
    public final void setAlpha(int i3) {
        this.f34734m = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
