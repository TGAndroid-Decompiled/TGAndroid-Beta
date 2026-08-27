package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class kl0 extends Drawable {

    public long f30131a;

    public boolean f30132b;

    public Paint f30133c;
    public float d;

    public float f30134e;

    public float f30135f;

    public int f30136g;
    public int h;

    public int f30137i;

    public org.telegram.ui.Cells.s1 f30138j;

    public float f30139k;

    public int f30140l;

    public int f30141m;

    public org.telegram.ui.ActionBar.c6 f30142n;

    public final void a() {
        if (this.f30132b) {
            return;
        }
        this.f30131a = System.currentTimeMillis();
        this.f30132b = true;
        this.f30138j.invalidate();
    }

    public final void b() {
        if (this.f30132b) {
            this.f30132b = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f30133c;
        paint.setColor(i0.b.d(this.f30139k, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23150ic, this.f30142n), this.f30140l));
        int i10 = this.f30141m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f30134e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f30135f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f30132b) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - this.f30131a;
            this.f30131a = jCurrentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = j10;
            float f11 = ((f10 / 300.0f) * this.f30136g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f30136g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f30136g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f30134e;
            this.f30134e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f30134e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f30134e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f30137i) + this.f30135f;
            this.f30135f = f13;
            if (f13 > 1.0f) {
                this.f30137i = -1;
                this.f30135f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f30137i = 1;
                this.f30135f = 0.0f;
            }
            this.f30138j.invalidate();
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
        this.f30141m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
