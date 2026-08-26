package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class LocationMessageLoadingDrawable extends Drawable {
    private Paint paint;
    private float[] radii = new float[8];
    private float[] tempRadii = new float[8];
    private Path tempPath = new Path();
    private RectF tempRect = new RectF();

    public LocationMessageLoadingDrawable() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(-65536);
    }

    @Override
    public void draw(Canvas canvas) {
        this.tempPath.rewind();
        this.tempRect.set(getBounds());
        this.tempPath.addRoundRect(this.tempRect, this.radii, Path.Direction.CW);
        canvas.drawPath(this.tempPath, this.paint);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setRadii(float f, float f2, float f3, float f4) {
        setRadii(this.radii, f, f2, f3, f4);
    }

    private void setRadii(float[] fArr, float f, float f2, float f3, float f4) {
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
    }
}
