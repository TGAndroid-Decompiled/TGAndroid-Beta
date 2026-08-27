package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

public final class ho0 extends vv0 {

    public boolean f29066a = false;

    public long f29067b = 0;

    public boolean f29068c = false;
    public float d;

    public final Paint f29069e;

    public ho0(boolean z10) {
        if (z10) {
            Paint paint = new Paint(1);
            this.f29069e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f29069e;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f29066a = z10;
    }

    @Override
    public final void d() {
        this.f29067b = System.currentTimeMillis();
        this.f29068c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29069e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.g6.f23049d2;
        }
        Paint paint2 = paint;
        int i10 = 0;
        while (i10 < 3) {
            if (i10 == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i10 == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(255);
            }
            float fDp = (AndroidUtilities.dp(5.0f) * i10) + (AndroidUtilities.dp(5.0f) * this.d);
            float f10 = 8.0f;
            Canvas canvas2 = canvas;
            canvas2.drawLine(fDp, AndroidUtilities.dp(this.f29066a ? 3.0f : 4.0f), fDp + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(this.f29066a ? 7.0f : 8.0f), paint2);
            float fDp2 = AndroidUtilities.dp(this.f29066a ? 11.0f : 12.0f);
            float fDp3 = fDp + AndroidUtilities.dp(4.0f);
            if (this.f29066a) {
                f10 = 7.0f;
            }
            canvas2.drawLine(fDp, fDp2, fDp3, AndroidUtilities.dp(f10), paint2);
            i10++;
            canvas = canvas2;
        }
        if (!this.f29068c) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f29067b;
        this.f29067b = jCurrentTimeMillis;
        if (j10 > 50) {
            j10 = 50;
        }
        this.d = (j10 / 500.0f) + this.d;
        while (true) {
            float f11 = this.d;
            if (f11 <= 1.0f) {
                a();
                return;
            }
            this.d = f11 - 1.0f;
        }
    }

    @Override
    public final void e() {
        this.f29068c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(14.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
