package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;

public final class InfiniteProgress {
    public final RectF cicleRect = new RectF();
    public float currentCircleLength;
    public float currentProgressTime;
    public long lastUpdateTime;
    public int progressColor;
    public final Paint progressPaint;
    public float radOffset;
    public final int radius;
    public boolean risingCircleLength;

    public InfiniteProgress(int i) {
        this.radius = i;
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
