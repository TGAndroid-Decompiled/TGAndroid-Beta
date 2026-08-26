package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;

public final class BackDrawable extends Drawable {
    public final boolean alwaysClose;
    public float animationTime;
    public int arrowRotation;
    public int color;
    public int currentAnimationTime;
    public float currentRotation;
    public float finalRotation;
    public final DecelerateInterpolator interpolator;
    public long lastFrameTime;
    public final Paint paint;
    public boolean reverseAngle;
    public int rotatedColor;

    public BackDrawable(boolean z) {
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.interpolator = new DecelerateInterpolator();
        this.color = -1;
        this.rotatedColor = -9079435;
        this.animationTime = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.alwaysClose = z;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.currentRotation != this.finalRotation) {
            if (this.lastFrameTime != 0) {
                int iCurrentTimeMillis = this.currentAnimationTime + ((int) (System.currentTimeMillis() - this.lastFrameTime));
                this.currentAnimationTime = iCurrentTimeMillis;
                float f = iCurrentTimeMillis;
                float f2 = this.animationTime;
                if (f >= f2) {
                    this.currentRotation = this.finalRotation;
                } else {
                    float f3 = this.currentRotation;
                    float f4 = this.finalRotation;
                    DecelerateInterpolator decelerateInterpolator = this.interpolator;
                    if (f3 < f4) {
                        this.currentRotation = decelerateInterpolator.getInterpolation(f / f2) * this.finalRotation;
                    } else {
                        this.currentRotation = 1.0f - decelerateInterpolator.getInterpolation(f / f2);
                    }
                }
            }
            this.lastFrameTime = System.currentTimeMillis();
            invalidateSelf();
        }
        Paint paint = this.paint;
        paint.setColor(ColorUtils.blendARGB(this.currentRotation, this.color, this.rotatedColor));
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i = this.arrowRotation;
        if (i != 0) {
            canvas.rotate(i);
        }
        float f5 = this.currentRotation;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (this.alwaysClose) {
            canvas.rotate((this.currentRotation * (this.reverseAngle ? -180 : 180)) + 135.0f);
            f5 = 1.0f;
        } else {
            canvas.rotate(this.currentRotation * (this.reverseAngle ? -225 : 135));
        }
        float f6 = 1.0f - f5;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f5)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f6), 0.0f, paint);
        float fDp = AndroidUtilities.dp(-0.25f);
        float fDp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f5)) - ((paint.getStrokeWidth() / 4.0f) * f6);
        float fDp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f5));
        canvas.drawLine(fDp3, -fDp, 0.0f, -fDp2, paint);
        canvas.drawLine(fDp3, fDp, 0.0f, fDp2, paint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    public final void setColor(int i) {
        this.color = i;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setRotation(float f, boolean z) {
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
}
