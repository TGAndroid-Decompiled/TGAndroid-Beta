package org.telegram.p009ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public class BackDrawable extends Drawable {
    private boolean alwaysClose;
    private int arrowRotation;
    private int currentAnimationTime;
    private float currentRotation;
    private float finalRotation;
    private long lastFrameTime;
    private boolean reverseAngle;
    private Paint paint = new Paint(1);
    private DecelerateInterpolator interpolator = new DecelerateInterpolator();
    private int color = -1;
    private int rotatedColor = -9079435;
    private float animationTime = 300.0f;
    private boolean rotated = true;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BackDrawable(boolean z) {
        this.paint.setStrokeWidth(AndroidUtilities.m34dp(2.0f));
        this.alwaysClose = z;
    }

    public void setColor(int i) {
        this.color = i;
        invalidateSelf();
    }

    public void setRotatedColor(int i) {
        this.rotatedColor = i;
        invalidateSelf();
    }

    public void setArrowRotation(int i) {
        this.arrowRotation = i;
        invalidateSelf();
    }

    public void setRotation(float f, boolean z) {
        this.lastFrameTime = 0L;
        float f2 = this.currentRotation;
        if (f2 == 1.0f) {
            this.reverseAngle = true;
        } else if (f2 == 0.0f) {
            this.reverseAngle = false;
        }
        this.lastFrameTime = 0L;
        if (z) {
            if (f2 < f) {
                this.currentAnimationTime = (int) (f2 * this.animationTime);
            } else {
                this.currentAnimationTime = (int) ((1.0f - f2) * this.animationTime);
            }
            this.lastFrameTime = System.currentTimeMillis();
            this.finalRotation = f;
        } else {
            this.currentRotation = f;
            this.finalRotation = f;
        }
        invalidateSelf();
    }

    public void setAnimationTime(float f) {
        this.animationTime = f;
    }

    @Override
    public void draw(Canvas canvas) {
        float f;
        if (this.currentRotation != this.finalRotation) {
            if (this.lastFrameTime != 0) {
                int currentTimeMillis = (int) (this.currentAnimationTime + (System.currentTimeMillis() - this.lastFrameTime));
                this.currentAnimationTime = currentTimeMillis;
                float f2 = this.animationTime;
                if (currentTimeMillis >= f2) {
                    this.currentRotation = this.finalRotation;
                } else if (this.currentRotation < this.finalRotation) {
                    this.currentRotation = this.interpolator.getInterpolation(currentTimeMillis / f2) * this.finalRotation;
                } else {
                    this.currentRotation = 1.0f - this.interpolator.getInterpolation(currentTimeMillis / f2);
                }
            }
            this.lastFrameTime = System.currentTimeMillis();
            invalidateSelf();
        }
        int i = 0;
        int red = this.rotated ? (int) ((Color.red(this.rotatedColor) - Color.red(this.color)) * this.currentRotation) : 0;
        int green = this.rotated ? (int) ((Color.green(this.rotatedColor) - Color.green(this.color)) * this.currentRotation) : 0;
        if (this.rotated) {
            i = (int) ((Color.blue(this.rotatedColor) - Color.blue(this.color)) * this.currentRotation);
        }
        this.paint.setColor(Color.rgb(Color.red(this.color) + red, Color.green(this.color) + green, Color.blue(this.color) + i));
        canvas.save();
        canvas.translate(getIntrinsicWidth() / 2, getIntrinsicHeight() / 2);
        int i2 = this.arrowRotation;
        if (i2 != 0) {
            canvas.rotate(i2);
        }
        float f3 = this.currentRotation;
        if (!this.alwaysClose) {
            canvas.rotate((this.reverseAngle ? -225 : 135) * f3);
            f = f3;
        } else {
            canvas.rotate((f3 * (this.reverseAngle ? -180 : 180)) + 135.0f);
            f = 1.0f;
        }
        canvas.drawLine((-AndroidUtilities.m34dp(7.0f)) - (AndroidUtilities.m34dp(1.0f) * f), 0.0f, AndroidUtilities.m34dp(8.0f), 0.0f, this.paint);
        float f4 = -AndroidUtilities.m34dp(0.5f);
        float dp = AndroidUtilities.m34dp(7.0f) + (AndroidUtilities.m34dp(1.0f) * f);
        float dp2 = (-AndroidUtilities.m34dp(7.0f)) + (AndroidUtilities.m34dp(7.0f) * f);
        float dp3 = AndroidUtilities.m34dp(0.5f) - (AndroidUtilities.m34dp(0.5f) * f);
        canvas.drawLine(dp2, -f4, dp3, -dp, this.paint);
        canvas.drawLine(dp2, f4, dp3, dp, this.paint);
        canvas.restore();
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.m34dp(24.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.m34dp(24.0f);
    }
}
