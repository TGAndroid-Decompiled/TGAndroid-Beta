package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class xm0 extends Drawable {
    public long f30953a;
    public boolean f30954b;
    public Paint f30955c;
    public float d;
    public float e;
    public float f30956f;
    public int f30957g;
    public int h;
    public int f30958i;
    public org.telegram.ui.Cells.u1 f30959j;
    public float f30960k;
    public int f30961l;
    public int f30962m;
    public org.telegram.ui.ActionBar.c6 f30963n;

    public final void a() {
        if (this.f30954b) {
            return;
        }
        this.f30953a = System.currentTimeMillis();
        this.f30954b = true;
        this.f30959j.invalidate();
    }

    public final void b() {
        if (!this.f30954b) {
            return;
        }
        this.f30954b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f30955c;
        paint.setColor(i0.a.d(this.f30960k, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19695ic, this.f30963n), this.f30961l));
        int i10 = this.f30962m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f30956f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f30954b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30953a;
            this.f30953a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f30957g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f30957g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f30957g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f30958i) + this.f30956f;
            this.f30956f = f12;
            if (f12 > 1.0f) {
                this.f30958i = -1;
                this.f30956f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f30958i = 1;
                this.f30956f = 0.0f;
            }
            this.f30959j.invalidate();
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
        this.f30962m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
