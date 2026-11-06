package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class n9 extends Drawable {
    public TextPaint f36319a;
    public final Paint f36320b;
    public final Paint f36321c;
    public final Paint d;
    public final float f36322e;
    public float f36323f;
    public float f36324g;
    public final RectF h;
    public ValueAnimator f36325i;

    public n9() {
        Paint paint = new Paint(1);
        this.f36320b = paint;
        this.f36321c = new Paint(1);
        this.d = new Paint(1);
        this.f36322e = 1.0f;
        this.f36323f = 0.0f;
        this.f36324g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z9, float f10) {
        float max = Math.max(Math.min(f10, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.f36325i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36325i = null;
        }
        if (!z9) {
            this.f36324g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36324g, max);
        this.f36325i = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 5));
        this.f36325i.addListener(new org.telegram.ui.ActionBar.t0(this, max, 4));
        this.f36325i.setInterpolator(xq.h);
        this.f36325i.setDuration(200L);
        this.f36325i.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() != null) {
            int i7 = getBounds().left;
            int i10 = getBounds().top + ((int) this.f36323f);
            int width = getBounds().width();
            int height = getBounds().height();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY() + ((int) this.f36323f);
            TextPaint textPaint = this.f36319a;
            Paint paint = this.d;
            Paint paint2 = this.f36321c;
            Paint paint3 = this.f36320b;
            if (textPaint != null) {
                int color = textPaint.getColor();
                paint3.setColor(color);
                paint2.setColor(color);
                paint.setColor(color);
            }
            if (this.f36322e != 1.0f) {
                canvas.save();
                float f10 = this.f36322e;
                canvas.scale(f10, f10, centerX, centerY);
            }
            paint3.setStrokeWidth(org.telegram.messenger.g0.N(1.1f));
            float f11 = i7;
            float f12 = width;
            float f13 = i10;
            float f14 = height;
            RectF rectF = this.h;
            rectF.set((((f12 - org.telegram.messenger.g0.N(16.33f)) / 2.0f) + f11) - org.telegram.messenger.g0.N(1.33f), ((f14 - org.telegram.messenger.g0.N(10.33f)) / 2.0f) + f13, (((org.telegram.messenger.g0.N(16.33f) + f12) / 2.0f) + f11) - org.telegram.messenger.g0.N(1.33f), ((org.telegram.messenger.g0.N(10.33f) + f14) / 2.0f) + f13);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(2.33f), org.telegram.messenger.g0.N(2.33f), paint3);
            rectF.set((((f12 - org.telegram.messenger.g0.N(13.0f)) / 2.0f) + f11) - org.telegram.messenger.g0.N(1.66f), ((f14 - org.telegram.messenger.g0.N(7.33f)) / 2.0f) + f13, Math.max(org.telegram.messenger.g0.N(1.1f), this.f36324g * org.telegram.messenger.g0.N(13.0f)) + ((((f12 - org.telegram.messenger.g0.N(13.0f)) / 2.0f) + f11) - org.telegram.messenger.g0.N(1.66f)), ((org.telegram.messenger.g0.N(7.33f) + f14) / 2.0f) + f13);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(0.83f), org.telegram.messenger.g0.N(0.83f), paint);
            float f15 = centerY;
            rectF.set((((org.telegram.messenger.g0.N(17.5f) + f12) - org.telegram.messenger.g0.N(4.66f)) / 2.0f) + f11, f15 - org.telegram.messenger.g0.N(2.65f), ((org.telegram.messenger.g0.N(4.66f) + (org.telegram.messenger.g0.N(17.5f) + f12)) / 2.0f) + f11, org.telegram.messenger.g0.N(2.65f) + f15);
            canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
            if (this.f36322e != 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(this.f36322e * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(this.f36322e * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f36320b.setAlpha(i7);
        this.f36321c.setAlpha(i7);
        this.d.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36320b.setColorFilter(colorFilter);
        this.f36321c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public n9(float f10, int i7) {
        this();
        a(false, f10);
        this.f36320b.setColor(-1);
        this.f36321c.setColor(-1);
        this.d.setColor(i7);
        this.f36322e = 1.3f;
        invalidateSelf();
    }
}
