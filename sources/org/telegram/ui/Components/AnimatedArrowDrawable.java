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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedArrowDrawable.checkAnimation():void");
    }

    private void updatePath() {
        this.path.reset();
        float f = (this.animProgress * 2.0f) - 1.0f;
        if (this.isSmall) {
            this.path.moveTo(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f));
            this.path.lineTo(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(6.0f) + (AndroidUtilities.dp(2.0f) * f));
            this.path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f));
        } else {
            this.path.moveTo(AndroidUtilities.dp(4.5f), AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f));
            this.path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(4.0f) * f));
            this.path.lineTo(AndroidUtilities.dp(21.5f), AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f));
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath(this.path, this.paint);
        checkAnimation();
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(26.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(26.0f);
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
}
