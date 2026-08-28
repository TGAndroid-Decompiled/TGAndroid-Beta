package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class go0 extends tv0 {
    public boolean f28827a = false;
    public long f28828b = 0;
    public boolean f28829c = false;
    public float d;
    public final Paint f28830e;

    public go0(boolean z10) {
        if (z10) {
            Paint paint = new Paint(1);
            this.f28830e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void b(int i9) {
        Paint paint = this.f28830e;
        if (paint != null) {
            paint.setColor(i9);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f28827a = z10;
    }

    @Override
    public final void d() {
        this.f28828b = System.currentTimeMillis();
        this.f28829c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        Paint paint = this.f28830e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.f6.f22997d2;
        }
        Paint paint2 = paint;
        int i9 = 0;
        while (i9 < 3) {
            if (i9 == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i9 == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(255);
            }
            float dp = (AndroidUtilities.dp(5.0f) * i9) + (AndroidUtilities.dp(5.0f) * this.d);
            if (this.f28827a) {
                f10 = 3.0f;
            } else {
                f10 = 4.0f;
            }
            float dp2 = AndroidUtilities.dp(f10);
            float dp3 = dp + AndroidUtilities.dp(4.0f);
            float f13 = 8.0f;
            if (this.f28827a) {
                f11 = 7.0f;
            } else {
                f11 = 8.0f;
            }
            float dp4 = AndroidUtilities.dp(f11);
            Canvas canvas2 = canvas;
            canvas2.drawLine(dp, dp2, dp3, dp4, paint2);
            if (this.f28827a) {
                f12 = 11.0f;
            } else {
                f12 = 12.0f;
            }
            float dp5 = AndroidUtilities.dp(f12);
            float dp6 = dp + AndroidUtilities.dp(4.0f);
            if (this.f28827a) {
                f13 = 7.0f;
            }
            canvas2.drawLine(dp, dp5, dp6, AndroidUtilities.dp(f13), paint2);
            i9++;
            canvas = canvas2;
        }
        if (this.f28829c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f28828b;
            this.f28828b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            this.d = (((float) j10) / 500.0f) + this.d;
            while (true) {
                float f14 = this.d;
                if (f14 > 1.0f) {
                    this.d = f14 - 1.0f;
                } else {
                    a();
                    return;
                }
            }
        }
    }

    @Override
    public final void e() {
        this.f28829c = false;
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
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
