package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
public final class eo0 extends qv0 {
    public boolean f25833a = false;
    public long f25834b = 0;
    public boolean f25835c = false;
    public float d;
    public final Paint e;

    public eo0(boolean z10) {
        if (z10) {
            Paint paint = new Paint(1);
            this.e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
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
    public final void c(boolean z10) {
        this.f25833a = z10;
    }

    @Override
    public final void d() {
        this.f25834b = System.currentTimeMillis();
        this.f25835c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        Paint paint = this.e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.f20925d2;
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
            float L = (org.telegram.messenger.i0.L(5.0f) * i10) + (org.telegram.messenger.i0.L(5.0f) * this.d);
            if (this.f25833a) {
                f7 = 3.0f;
            } else {
                f7 = 4.0f;
            }
            float L2 = org.telegram.messenger.i0.L(f7);
            float L3 = L + org.telegram.messenger.i0.L(4.0f);
            float f12 = 8.0f;
            if (this.f25833a) {
                f10 = 7.0f;
            } else {
                f10 = 8.0f;
            }
            float L4 = org.telegram.messenger.i0.L(f10);
            Canvas canvas2 = canvas;
            canvas2.drawLine(L, L2, L3, L4, paint2);
            if (this.f25833a) {
                f11 = 11.0f;
            } else {
                f11 = 12.0f;
            }
            float L5 = org.telegram.messenger.i0.L(f11);
            float L6 = L + org.telegram.messenger.i0.L(4.0f);
            if (this.f25833a) {
                f12 = 7.0f;
            }
            canvas2.drawLine(L, L5, L6, org.telegram.messenger.i0.L(f12), paint2);
            i10++;
            canvas = canvas2;
        }
        if (this.f25835c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f25834b;
            this.f25834b = currentTimeMillis;
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
        this.f25835c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(14.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(18.0f);
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
