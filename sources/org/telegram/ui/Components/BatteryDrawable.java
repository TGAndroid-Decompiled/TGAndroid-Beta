package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.SlideIntChooseView;

public final class BatteryDrawable extends Drawable {
    public final Paint connectorPaint;
    public final Paint fillPaint;
    public float fillValue;
    public ValueAnimator fillValueAnimator;
    public TextPaint paintReference;
    public final RectF rectTmp;
    public final float scale;
    public final Paint strokePaint;
    public float translateY;

    public BatteryDrawable() {
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        this.connectorPaint = new Paint(1);
        this.fillPaint = new Paint(1);
        this.scale = 1.0f;
        this.translateY = 0.0f;
        this.fillValue = 1.0f;
        this.rectTmp = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() == null) {
            return;
        }
        int i = getBounds().left;
        int i2 = getBounds().top + ((int) this.translateY);
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY() + ((int) this.translateY);
        TextPaint textPaint = this.paintReference;
        Paint paint = this.fillPaint;
        Paint paint2 = this.connectorPaint;
        Paint paint3 = this.strokePaint;
        if (textPaint != null) {
            int color = textPaint.getColor();
            paint3.setColor(color);
            paint2.setColor(color);
            paint.setColor(color);
        }
        float f = this.scale;
        if (f != 1.0f) {
            canvas.save();
            canvas.scale(f, f, iCenterX, iCenterY);
        }
        paint3.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
        RectF rectF = this.rectTmp;
        float f2 = i;
        float f3 = iWidth;
        float f4 = i2;
        float f5 = iHeight;
        rectF.set((((f3 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f2) - AndroidUtilities.dpf2(1.33f), ((f5 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f4, (((AndroidUtilities.dpf2(16.33f) + f3) / 2.0f) + f2) - AndroidUtilities.dpf2(1.33f), ((AndroidUtilities.dpf2(10.33f) + f5) / 2.0f) + f4);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), paint3);
        rectF.set((((f3 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f2) - AndroidUtilities.dpf2(1.66f), ((f5 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f4, Math.max(AndroidUtilities.dpf2(1.1f), this.fillValue * AndroidUtilities.dpf2(13.0f)) + ((((f3 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f2) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f5) / 2.0f) + f4);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), paint);
        float f6 = iCenterY;
        rectF.set((((AndroidUtilities.dpf2(17.5f) + f3) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f2, f6 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f3)) / 2.0f) + f2, AndroidUtilities.dpf2(2.65f) + f6);
        canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
        if (f != 1.0f) {
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.scale * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.scale * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.strokePaint.setAlpha(i);
        this.connectorPaint.setAlpha(i);
        this.fillPaint.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.strokePaint.setColorFilter(colorFilter);
        this.connectorPaint.setColorFilter(colorFilter);
        this.fillPaint.setColorFilter(colorFilter);
    }

    public final void setFillValue(float f, boolean z) {
        float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.fillValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.fillValueAnimator = null;
        }
        if (!z) {
            this.fillValue = fMax;
            invalidateSelf();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.fillValue, fMax);
        this.fillValueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 23));
        this.fillValueAnimator.addListener(new SlideIntChooseView.AnonymousClass3(this, fMax, 4));
        this.fillValueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.fillValueAnimator.setDuration(200L);
        this.fillValueAnimator.start();
    }

    public BatteryDrawable(float f, int i) {
        this();
        setFillValue(f, false);
        this.strokePaint.setColor(-1);
        this.connectorPaint.setColor(-1);
        this.fillPaint.setColor(i);
        this.scale = 1.3f;
        invalidateSelf();
    }
}
