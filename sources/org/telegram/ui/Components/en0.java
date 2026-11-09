package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class en0 extends qu0 {
    public boolean f33454a = false;
    public long f33455b = 0;
    public boolean f33456c = false;
    public float d;
    public final Paint f33457e;

    public en0(boolean z9) {
        if (z9) {
            Paint paint = new Paint(1);
            this.f33457e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void b(int i7) {
        Paint paint = this.f33457e;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    @Override
    public final void c(boolean z9) {
        this.f33454a = z9;
    }

    @Override
    public final void d() {
        this.f33455b = System.currentTimeMillis();
        this.f33456c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        Paint paint = this.f33457e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.l6.d2;
        }
        Paint paint2 = paint;
        int i7 = 0;
        while (i7 < 3) {
            if (i7 == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i7 == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(255);
            }
            float L = (org.telegram.messenger.g0.L(5.0f) * i7) + (org.telegram.messenger.g0.L(5.0f) * this.d);
            if (this.f33454a) {
                f10 = 3.0f;
            } else {
                f10 = 4.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f10);
            float L3 = L + org.telegram.messenger.g0.L(4.0f);
            float f13 = 8.0f;
            if (this.f33454a) {
                f11 = 7.0f;
            } else {
                f11 = 8.0f;
            }
            float L4 = org.telegram.messenger.g0.L(f11);
            Canvas canvas2 = canvas;
            canvas2.drawLine(L, L2, L3, L4, paint2);
            if (this.f33454a) {
                f12 = 11.0f;
            } else {
                f12 = 12.0f;
            }
            float L5 = org.telegram.messenger.g0.L(f12);
            float L6 = L + org.telegram.messenger.g0.L(4.0f);
            if (this.f33454a) {
                f13 = 7.0f;
            }
            canvas2.drawLine(L, L5, L6, org.telegram.messenger.g0.L(f13), paint2);
            i7++;
            canvas = canvas2;
        }
        if (this.f33456c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f33455b;
            this.f33455b = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            this.d = (((float) j3) / 500.0f) + this.d;
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
        this.f33456c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(14.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
