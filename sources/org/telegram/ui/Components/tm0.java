package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class tm0 extends Drawable {
    public long f30657a;
    public boolean f30658b;
    public Paint f30659c;
    public float d;
    public float e;
    public float f30660f;
    public int f30661g;
    public int h;
    public int f30662i;
    public org.telegram.ui.Cells.u1 f30663j;
    public float f30664k;
    public int f30665l;
    public int f30666m;
    public org.telegram.ui.ActionBar.d6 f30667n;

    public final void a() {
        if (this.f30658b) {
            return;
        }
        this.f30657a = System.currentTimeMillis();
        this.f30658b = true;
        this.f30663j.invalidate();
    }

    public final void b() {
        if (!this.f30658b) {
            return;
        }
        this.f30658b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f30659c;
        paint.setColor(i0.b.f(this.f30664k, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21080ic, this.f30667n), this.f30665l));
        int i10 = this.f30666m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f30660f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f30658b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30657a;
            this.f30657a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f30661g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f30661g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f30661g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f30662i) + this.f30660f;
            this.f30660f = f12;
            if (f12 > 1.0f) {
                this.f30662i = -1;
                this.f30660f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f30662i = 1;
                this.f30660f = 0.0f;
            }
            this.f30663j.invalidate();
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
        this.f30666m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
