package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class jm0 extends Drawable {
    public long f25481a;
    public boolean f25482b;
    public Paint f25483c;
    public float d;
    public float e;
    public float f25484f;
    public int f25485g;
    public int h;
    public int f25486i;
    public org.telegram.ui.Cells.u1 f25487j;
    public float f25488k;
    public int f25489l;
    public int f25490m;
    public org.telegram.ui.ActionBar.d6 f25491n;

    public final void a() {
        if (this.f25482b) {
            return;
        }
        this.f25481a = System.currentTimeMillis();
        this.f25482b = true;
        this.f25487j.invalidate();
    }

    public final void b() {
        if (!this.f25482b) {
            return;
        }
        this.f25482b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25483c;
        paint.setColor(i0.a.d(this.f25488k, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19154ic, this.f25491n), this.f25489l));
        int i10 = this.f25490m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f25484f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f25482b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f25481a;
            this.f25481a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f25485g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f25485g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f25485g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f25486i) + this.f25484f;
            this.f25484f = f12;
            if (f12 > 1.0f) {
                this.f25486i = -1;
                this.f25484f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f25486i = 1;
                this.f25484f = 0.0f;
            }
            this.f25487j.invalidate();
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
        this.f25490m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
