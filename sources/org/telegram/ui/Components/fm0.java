package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class fm0 extends Drawable {
    public long f26948a;
    public boolean f26949b;
    public Paint f26950c;
    public float d;
    public float f26951e;
    public float f26952f;
    public int f26953g;
    public int h;
    public int f26954i;
    public org.telegram.ui.Cells.t1 f26955j;
    public float f26956k;
    public int f26957l;
    public int f26958m;
    public org.telegram.ui.ActionBar.g6 f26959n;

    public final void a() {
        if (this.f26949b) {
            return;
        }
        this.f26948a = System.currentTimeMillis();
        this.f26949b = true;
        this.f26955j.invalidate();
    }

    public final void b() {
        if (!this.f26949b) {
            return;
        }
        this.f26949b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f26950c;
        paint.setColor(i0.a.d(this.f26956k, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ic, this.f26959n), this.f26957l));
        int i10 = this.f26958m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f26951e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f26952f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f26949b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f26948a;
            this.f26948a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = (float) j10;
            float f11 = ((f10 / 300.0f) * this.f26953g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f26953g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f26953g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f26951e;
            this.f26951e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f26951e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f26951e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f26954i) + this.f26952f;
            this.f26952f = f13;
            if (f13 > 1.0f) {
                this.f26954i = -1;
                this.f26952f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f26954i = 1;
                this.f26952f = 0.0f;
            }
            this.f26955j.invalidate();
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
        this.f26958m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
