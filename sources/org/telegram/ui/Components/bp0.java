package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class bp0 extends mw0 {
    public boolean f23734a = false;
    public long f23735b = 0;
    public boolean f23736c = false;
    public float d;
    public final Paint e;

    public bp0(boolean z4) {
        if (z4) {
            Paint paint = new Paint(1);
            this.e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z4) {
        this.f23734a = z4;
    }

    @Override
    public final void d() {
        this.f23735b = System.currentTimeMillis();
        this.f23736c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        Paint paint = this.e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.f19902d2;
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
            if (this.f23734a) {
                f10 = 3.0f;
            } else {
                f10 = 4.0f;
            }
            float dp2 = AndroidUtilities.dp(f10);
            float dp3 = dp + AndroidUtilities.dp(4.0f);
            float f13 = 8.0f;
            if (this.f23734a) {
                f11 = 7.0f;
            } else {
                f11 = 8.0f;
            }
            float dp4 = AndroidUtilities.dp(f11);
            Canvas canvas2 = canvas;
            canvas2.drawLine(dp, dp2, dp3, dp4, paint2);
            if (this.f23734a) {
                f12 = 11.0f;
            } else {
                f12 = 12.0f;
            }
            float dp5 = AndroidUtilities.dp(f12);
            float dp6 = dp + AndroidUtilities.dp(4.0f);
            if (this.f23734a) {
                f13 = 7.0f;
            }
            canvas2.drawLine(dp, dp5, dp6, AndroidUtilities.dp(f13), paint2);
            i10++;
            canvas = canvas2;
        }
        if (this.f23736c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f23735b;
            this.f23735b = currentTimeMillis;
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
        this.f23736c = false;
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
