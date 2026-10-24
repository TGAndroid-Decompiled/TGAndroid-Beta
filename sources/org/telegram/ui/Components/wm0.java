package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class wm0 extends Drawable {
    public long f32288a;
    public boolean f32289b;
    public Paint f32290c;
    public float d;
    public float e;
    public float f32291f;
    public int f32292g;
    public int h;
    public int f32293i;
    public org.telegram.ui.Cells.t1 f32294j;
    public float f32295k;
    public int f32296l;
    public int f32297m;
    public org.telegram.ui.ActionBar.g6 f32298n;

    public final void a() {
        if (this.f32289b) {
            return;
        }
        this.f32288a = System.currentTimeMillis();
        this.f32289b = true;
        this.f32294j.invalidate();
    }

    public final void b() {
        if (!this.f32289b) {
            return;
        }
        this.f32289b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f32290c;
        paint.setColor(i0.a.f(this.f32295k, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21278ic, this.f32298n), this.f32296l));
        int i10 = this.f32297m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f32291f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f32289b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f32288a;
            this.f32288a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f32292g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f32292g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f32292g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f32293i) + this.f32291f;
            this.f32291f = f12;
            if (f12 > 1.0f) {
                this.f32293i = -1;
                this.f32291f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f32293i = 1;
                this.f32291f = 0.0f;
            }
            this.f32294j.invalidate();
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
        this.f32297m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
