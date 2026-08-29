package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class ro0 extends dw0 {
    public boolean f32349a = false;
    public long f32350b = 0;
    public boolean f32351c = false;
    public float d;
    public final Paint f32352e;

    public ro0(boolean z10) {
        if (z10) {
            Paint paint = new Paint(1);
            this.f32352e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f32352e;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f32349a = z10;
    }

    @Override
    public final void d() {
        this.f32350b = System.currentTimeMillis();
        this.f32351c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        Paint paint = this.f32352e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.g6.f23058d2;
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
            float dp = (AndroidUtilities.dp(5.0f) * i10) + (AndroidUtilities.dp(5.0f) * this.d);
            if (this.f32349a) {
                f9 = 3.0f;
            } else {
                f9 = 4.0f;
            }
            float dp2 = AndroidUtilities.dp(f9);
            float dp3 = dp + AndroidUtilities.dp(4.0f);
            float f12 = 8.0f;
            if (this.f32349a) {
                f10 = 7.0f;
            } else {
                f10 = 8.0f;
            }
            float dp4 = AndroidUtilities.dp(f10);
            Canvas canvas2 = canvas;
            canvas2.drawLine(dp, dp2, dp3, dp4, paint2);
            if (this.f32349a) {
                f11 = 11.0f;
            } else {
                f11 = 12.0f;
            }
            float dp5 = AndroidUtilities.dp(f11);
            float dp6 = dp + AndroidUtilities.dp(4.0f);
            if (this.f32349a) {
                f12 = 7.0f;
            }
            canvas2.drawLine(dp, dp5, dp6, AndroidUtilities.dp(f12), paint2);
            i10++;
            canvas = canvas2;
        }
        if (this.f32351c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f32350b;
            this.f32350b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            this.d = (((float) j10) / 500.0f) + this.d;
            while (true) {
                float f13 = this.d;
                if (f13 > 1.0f) {
                    this.d = f13 - 1.0f;
                } else {
                    a();
                    return;
                }
            }
        }
    }

    @Override
    public final void e() {
        this.f32351c = false;
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
