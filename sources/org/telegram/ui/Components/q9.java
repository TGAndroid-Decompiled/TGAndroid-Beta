package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class q9 extends Drawable {
    public TextPaint f31865a;
    public final Paint f31866b;
    public final Paint f31867c;
    public final Paint d;
    public final float f31868e;
    public float f31869f;
    public float f31870g;
    public final RectF h;
    public ValueAnimator f31871i;

    public q9() {
        Paint paint = new Paint(1);
        this.f31866b = paint;
        this.f31867c = new Paint(1);
        this.d = new Paint(1);
        this.f31868e = 1.0f;
        this.f31869f = 0.0f;
        this.f31870g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f10, boolean z10) {
        float max = Math.max(Math.min(f10, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.f31871i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31871i = null;
        }
        if (!z10) {
            this.f31870g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31870g, max);
        this.f31871i = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 5));
        this.f31871i.addListener(new org.telegram.ui.ActionBar.a1(this, max, 4));
        this.f31871i.setInterpolator(gr.h);
        this.f31871i.setDuration(200L);
        this.f31871i.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() != null) {
            int i9 = getBounds().left;
            int i10 = getBounds().top + ((int) this.f31869f);
            int width = getBounds().width();
            int height = getBounds().height();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY() + ((int) this.f31869f);
            TextPaint textPaint = this.f31865a;
            Paint paint = this.d;
            Paint paint2 = this.f31867c;
            Paint paint3 = this.f31866b;
            if (textPaint != null) {
                int color = textPaint.getColor();
                paint3.setColor(color);
                paint2.setColor(color);
                paint.setColor(color);
            }
            if (this.f31868e != 1.0f) {
                canvas.save();
                float f10 = this.f31868e;
                canvas.scale(f10, f10, centerX, centerY);
            }
            paint3.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
            float f11 = i9;
            float f12 = width;
            float f13 = i10;
            float f14 = height;
            RectF rectF = this.h;
            rectF.set((((f12 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f), ((f14 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f13, (((AndroidUtilities.dpf2(16.33f) + f12) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f), ((AndroidUtilities.dpf2(10.33f) + f14) / 2.0f) + f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), paint3);
            rectF.set((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f), ((f14 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f13, Math.max(AndroidUtilities.dpf2(1.1f), this.f31870g * AndroidUtilities.dpf2(13.0f)) + ((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f14) / 2.0f) + f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), paint);
            float f15 = centerY;
            rectF.set((((AndroidUtilities.dpf2(17.5f) + f12) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f11, f15 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f12)) / 2.0f) + f11, AndroidUtilities.dpf2(2.65f) + f15);
            canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
            if (this.f31868e != 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f31868e * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f31868e * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f31866b.setAlpha(i9);
        this.f31867c.setAlpha(i9);
        this.d.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31866b.setColorFilter(colorFilter);
        this.f31867c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public q9(float f10, int i9) {
        this();
        a(f10, false);
        this.f31866b.setColor(-1);
        this.f31867c.setColor(-1);
        this.d.setColor(i9);
        this.f31868e = 1.3f;
        invalidateSelf();
    }
}
