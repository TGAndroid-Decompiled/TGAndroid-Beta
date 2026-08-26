package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public final class RadialProgress {
    public static DecelerateInterpolator decelerateInterpolator;
    public Drawable currentDrawable;
    public boolean currentWithRound;
    public final View parent;
    public Drawable previousDrawable;
    public boolean previousWithRound;
    public final Paint progressPaint;
    public boolean roundRectProgress;
    public long lastUpdateTime = 0;
    public float radOffset = 0.0f;
    public float currentProgress = 0.0f;
    public float animationProgressStart = 0.0f;
    public long currentProgressTime = 0;
    public float animatedProgressValue = 0.0f;
    public final RectF progressRect = new RectF();
    public final RectF cicleRect = new RectF();
    public float animatedAlphaValue = 1.0f;
    public int progressColor = -1;
    public int diff = AndroidUtilities.dp(4.0f);
    public final boolean alphaForPrevious = true;
    public final float overrideAlpha = 1.0f;
    public Paint overridePaint = null;
    public float rotationSpeed = 3000.0f;
    public final Path roundProgressRectPath = new Path();
    public final Matrix roundProgressRectMatrix = new Matrix();
    public final PathMeasure roundProgressRectPathMeasure = new PathMeasure();
    public final Path roundRectProgressPath = new Path();

    public RadialProgress(View view) {
        if (decelerateInterpolator == null) {
            decelerateInterpolator = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1);
        this.parent = view;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.previousDrawable;
        RectF rectF = this.progressRect;
        float f = this.overrideAlpha;
        if (drawable != null) {
            if (this.alphaForPrevious) {
                drawable.setAlpha((int) (this.animatedAlphaValue * 255.0f * f));
            } else {
                drawable.setAlpha((int) (f * 255.0f));
            }
            this.previousDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.previousDrawable.draw(canvas);
        }
        Drawable drawable2 = this.currentDrawable;
        if (drawable2 != null) {
            if (this.previousDrawable != null) {
                drawable2.setAlpha((int) ((1.0f - this.animatedAlphaValue) * 255.0f * f));
            } else {
                drawable2.setAlpha((int) (f * 255.0f));
            }
            this.currentDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.currentDrawable.draw(canvas);
        }
        if (!this.currentWithRound && !this.previousWithRound) {
            updateAnimation(false);
            return;
        }
        Paint paint = this.overridePaint;
        if (paint == null) {
            paint = this.progressPaint;
            paint.setColor(this.progressColor);
            if (this.previousWithRound) {
                paint.setAlpha((int) (this.animatedAlphaValue * 255.0f * f));
            } else {
                paint.setAlpha((int) (f * 255.0f));
            }
        }
        Paint paint2 = paint;
        RectF rectF2 = this.cicleRect;
        float f2 = rectF.left;
        float f3 = this.diff;
        rectF2.set(f2 + f3, rectF.top + f3, rectF.right - f3, rectF.bottom - f3);
        drawArc(this.radOffset - 90.0f, Math.max(4.0f, this.animatedProgressValue * 360.0f), canvas, paint2, rectF2);
        updateAnimation(true);
    }

    public final void drawArc(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
        if (!this.roundRectProgress) {
            canvas.drawArc(rectF, f, f2, false, paint);
            return;
        }
        float fHeight = rectF.height() * 0.32f;
        if (Math.abs(f2) == 360.0f) {
            canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
            return;
        }
        float f3 = ((((int) f) / 90) * 90) + 90;
        float f4 = (-199.0f) + f3;
        float f5 = ((f + f2) - f4) / 360.0f;
        Path path = this.roundProgressRectPath;
        path.rewind();
        path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
        Matrix matrix = this.roundProgressRectMatrix;
        matrix.reset();
        matrix.postRotate(f3, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.roundProgressRectPathMeasure;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.roundRectProgressPath;
        path2.reset();
        pathMeasure.getSegment(((f - f4) / 360.0f) * length, length * f5, path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
        if (f5 > 1.0f) {
            drawArc(f + 90.0f, f2 - 90.0f, canvas, paint, rectF);
        }
    }

    public final void invalidateParent() {
        int iDp = AndroidUtilities.dp(2.0f);
        RectF rectF = this.progressRect;
        int i = ((int) rectF.left) - iDp;
        int i2 = ((int) rectF.top) - iDp;
        int i3 = iDp * 2;
        this.parent.invalidate(i, i2, ((int) rectF.right) + i3, ((int) rectF.bottom) + i3);
    }

    public final void setBackground(Drawable drawable, boolean z, boolean z2) {
        Drawable drawable2;
        this.lastUpdateTime = System.currentTimeMillis();
        if (!z2 || (drawable2 = this.currentDrawable) == drawable) {
            this.previousDrawable = null;
            this.previousWithRound = false;
        } else {
            this.previousDrawable = drawable2;
            this.previousWithRound = this.currentWithRound;
            this.animatedAlphaValue = 1.0f;
            setProgress(1.0f, z2);
        }
        this.currentWithRound = z;
        this.currentDrawable = drawable;
        if (z2) {
            invalidateParent();
        } else {
            this.parent.invalidate();
        }
    }

    public final void setProgress(float f, boolean z) {
        if (f != 1.0f && this.animatedAlphaValue != 0.0f && this.previousDrawable != null) {
            this.animatedAlphaValue = 0.0f;
            this.previousDrawable = null;
        }
        if (z) {
            if (this.animatedProgressValue > f) {
                this.animatedProgressValue = f;
            }
            this.animationProgressStart = this.animatedProgressValue;
        } else {
            this.animatedProgressValue = f;
            this.animationProgressStart = f;
        }
        this.currentProgress = f;
        this.currentProgressTime = 0L;
        invalidateParent();
    }

    public final void setProgressRect(int i, int i2, int i3, int i4) {
        this.progressRect.set(i, i2, i3, i4);
    }

    public final void updateAnimation(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentTimeMillis;
        if (!z) {
            if (this.previousDrawable != null) {
                float f = this.animatedAlphaValue - (j / 200.0f);
                this.animatedAlphaValue = f;
                if (f <= 0.0f) {
                    this.animatedAlphaValue = 0.0f;
                    this.previousDrawable = null;
                }
                invalidateParent();
                return;
            }
            return;
        }
        if (this.animatedProgressValue != 1.0f) {
            this.radOffset = ((360 * j) / this.rotationSpeed) + this.radOffset;
            float f2 = this.currentProgress;
            float f3 = this.animationProgressStart;
            float f4 = f2 - f3;
            if (f4 > 0.0f) {
                long j2 = this.currentProgressTime + j;
                this.currentProgressTime = j2;
                if (j2 >= 300) {
                    this.animatedProgressValue = f2;
                    this.animationProgressStart = f2;
                    this.currentProgressTime = 0L;
                } else {
                    this.animatedProgressValue = (decelerateInterpolator.getInterpolation(j2 / 300.0f) * f4) + f3;
                }
            }
            invalidateParent();
        }
        if (this.animatedProgressValue < 1.0f || this.previousDrawable == null) {
            return;
        }
        float f5 = this.animatedAlphaValue - (j / 200.0f);
        this.animatedAlphaValue = f5;
        if (f5 <= 0.0f) {
            this.animatedAlphaValue = 0.0f;
            this.previousDrawable = null;
        }
        invalidateParent();
    }
}
