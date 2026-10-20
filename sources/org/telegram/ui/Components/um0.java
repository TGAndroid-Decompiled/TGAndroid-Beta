package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class um0 extends Drawable {
    public long f30963a;
    public boolean f30964b;
    public Paint f30965c;
    public float d;
    public float e;
    public float f30966f;
    public int f30967g;
    public int h;
    public int f30968i;
    public org.telegram.ui.Cells.u1 f30969j;
    public float f30970k;
    public int f30971l;
    public int f30972m;
    public org.telegram.ui.ActionBar.d6 f30973n;

    public final void a() {
        if (this.f30964b) {
            return;
        }
        this.f30963a = System.currentTimeMillis();
        this.f30964b = true;
        this.f30969j.invalidate();
    }

    public final void b() {
        if (!this.f30964b) {
            return;
        }
        this.f30964b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f30965c;
        paint.setColor(i0.a.f(this.f30970k, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21084ic, this.f30973n), this.f30971l));
        int i10 = this.f30972m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f30966f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f30964b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30963a;
            this.f30963a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f30967g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f30967g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f30967g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f30968i) + this.f30966f;
            this.f30966f = f12;
            if (f12 > 1.0f) {
                this.f30968i = -1;
                this.f30966f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f30968i = 1;
                this.f30966f = 0.0f;
            }
            this.f30969j.invalidate();
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
        this.f30972m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
