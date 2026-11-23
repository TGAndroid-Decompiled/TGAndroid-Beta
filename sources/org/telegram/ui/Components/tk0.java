package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class tk0 extends Drawable {
    public long f40058a;
    public boolean f40059b;
    public Paint f40060c;
    public float d;
    public float f40061e;
    public float f40062f;
    public int f40063g;
    public int h;
    public int f40064i;
    public org.telegram.ui.Cells.r1 f40065j;
    public float f40066k;
    public int f40067l;
    public int f40068m;
    public org.telegram.ui.ActionBar.i6 f40069n;

    public final void a() {
        if (this.f40059b) {
            return;
        }
        this.f40058a = System.currentTimeMillis();
        this.f40059b = true;
        this.f40065j.invalidate();
    }

    public final void b() {
        if (!this.f40059b) {
            return;
        }
        this.f40059b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f40060c;
        paint.setColor(i0.a.f(this.f40066k, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zc, this.f40069n), this.f40067l));
        int i7 = this.f40068m;
        if (i7 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i7));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L((this.d * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(4.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(5.0f) + i10, org.telegram.messenger.g0.L((this.f40061e * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(7.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            canvas2.drawRect(org.telegram.messenger.g0.L(8.0f) + i10, org.telegram.messenger.g0.L((this.f40062f * 7.0f) + 2.0f) + i11, org.telegram.messenger.g0.L(10.0f) + i10, org.telegram.messenger.g0.L(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f40059b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f40058a;
            this.f40058a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = (float) j3;
            float f11 = ((f10 / 300.0f) * this.f40063g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f40063g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f40063g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f40061e;
            this.f40061e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f40061e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f40061e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f40064i) + this.f40062f;
            this.f40062f = f13;
            if (f13 > 1.0f) {
                this.f40064i = -1;
                this.f40062f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f40064i = 1;
                this.f40062f = 0.0f;
            }
            this.f40065j.invalidate();
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
        this.f40068m = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
