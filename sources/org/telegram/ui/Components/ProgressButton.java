package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
public class ProgressButton extends Button {
    private int angle;
    private boolean drawProgress;
    private long lastUpdateTime;
    private float progressAlpha;
    private final Paint progressPaint;
    private final RectF progressRect;

    public ProgressButton(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(null);
        }
        ViewHelper.setPadding(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int dp = AndroidUtilities.dp(60.0f);
        setMinWidth(dp);
        setMinimumWidth(dp);
        this.progressRect = new RectF();
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.drawProgress || this.progressAlpha != 0.0f) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
            this.progressRect.set(measuredWidth, AndroidUtilities.dp(3.0f), measuredWidth + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(11.0f));
            this.progressPaint.setAlpha(Math.min(255, (int) (this.progressAlpha * 255.0f)));
            canvas.drawArc(this.progressRect, this.angle, 220.0f, false, this.progressPaint);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.lastUpdateTime - System.currentTimeMillis()) < 1000) {
                long j = currentTimeMillis - this.lastUpdateTime;
                int i = (int) (this.angle + (((float) (360 * j)) / 2000.0f));
                this.angle = i;
                this.angle = i - ((i / 360) * 360);
                if (this.drawProgress) {
                    float f = this.progressAlpha;
                    if (f < 1.0f) {
                        float f2 = f + (((float) j) / 200.0f);
                        this.progressAlpha = f2;
                        if (f2 > 1.0f) {
                            this.progressAlpha = 1.0f;
                        }
                    }
                } else {
                    float f3 = this.progressAlpha;
                    if (f3 > 0.0f) {
                        float f4 = f3 - (((float) j) / 200.0f);
                        this.progressAlpha = f4;
                        if (f4 < 0.0f) {
                            this.progressAlpha = 0.0f;
                        }
                    }
                }
            }
            this.lastUpdateTime = currentTimeMillis;
            postInvalidateOnAnimation();
        }
    }

    public void setBackgroundRoundRect(int i, int i2) {
        setBackgroundRoundRect(i, i2, 4.0f);
    }

    public void setBackgroundRoundRect(int i, int i2, float f) {
        setBackground(Theme.AdaptiveRipple.filledRect(i, f));
    }

    public void setProgressColor(int i) {
        this.progressPaint.setColor(i);
    }

    public void setDrawProgress(boolean z, boolean z2) {
        if (this.drawProgress != z) {
            this.drawProgress = z;
            if (!z2) {
                this.progressAlpha = z ? 1.0f : 0.0f;
            }
            this.lastUpdateTime = System.currentTimeMillis();
            invalidate();
        }
    }
}
