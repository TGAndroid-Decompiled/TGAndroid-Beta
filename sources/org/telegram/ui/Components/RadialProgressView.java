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
    private static final float risingTime = 500.0f;
    private static final float rotationTime = 2000.0f;
    private AccelerateInterpolator accelerateInterpolator;
    private float animatedProgress;
    private RectF cicleRect;
    private float currentCircleLength;
    private float currentProgress;
    private float currentProgressTime;
    private DecelerateInterpolator decelerateInterpolator;
    private float drawingCircleLenght;
    private long lastUpdateTime;
    private boolean noProgress;
    private float progressAnimationStart;
    private int progressColor;
    private Paint progressPaint;
    private int progressTime;
    private float radOffset;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean risingCircleLength;
    private int size;
    private boolean toCircle;
    private float toCircleProgress;
    private boolean useSelfAlpha;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private void updateAnimation() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        if (j > 17) {
            j = 17;
        }
        this.lastUpdateTime = jCurrentTimeMillis;
        updateAnimation(j);
    }

    public void draw(Canvas canvas, float f, float f2) {
        RectF rectF = this.cicleRect;
        float f3 = this.size / 2.0f;
        rectF.set(f - f3, f2 - f3, f + f3, f3 + f2);
        RectF rectF2 = this.cicleRect;
        float f4 = this.radOffset;
        float f5 = this.currentCircleLength;
        this.drawingCircleLenght = f5;
        canvas.drawArc(rectF2, f4, f5, false, this.progressPaint);
        updateAnimation();
    }

    public boolean isCircle() {
        return Math.abs(this.drawingCircleLenght) >= 360.0f;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.size) / 2;
        int measuredHeight = getMeasuredHeight();
        int i = this.size;
        int i2 = (measuredHeight - i) / 2;
        this.cicleRect.set(measuredWidth, i2, measuredWidth + i, i2 + i);
        RectF rectF = this.cicleRect;
        float f = this.radOffset;
        float f2 = this.currentCircleLength;
        this.drawingCircleLenght = f2;
        canvas.drawArc(rectF, f, f2, false, this.progressPaint);
        updateAnimation();
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

    public void sync(RadialProgressView radialProgressView) {
        this.lastUpdateTime = radialProgressView.lastUpdateTime;
        this.radOffset = radialProgressView.radOffset;
        this.toCircle = radialProgressView.toCircle;
        this.toCircleProgress = radialProgressView.toCircleProgress;
        this.noProgress = radialProgressView.noProgress;
        this.currentCircleLength = radialProgressView.currentCircleLength;
        this.drawingCircleLenght = radialProgressView.drawingCircleLenght;
        this.currentProgressTime = radialProgressView.currentProgressTime;
        this.currentProgress = radialProgressView.currentProgress;
        this.progressTime = radialProgressView.progressTime;
        this.animatedProgress = radialProgressView.animatedProgress;
        this.risingCircleLength = radialProgressView.risingCircleLength;
        this.progressAnimationStart = radialProgressView.progressAnimationStart;
        updateAnimation(85L);
    }

    public void toCircle(boolean z, boolean z2) {
        this.toCircle = z;
        if (z2) {
            return;
        }
        this.toCircleProgress = z ? 1.0f : 0.0f;
    }

    public RadialProgressView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.cicleRect = new RectF();
        this.noProgress = true;
        this.resourcesProvider = resourcesProvider;
        this.size = AndroidUtilities.dp(40.0f);
        this.progressColor = getThemedColor(Theme.key_progressCircle);
        this.decelerateInterpolator = new DecelerateInterpolator();
        this.accelerateInterpolator = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.progressPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.progressPaint.setColor(this.progressColor);
    }

    private void updateAnimation(long j) {
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
        if (!this.noProgress) {
            float f6 = this.currentProgress;
            float f7 = this.progressAnimationStart;
            float f8 = f6 - f7;
            if (f8 > 0.0f) {
                int i = (int) (((long) this.progressTime) + j);
                this.progressTime = i;
                float f9 = i;
                if (f9 >= 200.0f) {
                    this.progressAnimationStart = f6;
                    this.animatedProgress = f6;
                    this.progressTime = 0;
                } else {
                    this.animatedProgress = (AndroidUtilities.decelerateInterpolator.getInterpolation(f9 / 200.0f) * f8) + f7;
                }
            }
            this.currentCircleLength = Math.max(4.0f, this.animatedProgress * 360.0f);
        } else if (this.toCircleProgress == 0.0f) {
            float f10 = this.currentProgressTime + j;
            this.currentProgressTime = f10;
            if (f10 >= 500.0f) {
                this.currentProgressTime = 500.0f;
            }
            if (this.risingCircleLength) {
                this.currentCircleLength = (this.accelerateInterpolator.getInterpolation(this.currentProgressTime / 500.0f) * 266.0f) + 4.0f;
            } else {
                this.currentCircleLength = 4.0f - ((1.0f - this.decelerateInterpolator.getInterpolation(this.currentProgressTime / 500.0f)) * 270.0f);
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
            float f11 = this.currentCircleLength;
            float interpolation = (this.toCircleProgress * 360.0f) + (this.accelerateInterpolator.getInterpolation(this.currentProgressTime / 500.0f) * 266.0f) + 4.0f;
            this.currentCircleLength = interpolation;
            float f12 = f11 - interpolation;
            if (f12 > 0.0f) {
                this.radOffset = f12 + this.radOffset;
            }
        } else {
            float f13 = this.currentCircleLength;
            float interpolation2 = (4.0f - ((1.0f - this.decelerateInterpolator.getInterpolation(this.currentProgressTime / 500.0f)) * 270.0f)) - (this.toCircleProgress * 364.0f);
            this.currentCircleLength = interpolation2;
            float f14 = f13 - interpolation2;
            if (f14 > 0.0f) {
                this.radOffset = f14 + this.radOffset;
            }
        }
        invalidate();
    }
}
