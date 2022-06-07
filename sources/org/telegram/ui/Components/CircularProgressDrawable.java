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
    private final RectF bounds;
    private final FastOutSlowInInterpolator interpolator;
    private final Paint paint;
    private float segmentFrom;
    private float segmentTo;
    private float size;
    private long start;
    private float thickness;

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
        this.size = AndroidUtilities.dp(18.0f);
        this.thickness = AndroidUtilities.dp(2.25f);
        this.start = -1L;
        this.interpolator = new FastOutSlowInInterpolator();
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.bounds = new RectF();
        setColor(i);
    }

    public CircularProgressDrawable(float f, float f2, int i) {
        this.size = AndroidUtilities.dp(18.0f);
        this.thickness = AndroidUtilities.dp(2.25f);
        this.start = -1L;
        this.interpolator = new FastOutSlowInInterpolator();
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.bounds = new RectF();
        this.size = f;
        this.thickness = f2;
        setColor(i);
    }

    private void updateSegment() {
        int i;
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.start) % 5400;
        float f = ((float) (1520 * elapsedRealtime)) / 5400.0f;
        this.segmentFrom = f - 20.0f;
        this.segmentTo = f;
        for (int i2 = 0; i2 < 4; i2++) {
            this.segmentTo += this.interpolator.getInterpolation(((float) (elapsedRealtime - (i2 * 1350))) / 667.0f) * 250.0f;
            this.segmentFrom += this.interpolator.getInterpolation(((float) (elapsedRealtime - (i + 667))) / 667.0f) * 250.0f;
        }
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
        RectF rectF = this.bounds;
        float f = i;
        float f2 = i3 - i;
        float f3 = this.thickness;
        float f4 = this.size;
        float f5 = i2;
        float f6 = i4 - i2;
        rectF.set((((f2 - (f3 / 2.0f)) - f4) / 2.0f) + f, (((f6 - (f3 / 2.0f)) - f4) / 2.0f) + f5, f + (((f2 + (f3 / 2.0f)) + f4) / 2.0f), f5 + (((f6 + (f3 / 2.0f)) + f4) / 2.0f));
        super.setBounds(i, i2, i3, i4);
        this.paint.setStrokeWidth(this.thickness);
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }
}
