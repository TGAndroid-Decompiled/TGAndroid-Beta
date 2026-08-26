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
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY() + ((int) this.translateY);
        Paint paint = this.paintReference;
        if (paint != null) {
            setColor(paint.getColor());
        }
        if (this.scale != 1.0f) {
            canvas.save();
            float f = this.scale;
            canvas.scale(f, f, iCenterX, iCenterY);
        }
        this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
        float f2 = i;
        float f3 = iWidth;
        float f4 = i2;
        float f5 = iHeight;
        this.rectTmp.set((((f3 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f2) - AndroidUtilities.dpf2(1.33f), ((f5 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f4, (((AndroidUtilities.dpf2(16.33f) + f3) / 2.0f) + f2) - AndroidUtilities.dpf2(1.33f), ((AndroidUtilities.dpf2(10.33f) + f5) / 2.0f) + f4);
        canvas.drawRoundRect(this.rectTmp, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), this.strokePaint);
        this.rectTmp.set((((f3 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f2) - AndroidUtilities.dpf2(1.66f), ((f5 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f4, Math.max(AndroidUtilities.dpf2(1.1f), AndroidUtilities.dpf2(13.0f) * this.fillValue) + ((((f3 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f2) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f5) / 2.0f) + f4);
        canvas.drawRoundRect(this.rectTmp, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), this.fillPaint);
        float f6 = iCenterY;
        this.rectTmp.set((((AndroidUtilities.dpf2(17.5f) + f3) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f2, f6 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f3)) / 2.0f) + f2, AndroidUtilities.dpf2(2.65f) + f6);
        canvas.drawArc(this.rectTmp, -90.0f, 180.0f, false, this.connectorPaint);
        if (this.scale != 1.0f) {
            canvas.restore();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.scale * 24.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.scale * 24.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
        this.strokePaint.setAlpha(i);
        this.connectorPaint.setAlpha(i);
        this.fillPaint.setAlpha(i);
    }

    public void setColor(int i) {
        setColor(i, i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.strokePaint.setColorFilter(colorFilter);
        this.connectorPaint.setColorFilter(colorFilter);
        this.fillPaint.setColorFilter(colorFilter);
    }

    public void setFillValue(float f, boolean z) {
        final float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
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
        valueAnimatorOfFloat.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 26));
        this.fillValueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                BatteryDrawable.this.fillValue = fMax;
                BatteryDrawable.this.invalidateSelf();
            }
        });
        this.fillValueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.fillValueAnimator.setDuration(200L);
        this.fillValueAnimator.start();
    }

    public void setScale(float f) {
        this.scale = f;
        invalidateSelf();
    }

    public void setTranslationY(float f) {
        this.translateY = f;
    }

    public void setColor(int i, int i2) {
        this.strokePaint.setColor(i);
        this.connectorPaint.setColor(i);
        this.fillPaint.setColor(i2);
    }

    public BatteryDrawable(float f) {
        this();
        setFillValue(f, false);
    }

    public BatteryDrawable(float f, int i) {
        this();
        setFillValue(f, false);
        setColor(i);
    }

    public BatteryDrawable(float f, int i, int i2) {
        this();
        setFillValue(f, false);
        setColor(i, i2);
    }

    public BatteryDrawable(float f, int i, int i2, float f2) {
        this();
        setFillValue(f, false);
        setColor(i, i2);
        setScale(f2);
    }
}
