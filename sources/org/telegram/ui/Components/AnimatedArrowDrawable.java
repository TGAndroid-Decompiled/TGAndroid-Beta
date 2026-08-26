package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

public class AnimatedArrowDrawable extends Drawable {
    private float animProgress;
    private float animateToProgress;
    private float customHeightDp;
    private float customStrokeWidthDp;
    private float customWidthDp;
    private boolean isSmall;
    private long lastUpdateTime;
    private Paint paint;
    private Path path = new Path();

    public AnimatedArrowDrawable(int i, boolean z) {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.paint.setColor(i);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.isSmall = z;
        updatePath();
    }

    private void checkAnimation() {
        if (this.animateToProgress != this.animProgress) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.lastUpdateTime;
            this.lastUpdateTime = jElapsedRealtime;
            float f = this.animProgress;
            float f2 = this.animateToProgress;
            if (f < f2) {
                float f3 = (j / 180.0f) + f;
                this.animProgress = f3;
                if (f3 > f2) {
                    this.animProgress = f2;
                }
            } else {
                float f4 = f - (j / 180.0f);
                this.animProgress = f4;
                if (f4 < f2) {
                    this.animProgress = f2;
                }
            }
            updatePath();
            invalidateSelf();
        }
    }

    private void updatePath() {
        this.path.reset();
        float f = (this.animProgress * 2.0f) - 1.0f;
        if (this.customWidthDp > 0.0f && this.customHeightDp > 0.0f) {
            float fDpf2 = AndroidUtilities.dpf2(this.customStrokeWidthDp) / 2.0f;
            float fDpf3 = AndroidUtilities.dpf2(this.customWidthDp) - fDpf2;
            float fDpf4 = AndroidUtilities.dpf2(this.customHeightDp) - fDpf2;
            float f2 = fDpf4 - fDpf2;
            this.path.moveTo(fDpf2, fDpf4 - (this.animProgress * f2));
            this.path.lineTo((fDpf2 + fDpf3) / 2.0f, (this.animProgress * f2) + fDpf2);
            this.path.lineTo(fDpf3, fDpf4 - (f2 * this.animProgress));
            return;
        }
        if (this.isSmall) {
            this.path.moveTo(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f));
            this.path.lineTo(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(2.0f) * f) + AndroidUtilities.dp(6.0f));
            this.path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f));
            return;
        }
        this.path.moveTo(AndroidUtilities.dp(4.5f), (AndroidUtilities.dp(2.0f) * this.animProgress) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f)));
        this.path.lineTo(AndroidUtilities.dp(13.0f), (AndroidUtilities.dp(2.0f) * this.animProgress) + (AndroidUtilities.dp(4.0f) * f) + AndroidUtilities.dp(12.0f));
        this.path.lineTo(AndroidUtilities.dp(21.5f), (AndroidUtilities.dp(2.0f) * this.animProgress) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f)));
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath(this.path, this.paint);
        checkAnimation();
    }

    public float getAnimationProgress() {
        return this.animProgress;
    }

    @Override
    public int getIntrinsicHeight() {
        float f = this.customHeightDp;
        return f > 0.0f ? AndroidUtilities.dp(f) : AndroidUtilities.dp(26.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        float f = this.customWidthDp;
        return f > 0.0f ? AndroidUtilities.dp(f) : AndroidUtilities.dp(26.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    public void setAnimationProgress(float f) {
        this.animProgress = f;
        this.animateToProgress = f;
        updatePath();
        invalidateSelf();
    }

    public void setAnimationProgressAnimated(float f) {
        if (this.animateToProgress == f) {
            return;
        }
        this.animateToProgress = f;
        this.lastUpdateTime = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public void setColor(int i) {
        this.paint.setColor(i);
        invalidateSelf();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i, float f, float f2, float f3) {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(AndroidUtilities.dpf2(f3));
        this.paint.setColor(i);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.isSmall = true;
        this.customWidthDp = f;
        this.customHeightDp = f2;
        this.customStrokeWidthDp = f3;
        updatePath();
    }
}
