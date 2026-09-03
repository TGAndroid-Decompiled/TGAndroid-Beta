package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class r9 extends Drawable {
    public TextPaint f30693a;
    public final Paint f30694b;
    public final Paint f30695c;
    public final Paint d;
    public final float f30696e;
    public float f30697f;
    public float f30698g;
    public final RectF h;
    public ValueAnimator f30699i;

    public r9() {
        Paint paint = new Paint(1);
        this.f30694b = paint;
        this.f30695c = new Paint(1);
        this.d = new Paint(1);
        this.f30696e = 1.0f;
        this.f30697f = 0.0f;
        this.f30698g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f10, boolean z4) {
        float max = Math.max(Math.min(f10, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.f30699i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f30699i = null;
        }
        if (!z4) {
            this.f30698g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30698g, max);
        this.f30699i = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 5));
        this.f30699i.addListener(new org.telegram.ui.ActionBar.a1(this, max, 4));
        this.f30699i.setInterpolator(pr.h);
        this.f30699i.setDuration(200L);
        this.f30699i.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() != null) {
            int i10 = getBounds().left;
            int i11 = getBounds().top + ((int) this.f30697f);
            int width = getBounds().width();
            int height = getBounds().height();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY() + ((int) this.f30697f);
            TextPaint textPaint = this.f30693a;
            Paint paint = this.d;
            Paint paint2 = this.f30695c;
            Paint paint3 = this.f30694b;
            if (textPaint != null) {
                int color = textPaint.getColor();
                paint3.setColor(color);
                paint2.setColor(color);
                paint.setColor(color);
            }
            if (this.f30696e != 1.0f) {
                canvas.save();
                float f10 = this.f30696e;
                canvas.scale(f10, f10, centerX, centerY);
            }
            paint3.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
            float f11 = i10;
            float f12 = width;
            float f13 = i11;
            float f14 = height;
            RectF rectF = this.h;
            rectF.set((((f12 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f), ((f14 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f13, (((AndroidUtilities.dpf2(16.33f) + f12) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f), ((AndroidUtilities.dpf2(10.33f) + f14) / 2.0f) + f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), paint3);
            rectF.set((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f), ((f14 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f13, Math.max(AndroidUtilities.dpf2(1.1f), this.f30698g * AndroidUtilities.dpf2(13.0f)) + ((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f14) / 2.0f) + f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), paint);
            float f15 = centerY;
            rectF.set((((AndroidUtilities.dpf2(17.5f) + f12) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f11, f15 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f12)) / 2.0f) + f11, AndroidUtilities.dpf2(2.65f) + f15);
            canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
            if (this.f30696e != 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f30696e * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f30696e * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30694b.setAlpha(i10);
        this.f30695c.setAlpha(i10);
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30694b.setColorFilter(colorFilter);
        this.f30695c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public r9(float f10, int i10) {
        this();
        a(f10, false);
        this.f30694b.setColor(-1);
        this.f30695c.setColor(-1);
        this.d.setColor(i10);
        this.f30696e = 1.3f;
        invalidateSelf();
    }
}
