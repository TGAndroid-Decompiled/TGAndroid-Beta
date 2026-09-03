package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class dm0 extends Drawable {
    public long f24314a;
    public boolean f24315b;
    public Paint f24316c;
    public float d;
    public float e;
    public float f24317f;
    public int f24318g;
    public int h;
    public int f24319i;
    public org.telegram.ui.Cells.s1 f24320j;
    public float f24321k;
    public int f24322l;
    public int f24323m;
    public org.telegram.ui.ActionBar.f6 f24324n;

    public final void a() {
        if (this.f24315b) {
            return;
        }
        this.f24314a = System.currentTimeMillis();
        this.f24315b = true;
        this.f24320j.invalidate();
    }

    public final void b() {
        if (!this.f24315b) {
            return;
        }
        this.f24315b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f24316c;
        paint.setColor(i0.a.d(this.f24321k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, this.f24324n), this.f24322l));
        int i10 = this.f24323m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f24317f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f24315b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f24314a;
            this.f24314a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = (float) j10;
            float f11 = ((f10 / 300.0f) * this.f24318g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f24318g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f24318g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.e;
            this.e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f24319i) + this.f24317f;
            this.f24317f = f13;
            if (f13 > 1.0f) {
                this.f24319i = -1;
                this.f24317f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f24319i = 1;
                this.f24317f = 0.0f;
            }
            this.f24320j.invalidate();
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
        this.f24323m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
