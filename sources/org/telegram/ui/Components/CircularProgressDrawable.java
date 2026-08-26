package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;

public class CircularProgressDrawable extends Drawable {
    public static final FastOutSlowInInterpolator interpolator = new FastOutSlowInInterpolator();
    public float angleOffset;
    public final RectF bounds;
    public final Paint paint;
    public final float[] segment;
    public float size;
    public long start;
    public final float thickness;

    public CircularProgressDrawable(int i) {
        this.size = AndroidUtilities.dp(18.0f);
        this.thickness = AndroidUtilities.dp(2.25f);
        this.start = -1L;
        this.segment = new float[2];
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.bounds = new RectF();
        paint.setColor(i);
    }

    public static void getSegments(float[] fArr, float f) {
        float f2 = (1520.0f * f) / 5400.0f;
        fArr[0] = Math.max(0.0f, f2 - 20.0f);
        fArr[1] = f2;
        for (int i = 0; i < 4; i++) {
            float f3 = fArr[1];
            int i2 = i * 1350;
            FastOutSlowInInterpolator fastOutSlowInInterpolator = interpolator;
            fArr[1] = (fastOutSlowInInterpolator.getInterpolation((f - i2) / 667.0f) * 250.0f) + f3;
            fArr[0] = (fastOutSlowInInterpolator.getInterpolation((f - (i2 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.start < 0) {
            this.start = SystemClock.elapsedRealtime();
        }
        float fElapsedRealtime = (SystemClock.elapsedRealtime() - this.start) % 5400;
        float[] fArr = this.segment;
        getSegments(fArr, fElapsedRealtime);
        RectF rectF = this.bounds;
        float f = this.angleOffset;
        float f2 = fArr[0];
        canvas.drawArc(rectF, f + f2, fArr[1] - f2, false, this.paint);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.size + this.thickness);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.size + this.thickness);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i3 - i;
        float f3 = this.thickness;
        float f4 = f3 / 2.0f;
        float f5 = this.size;
        float f6 = i2;
        float f7 = i4 - i2;
        this.bounds.set(ImageReceiver$$ExternalSyntheticOutline0.m(f2 - f4, f5, 2.0f, f), (((f7 - f4) - f5) / 2.0f) + f6, (((f2 + f4) + f5) / 2.0f) + f, (((f4 + f7) + f5) / 2.0f) + f6);
        super.setBounds(i, i2, i3, i4);
        this.paint.setStrokeWidth(f3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public CircularProgressDrawable(float f, float f2, int i) {
        this.size = AndroidUtilities.dp(18.0f);
        this.thickness = AndroidUtilities.dp(2.25f);
        this.start = -1L;
        this.segment = new float[2];
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.bounds = new RectF();
        this.size = f;
        this.thickness = f2;
        paint.setColor(i);
    }
}
