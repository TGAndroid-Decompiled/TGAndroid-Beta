package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class v9 extends Drawable {
    public TextPaint f33496a;
    public final Paint f33497b;
    public final Paint f33498c;
    public final Paint d;
    public final float f33499e;
    public float f33500f;
    public float f33501g;
    public final RectF h;
    public ValueAnimator f33502i;

    public v9() {
        Paint paint = new Paint(1);
        this.f33497b = paint;
        this.f33498c = new Paint(1);
        this.d = new Paint(1);
        this.f33499e = 1.0f;
        this.f33500f = 0.0f;
        this.f33501g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f9, boolean z10) {
        float max = Math.max(Math.min(f9, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.f33502i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33502i = null;
        }
        if (!z10) {
            this.f33501g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f33501g, max);
        this.f33502i = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 5));
        this.f33502i.addListener(new org.telegram.ui.ActionBar.a1(this, max, 4));
        this.f33502i.setInterpolator(jr.h);
        this.f33502i.setDuration(200L);
        this.f33502i.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() != null) {
            int i10 = getBounds().left;
            int i11 = getBounds().top + ((int) this.f33500f);
            int width = getBounds().width();
            int height = getBounds().height();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY() + ((int) this.f33500f);
            TextPaint textPaint = this.f33496a;
            Paint paint = this.d;
            Paint paint2 = this.f33498c;
            Paint paint3 = this.f33497b;
            if (textPaint != null) {
                int color = textPaint.getColor();
                paint3.setColor(color);
                paint2.setColor(color);
                paint.setColor(color);
            }
            if (this.f33499e != 1.0f) {
                canvas.save();
                float f9 = this.f33499e;
                canvas.scale(f9, f9, centerX, centerY);
            }
            paint3.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
            float f10 = i10;
            float f11 = width;
            float f12 = i11;
            float f13 = height;
            RectF rectF = this.h;
            rectF.set((((f11 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f10) - AndroidUtilities.dpf2(1.33f), ((f13 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f12, (((AndroidUtilities.dpf2(16.33f) + f11) / 2.0f) + f10) - AndroidUtilities.dpf2(1.33f), ((AndroidUtilities.dpf2(10.33f) + f13) / 2.0f) + f12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), paint3);
            rectF.set((((f11 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f10) - AndroidUtilities.dpf2(1.66f), ((f13 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f12, Math.max(AndroidUtilities.dpf2(1.1f), this.f33501g * AndroidUtilities.dpf2(13.0f)) + ((((f11 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f10) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f13) / 2.0f) + f12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), paint);
            float f14 = centerY;
            rectF.set((((AndroidUtilities.dpf2(17.5f) + f11) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f10, f14 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f11)) / 2.0f) + f10, AndroidUtilities.dpf2(2.65f) + f14);
            canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
            if (this.f33499e != 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f33499e * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f33499e * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33497b.setAlpha(i10);
        this.f33498c.setAlpha(i10);
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33497b.setColorFilter(colorFilter);
        this.f33498c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public v9(float f9, int i10) {
        this();
        a(f9, false);
        this.f33497b.setColor(-1);
        this.f33498c.setColor(-1);
        this.d.setColor(i10);
        this.f33499e = 1.3f;
        invalidateSelf();
    }
}
