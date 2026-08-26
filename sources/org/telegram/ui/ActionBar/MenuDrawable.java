package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;

public class MenuDrawable extends Drawable {
    public int alpha;
    public int backColor;
    public final Paint backPaint;
    public int currentAnimationTime;
    public float currentRotation;
    public float finalRotation;
    public int iconColor;
    public final DecelerateInterpolator interpolator;
    public long lastFrameTime;
    public boolean miniIcon;
    public final Paint paint;
    public boolean reverseAngle;
    public boolean rotateToBack;
    public boolean roundCap;
    public float typeAnimationProgress;

    public MenuDrawable() {
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.backPaint = paint2;
        this.rotateToBack = true;
        this.interpolator = new DecelerateInterpolator();
        new RectF();
        this.alpha = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.typeAnimationProgress = 1.0f;
    }

    @Override
    public final void draw(Canvas canvas) {
        float fAbs;
        float fDp;
        float fAbs2;
        float fAbs3;
        float fM;
        float strokeWidth;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.lastFrameTime;
        long j2 = jElapsedRealtime - j;
        float f = this.currentRotation;
        float f2 = this.finalRotation;
        if (f != f2) {
            if (j != 0) {
                int i = (int) (((long) this.currentAnimationTime) + j2);
                this.currentAnimationTime = i;
                if (i >= 200) {
                    this.currentRotation = f2;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.interpolator;
                    if (f < f2) {
                        this.currentRotation = decelerateInterpolator.getInterpolation(i / 200.0f) * this.finalRotation;
                    } else {
                        this.currentRotation = 1.0f - decelerateInterpolator.getInterpolation(i / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f3 = this.typeAnimationProgress;
        if (f3 < 1.0f) {
            float f4 = (j2 / 200.0f) + f3;
            this.typeAnimationProgress = f4;
            if (f4 > 1.0f) {
                this.typeAnimationProgress = 1.0f;
            }
            invalidateSelf();
        }
        this.lastFrameTime = jElapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.currentRotation), AndroidUtilities.dp(24.0f) / 2);
        int color = this.iconColor;
        if (color == 0) {
            color = Theme.getColor(null, Theme.key_actionBarDefaultIcon, false);
        }
        int color2 = this.backColor;
        if (color2 == 0) {
            color2 = Theme.getColor(null, Theme.key_actionBarDefault, false);
        }
        boolean z = this.rotateToBack;
        Paint paint = this.paint;
        if (z) {
            canvas.rotate(this.currentRotation * (this.reverseAngle ? -180 : 180), AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(color);
            paint.setAlpha(this.alpha);
            if (this.roundCap) {
                fM = DiffUtil.m(1.0f, this.currentRotation, paint.getStrokeWidth() / 2.0f, AndroidUtilities.dp(0.5f) * this.currentRotation);
            } else {
                fM = 0.0f;
            }
            float fDp2 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.currentRotation)) - 0.0f;
            if (this.roundCap) {
                strokeWidth = (1.0f - this.currentRotation) * (paint.getStrokeWidth() / 2.0f);
            } else {
                strokeWidth = 0.0f;
            }
            canvas.drawLine(fM, 0.0f, fDp2 - strokeWidth, 0.0f, paint);
            fAbs = ((1.0f - Math.abs(this.currentRotation)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.currentRotation) * AndroidUtilities.dp(0.5f));
            fDp = AndroidUtilities.dp(18.0f) - (Math.abs(this.currentRotation) * AndroidUtilities.dp(2.5f));
            fAbs2 = (Math.abs(this.currentRotation) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            fAbs3 = Math.abs(this.currentRotation) * AndroidUtilities.dp(7.5f);
            if (this.roundCap) {
                fAbs3 = DiffUtil.m(1.0f, this.currentRotation, paint.getStrokeWidth() / 2.0f, fAbs3);
                float fDp3 = (AndroidUtilities.dp(0.5f) * this.currentRotation) + fAbs;
                fDp -= ((1.0f - this.currentRotation) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.currentRotation);
                fAbs2 -= AndroidUtilities.dp(0.25f) * this.currentRotation;
                fAbs = (AndroidUtilities.dp(0.25f) * this.currentRotation) + fDp3;
            }
        } else {
            canvas.rotate(this.currentRotation * (this.reverseAngle ? -225 : 135), AndroidUtilities.dp(9.0f), 0.0f);
            if (this.miniIcon) {
                paint.setColor(color);
                paint.setAlpha(this.alpha);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.currentRotation) + ((1.0f - Math.abs(this.currentRotation)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.currentRotation) + ((1.0f - this.currentRotation) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                fAbs = ((1.0f - Math.abs(this.currentRotation)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.currentRotation) * AndroidUtilities.dpf2(0.5f));
                fDp = (Math.abs(this.currentRotation) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.currentRotation)) * AndroidUtilities.dpf2(16.0f));
                fAbs2 = (Math.abs(this.currentRotation) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                fAbs3 = (Math.abs(this.currentRotation) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int color3 = Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false);
                AndroidUtilities.getOffsetColor(color2, Theme.getColor(null, Theme.key_actionBarActionModeDefault, false), this.currentRotation, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(color, color3, this.currentRotation, 1.0f));
                paint.setAlpha(this.alpha);
                canvas.drawLine(this.currentRotation * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.currentRotation)) - 0.0f, 0.0f, paint);
                fAbs = ((1.0f - Math.abs(this.currentRotation)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.currentRotation) * AndroidUtilities.dp(0.5f));
                fDp = AndroidUtilities.dp(18.0f) - (Math.abs(this.currentRotation) * AndroidUtilities.dp(9.0f));
                fAbs2 = (Math.abs(this.currentRotation) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                fAbs3 = Math.abs(this.currentRotation) * AndroidUtilities.dp(9.0f);
            }
        }
        float f5 = fDp;
        float f6 = fAbs3;
        float f7 = fAbs2;
        float f8 = fAbs;
        if (this.miniIcon) {
            canvas.drawLine(f6, -f7, f5, -f8, paint);
            canvas.drawLine(f6, f7, f5, f8, paint);
        } else {
            canvas.drawLine(f6, -f7, f5 - 0.0f, -f8, paint);
            canvas.drawLine(f6, f7, f5, f8, paint);
        }
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
        if (this.alpha != i) {
            this.alpha = i;
            this.paint.setAlpha(i);
            this.backPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
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
                this.currentAnimationTime = (int) (f2 * 200.0f);
            } else {
                this.currentAnimationTime = (int) ((1.0f - f2) * 200.0f);
            }
            this.lastFrameTime = SystemClock.elapsedRealtime();
            this.finalRotation = f;
        } else {
            this.currentRotation = f;
            this.finalRotation = f;
        }
        invalidateSelf();
    }
}
