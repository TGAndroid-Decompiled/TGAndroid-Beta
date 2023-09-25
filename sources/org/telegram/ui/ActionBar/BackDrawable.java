package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
public class BackDrawable extends Drawable {
    private boolean alwaysClose;
    private int arrowRotation;
    private int currentAnimationTime;
    private float currentRotation;
    private float finalRotation;
    private long lastFrameTime;
    private boolean reverseAngle;
    private Paint paint = new Paint(1);
    private Paint prevPaint = new Paint(1);
    private DecelerateInterpolator interpolator = new DecelerateInterpolator();
    private int color = -1;
    private int rotatedColor = -9079435;
    private float animationTime = 300.0f;
    private boolean rotated = true;

    @Override
    public int getOpacity() {
        return -2;
    }

    public BackDrawable(boolean z) {
        this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.prevPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.prevPaint.setColor(-65536);
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
        this.paint.setColor(Color.rgb(Color.red(this.color) + (this.rotated ? (int) ((Color.red(this.rotatedColor) - Color.red(this.color)) * this.currentRotation) : 0), Color.green(this.color) + (this.rotated ? (int) ((Color.green(this.rotatedColor) - Color.green(this.color)) * this.currentRotation) : 0), Color.blue(this.color) + (this.rotated ? (int) ((Color.blue(this.rotatedColor) - Color.blue(this.color)) * this.currentRotation) : 0)));
        canvas.save();
        canvas.translate(getIntrinsicWidth() / 2, getIntrinsicHeight() / 2);
        int i = this.arrowRotation;
        if (i != 0) {
            canvas.rotate(i);
        }
        float f3 = this.currentRotation;
        if (this.alwaysClose) {
            canvas.rotate((f3 * (this.reverseAngle ? -180 : 180)) + 135.0f);
            f = 1.0f;
        } else {
            canvas.rotate((this.reverseAngle ? -225 : MessagesStorage.LAST_DB_VERSION) * f3);
            f = f3;
        }
        float f4 = 1.0f - f;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f)), 0.0f, AndroidUtilities.dp(8.0f) - ((this.paint.getStrokeWidth() / 2.0f) * f4), 0.0f, this.paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f)) - ((this.paint.getStrokeWidth() / 4.0f) * f4);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f));
        canvas.drawLine(dp3, -dp, 0.0f, -dp2, this.paint);
        canvas.drawLine(dp3, dp, 0.0f, dp2, this.paint);
        canvas.restore();
    }

    @Override
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }
}
