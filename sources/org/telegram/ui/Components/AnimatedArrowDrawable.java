package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

public final class AnimatedArrowDrawable extends Drawable {
    public float animProgress;
    public float animateToProgress;
    public final float customHeightDp;
    public final float customStrokeWidthDp;
    public final float customWidthDp;
    public final boolean isSmall;
    public long lastUpdateTime;
    public final Paint paint;
    public final Path path = new Path();

    public AnimatedArrowDrawable(int i, boolean z) {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(i);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.isSmall = z;
        updatePath();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.path, this.paint);
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

    @Override
    public final int getIntrinsicHeight() {
        float f = this.customHeightDp;
        return f > 0.0f ? AndroidUtilities.dp(f) : AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        float f = this.customWidthDp;
        return f > 0.0f ? AndroidUtilities.dp(f) : AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void updatePath() {
        Path path = this.path;
        path.reset();
        float f = (this.animProgress * 2.0f) - 1.0f;
        float f2 = this.customWidthDp;
        if (f2 > 0.0f) {
            float f3 = this.customHeightDp;
            if (f3 > 0.0f) {
                float fDpf2 = AndroidUtilities.dpf2(this.customStrokeWidthDp) / 2.0f;
                float fDpf3 = AndroidUtilities.dpf2(f2) - fDpf2;
                float fDpf4 = AndroidUtilities.dpf2(f3) - fDpf2;
                float f4 = fDpf4 - fDpf2;
                path.moveTo(fDpf2, fDpf4 - (this.animProgress * f4));
                path.lineTo((fDpf2 + fDpf3) / 2.0f, (this.animProgress * f4) + fDpf2);
                path.lineTo(fDpf3, fDpf4 - (f4 * this.animProgress));
                return;
            }
        }
        if (this.isSmall) {
            path.moveTo(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f));
            path.lineTo(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(2.0f) * f) + AndroidUtilities.dp(6.0f));
            path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f));
            return;
        }
        path.moveTo(AndroidUtilities.dp(4.5f), (AndroidUtilities.dp(2.0f) * this.animProgress) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f)));
        path.lineTo(AndroidUtilities.dp(13.0f), (AndroidUtilities.dp(2.0f) * this.animProgress) + (AndroidUtilities.dp(4.0f) * f) + AndroidUtilities.dp(12.0f));
        path.lineTo(AndroidUtilities.dp(21.5f), (AndroidUtilities.dp(2.0f) * this.animProgress) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f)));
    }

    public AnimatedArrowDrawable(int i) {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(i);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.isSmall = true;
        this.customWidthDp = 12.66f;
        this.customHeightDp = 6.16f;
        this.customStrokeWidthDp = 1.66f;
        updatePath();
    }
}
