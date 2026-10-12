package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class xm0 extends Drawable {
    public long f31276a;
    public boolean f31277b;
    public Paint f31278c;
    public float d;
    public float e;
    public float f31279f;
    public int f31280g;
    public int h;
    public int f31281i;
    public org.telegram.ui.Cells.u1 f31282j;
    public float f31283k;
    public int f31284l;
    public int f31285m;
    public org.telegram.ui.ActionBar.c6 f31286n;

    public final void a() {
        if (this.f31277b) {
            return;
        }
        this.f31276a = System.currentTimeMillis();
        this.f31277b = true;
        this.f31282j.invalidate();
    }

    public final void b() {
        if (!this.f31277b) {
            return;
        }
        this.f31277b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f31278c;
        paint.setColor(i0.a.d(this.f31283k, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19995ic, this.f31286n), this.f31284l));
        int i10 = this.f31285m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f31279f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f31277b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f31276a;
            this.f31276a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f31280g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f31280g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f31280g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f31281i) + this.f31279f;
            this.f31279f = f12;
            if (f12 > 1.0f) {
                this.f31281i = -1;
                this.f31279f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f31281i = 1;
                this.f31279f = 0.0f;
            }
            this.f31282j.invalidate();
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
        this.f31285m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
