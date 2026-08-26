package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class ProgressButton extends Button {
    public int angle;
    public boolean drawProgress;
    public long lastUpdateTime;
    public float progressAlpha;
    public final Paint progressPaint;
    public final RectF progressRect;

    public ProgressButton(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setOutlineProvider(null);
        ViewHelper.setPadding(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int iDp = AndroidUtilities.dp(60.0f);
        setMinWidth(iDp);
        setMinimumWidth(iDp);
        this.progressRect = new RectF();
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.drawProgress || this.progressAlpha != 0.0f) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
            RectF rectF = this.progressRect;
            rectF.set(measuredWidth, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f) + measuredWidth, AndroidUtilities.dp(11.0f));
            Paint paint = this.progressPaint;
            paint.setAlpha(Math.min(255, (int) (this.progressAlpha * 255.0f)));
            canvas.drawArc(rectF, this.angle, 220.0f, false, paint);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.lastUpdateTime - System.currentTimeMillis()) < 1000) {
                long j = jCurrentTimeMillis - this.lastUpdateTime;
                int i = (int) (this.angle + ((360 * j) / 2000.0f));
                this.angle = i - ((i / 360) * 360);
                if (this.drawProgress) {
                    float f = this.progressAlpha;
                    if (f < 1.0f) {
                        float f2 = (j / 200.0f) + f;
                        this.progressAlpha = f2;
                        if (f2 > 1.0f) {
                            this.progressAlpha = 1.0f;
                        }
                    }
                } else {
                    float f3 = this.progressAlpha;
                    if (f3 > 0.0f) {
                        float f4 = f3 - (j / 200.0f);
                        this.progressAlpha = f4;
                        if (f4 < 0.0f) {
                            this.progressAlpha = 0.0f;
                        }
                    }
                }
            }
            this.lastUpdateTime = jCurrentTimeMillis;
            postInvalidateOnAnimation();
        }
    }

    public final void setBackgroundRoundRect(float f, int i) {
        setBackground(Theme.AdaptiveRipple.createRect(new float[]{f}, i, Theme.AdaptiveRipple.calcRippleColor(i)));
    }

    public final void setDrawProgress(boolean z, boolean z2) {
        if (this.drawProgress != z) {
            this.drawProgress = z;
            if (!z2) {
                this.progressAlpha = z ? 1.0f : 0.0f;
            }
            this.lastUpdateTime = System.currentTimeMillis();
            invalidate();
        }
    }

    public void setProgressColor(int i) {
        this.progressPaint.setColor(i);
    }
}
