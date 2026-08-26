package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class RadialProgressView extends View {
    public final AccelerateInterpolator accelerateInterpolator;
    public float animatedProgress;
    public final RectF cicleRect;
    public float currentCircleLength;
    public float currentProgress;
    public float currentProgressTime;
    public final DecelerateInterpolator decelerateInterpolator;
    public float drawingCircleLenght;
    public long lastUpdateTime;
    public boolean noProgress;
    public float progressAnimationStart;
    public int progressColor;
    public final Paint progressPaint;
    public int progressTime;
    public float radOffset;
    public boolean risingCircleLength;
    public int size;
    public boolean toCircle;
    public float toCircleProgress;
    public boolean useSelfAlpha;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void draw(Canvas canvas, float f, float f2) {
        RectF rectF = this.cicleRect;
        float f3 = this.size / 2.0f;
        rectF.set(f - f3, f2 - f3, f + f3, f3 + f2);
        float f4 = this.radOffset;
        float f5 = this.currentCircleLength;
        this.drawingCircleLenght = f5;
        canvas.drawArc(rectF, f4, f5, false, this.progressPaint);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        if (j > 17) {
            j = 17;
        }
        this.lastUpdateTime = jCurrentTimeMillis;
        updateAnimation(j);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.size) / 2;
        int measuredHeight = getMeasuredHeight();
        int i = this.size;
        int i2 = (measuredHeight - i) / 2;
        RectF rectF = this.cicleRect;
        rectF.set(measuredWidth, i2, measuredWidth + i, i2 + i);
        float f = this.radOffset;
        float f2 = this.currentCircleLength;
        this.drawingCircleLenght = f2;
        canvas.drawArc(rectF, f, f2, false, this.progressPaint);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        if (j > 17) {
            j = 17;
        }
        this.lastUpdateTime = jCurrentTimeMillis;
        updateAnimation(j);
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (this.useSelfAlpha) {
            Drawable background = getBackground();
            int i = (int) (f * 255.0f);
            if (background != null) {
                background.setAlpha(i);
            }
            this.progressPaint.setAlpha(i);
        }
    }

    public void setNoProgress(boolean z) {
        this.noProgress = z;
    }

    public void setProgress(float f) {
        this.currentProgress = f;
        if (this.animatedProgress > f) {
            this.animatedProgress = f;
        }
        this.progressAnimationStart = this.animatedProgress;
        this.progressTime = 0;
    }

    public void setProgressColor(int i) {
        this.progressColor = i;
        this.progressPaint.setColor(i);
    }

    public void setSize(int i) {
        this.size = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.progressPaint.setStrokeWidth(AndroidUtilities.dp(f));
    }

    public void setUseSelfAlpha(boolean z) {
        this.useSelfAlpha = z;
    }

    public final void updateAnimation(long j) {
        float f;
        float f2;
        float f3 = ((360 * j) / 2000.0f) + this.radOffset;
        this.radOffset = f3 - (((int) (f3 / 360.0f)) * 360);
        boolean z = this.toCircle;
        if (z) {
            float f4 = this.toCircleProgress;
            if (f4 != 1.0f) {
                float f5 = f4 + 0.07272727f;
                this.toCircleProgress = f5;
                if (f5 > 1.0f) {
                    this.toCircleProgress = 1.0f;
                }
            } else if (!z) {
                f = this.toCircleProgress;
                if (f != 0.0f) {
                    f2 = f - 0.04f;
                    this.toCircleProgress = f2;
                    if (f2 < 0.0f) {
                        this.toCircleProgress = 0.0f;
                    }
                }
            }
        } else if (!z) {
            f = this.toCircleProgress;
            if (f != 0.0f) {
                f2 = f - 0.04f;
                this.toCircleProgress = f2;
                if (f2 < 0.0f) {
                    this.toCircleProgress = 0.0f;
                }
            }
        }
        if (this.noProgress) {
            float f6 = this.toCircleProgress;
            DecelerateInterpolator decelerateInterpolator = this.decelerateInterpolator;
            AccelerateInterpolator accelerateInterpolator = this.accelerateInterpolator;
            if (f6 == 0.0f) {
                float f7 = this.currentProgressTime + j;
                this.currentProgressTime = f7;
                if (f7 >= 500.0f) {
                    this.currentProgressTime = 500.0f;
                }
                if (this.risingCircleLength) {
                    this.currentCircleLength = (accelerateInterpolator.getInterpolation(this.currentProgressTime / 500.0f) * 266.0f) + 4.0f;
                } else {
                    this.currentCircleLength = 4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.currentProgressTime / 500.0f)) * 270.0f);
                }
                if (this.currentProgressTime == 500.0f) {
                    boolean z2 = this.risingCircleLength;
                    if (z2) {
                        this.radOffset += 270.0f;
                        this.currentCircleLength = -266.0f;
                    }
                    this.risingCircleLength = !z2;
                    this.currentProgressTime = 0.0f;
                }
            } else if (this.risingCircleLength) {
                float f8 = this.currentCircleLength;
                float interpolation = (this.toCircleProgress * 360.0f) + (accelerateInterpolator.getInterpolation(this.currentProgressTime / 500.0f) * 266.0f) + 4.0f;
                this.currentCircleLength = interpolation;
                float f9 = f8 - interpolation;
                if (f9 > 0.0f) {
                    this.radOffset = f9 + this.radOffset;
                }
            } else {
                float f10 = this.currentCircleLength;
                float interpolation2 = (4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.currentProgressTime / 500.0f)) * 270.0f)) - (this.toCircleProgress * 364.0f);
                this.currentCircleLength = interpolation2;
                float f11 = f10 - interpolation2;
                if (f11 > 0.0f) {
                    this.radOffset = f11 + this.radOffset;
                }
            }
        } else {
            float f12 = this.currentProgress;
            float f13 = this.progressAnimationStart;
            float f14 = f12 - f13;
            if (f14 > 0.0f) {
                int i = (int) (((long) this.progressTime) + j);
                this.progressTime = i;
                float f15 = i;
                if (f15 >= 200.0f) {
                    this.progressAnimationStart = f12;
                    this.animatedProgress = f12;
                    this.progressTime = 0;
                } else {
                    this.animatedProgress = (AndroidUtilities.decelerateInterpolator.getInterpolation(f15 / 200.0f) * f14) + f13;
                }
            }
            this.currentCircleLength = Math.max(4.0f, this.animatedProgress * 360.0f);
        }
        invalidate();
    }

    public RadialProgressView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.cicleRect = new RectF();
        this.noProgress = true;
        this.size = AndroidUtilities.dp(40.0f);
        this.progressColor = Theme.getColor(Theme.key_progressCircle, resourcesProvider);
        this.decelerateInterpolator = new DecelerateInterpolator();
        this.accelerateInterpolator = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.progressColor);
    }
}
