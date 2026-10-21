package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class um0 extends Drawable {
    public long f30964a;
    public boolean f30965b;
    public Paint f30966c;
    public float d;
    public float e;
    public float f30967f;
    public int f30968g;
    public int h;
    public int f30969i;
    public org.telegram.ui.Cells.u1 f30970j;
    public float f30971k;
    public int f30972l;
    public int f30973m;
    public org.telegram.ui.ActionBar.d6 f30974n;

    public final void a() {
        if (this.f30965b) {
            return;
        }
        this.f30964a = System.currentTimeMillis();
        this.f30965b = true;
        this.f30970j.invalidate();
    }

    public final void b() {
        if (!this.f30965b) {
            return;
        }
        this.f30965b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f30966c;
        paint.setColor(i0.a.f(this.f30971k, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21084ic, this.f30974n), this.f30972l));
        int i10 = this.f30973m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f30967f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f30965b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30964a;
            this.f30964a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f30968g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f30968g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f30968g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f30969i) + this.f30967f;
            this.f30967f = f12;
            if (f12 > 1.0f) {
                this.f30969i = -1;
                this.f30967f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f30969i = 1;
                this.f30967f = 0.0f;
            }
            this.f30970j.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30973m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
