package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import org.telegram.messenger.AndroidUtilities;

public class CircularProgressDrawable extends Drawable {
    private final Paint paint;
    private float segmentFrom;
    private float segmentTo;
    private long start = -1;
    private final FastOutSlowInInterpolator interpolator = new FastOutSlowInInterpolator();
    private final RectF bounds = new RectF();

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public CircularProgressDrawable(int i) {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        setColor(i);
    }

    private void updateSegment() {
        float elapsedRealtime = (((float) (SystemClock.elapsedRealtime() - this.start)) % 5400.0f) / 667.0f;
        float f = 187.74815f * elapsedRealtime;
        this.segmentFrom = (((((this.interpolator.getInterpolation(elapsedRealtime - 1.0f) + this.interpolator.getInterpolation(elapsedRealtime - 3.024f)) + this.interpolator.getInterpolation(elapsedRealtime - 5.048f)) + this.interpolator.getInterpolation(elapsedRealtime - 7.072f)) * 250.0f) + f) - 20.0f;
        this.segmentTo = f + ((this.interpolator.getInterpolation(elapsedRealtime) + this.interpolator.getInterpolation(elapsedRealtime - 2.024f) + this.interpolator.getInterpolation(elapsedRealtime - 4.048f) + this.interpolator.getInterpolation(elapsedRealtime - 6.072f)) * 250.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.start < 0) {
            this.start = SystemClock.elapsedRealtime();
        }
        updateSegment();
        RectF rectF = this.bounds;
        float f = this.segmentFrom;
        canvas.drawArc(rectF, f, this.segmentTo - f, false, this.paint);
        invalidateSelf();
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        float dp = AndroidUtilities.dp(9.0f);
        float dp2 = AndroidUtilities.dp(2.25f);
        float f = i;
        float f2 = i3 - i;
        float f3 = dp2 / 2.0f;
        float f4 = i2;
        float f5 = i4 - i2;
        this.bounds.set((((f2 - f3) / 2.0f) + f) - dp, (((f5 - f3) / 2.0f) + f4) - dp, f + ((f2 + f3) / 2.0f) + dp, f4 + ((f5 + f3) / 2.0f) + dp);
        super.setBounds(i, i2, i3, i4);
        this.paint.setStrokeWidth(dp2);
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }
}
