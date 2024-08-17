package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public class BatteryDrawable extends Drawable {
    private Paint connectorPaint;
    private Paint fillPaint;
    private float fillValue;
    private ValueAnimator fillValueAnimator;
    private Paint paintReference;
    private RectF rectTmp;
    private float scale;
    private Paint strokePaint;
    private float translateY;

    @Override
    public int getOpacity() {
        return -2;
    }

    public BatteryDrawable() {
        this.strokePaint = new Paint(1);
        this.connectorPaint = new Paint(1);
        this.fillPaint = new Paint(1);
        this.scale = 1.0f;
        this.translateY = 0.0f;
        this.fillValue = 1.0f;
        this.rectTmp = new RectF();
        this.strokePaint.setStyle(Paint.Style.STROKE);
    }

    public BatteryDrawable(float f, int i, int i2, float f2) {
        this();
        setFillValue(f, false);
        setColor(i, i2);
        setScale(f2);
    }

    public void setScale(float f) {
        this.scale = f;
        invalidateSelf();
    }

    public void setColor(int i) {
        setColor(i, i);
    }

    public void setColor(int i, int i2) {
        this.strokePaint.setColor(i);
        this.connectorPaint.setColor(i);
        this.fillPaint.setColor(i2);
    }

    public void setFillValue(float f, boolean z) {
        final float max = Math.max(Math.min(f, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.fillValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.fillValueAnimator = null;
        }
        if (!z) {
            this.fillValue = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.fillValue, max);
        this.fillValueAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BatteryDrawable.this.lambda$setFillValue$0(valueAnimator2);
            }
        });
        this.fillValueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                BatteryDrawable.this.fillValue = max;
                BatteryDrawable.this.invalidateSelf();
            }
        });
        this.fillValueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.fillValueAnimator.setDuration(200L);
        this.fillValueAnimator.start();
    }

    public void lambda$setFillValue$0(ValueAnimator valueAnimator) {
        this.fillValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateSelf();
    }

    public void colorFromPaint(Paint paint) {
        this.paintReference = paint;
    }

    @Override
    public void draw(Canvas canvas) {
        if (getBounds() == null) {
            return;
        }
        int i = getBounds().left;
        int i2 = getBounds().top + ((int) this.translateY);
        int width = getBounds().width();
        int height = getBounds().height();
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY() + ((int) this.translateY);
        Paint paint = this.paintReference;
        if (paint != null) {
            setColor(paint.getColor());
        }
        if (this.scale != 1.0f) {
            canvas.save();
            float f = this.scale;
            canvas.scale(f, f, centerX, centerY);
        }
        this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
        float f2 = i;
        float f3 = width;
        float f4 = i2;
        float f5 = height;
        this.rectTmp.set((((f3 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f2) - AndroidUtilities.dpf2(1.33f), ((f5 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f4, (((AndroidUtilities.dpf2(16.33f) + f3) / 2.0f) + f2) - AndroidUtilities.dpf2(1.33f), ((AndroidUtilities.dpf2(10.33f) + f5) / 2.0f) + f4);
        canvas.drawRoundRect(this.rectTmp, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), this.strokePaint);
        this.rectTmp.set((((f3 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f2) - AndroidUtilities.dpf2(1.66f), ((f5 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f4, ((f2 + ((f3 - AndroidUtilities.dpf2(13.0f)) / 2.0f)) - AndroidUtilities.dpf2(1.66f)) + Math.max(AndroidUtilities.dpf2(1.1f), this.fillValue * AndroidUtilities.dpf2(13.0f)), f4 + ((f5 + AndroidUtilities.dpf2(7.33f)) / 2.0f));
        canvas.drawRoundRect(this.rectTmp, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), this.fillPaint);
        float f6 = centerY;
        this.rectTmp.set((((AndroidUtilities.dpf2(17.5f) + f3) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f2, f6 - AndroidUtilities.dpf2(2.65f), f2 + (((f3 + AndroidUtilities.dpf2(17.5f)) + AndroidUtilities.dpf2(4.66f)) / 2.0f), f6 + AndroidUtilities.dpf2(2.65f));
        canvas.drawArc(this.rectTmp, -90.0f, 180.0f, false, this.connectorPaint);
        if (this.scale != 1.0f) {
            canvas.restore();
        }
    }

    public void setTranslationY(float f) {
        this.translateY = f;
    }

    @Override
    public void setAlpha(int i) {
        this.strokePaint.setAlpha(i);
        this.connectorPaint.setAlpha(i);
        this.fillPaint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.strokePaint.setColorFilter(colorFilter);
        this.connectorPaint.setColorFilter(colorFilter);
        this.fillPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.scale * 24.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.scale * 24.0f);
    }
}
