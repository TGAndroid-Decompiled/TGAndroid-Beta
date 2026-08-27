package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class ub0 extends Drawable {

    public tb0 f33032a;

    public final Paint f33033b;

    public int f33034c;
    public int d;

    public final long f33035e;

    public int f33036f;

    public ub0() {
        Paint paint = new Paint(1);
        this.f33033b = paint;
        this.f33034c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f33035e = System.currentTimeMillis();
    }

    public final void a(int i10) {
        if (i10 != this.f33036f) {
            int iAlpha = Color.alpha(i10);
            this.d = iAlpha;
            this.f33033b.setColor(i0.b.k(i10, (int) ((iAlpha / 255.0f) * this.f33034c)));
        }
        this.f33036f = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iMin = Math.min(bounds.width(), bounds.height());
        float fCenterX = bounds.centerX();
        float fCenterY = bounds.centerY();
        float fDp = (iMin >> 1) - AndroidUtilities.dp(0.5f);
        Paint paint = this.f33033b;
        canvas.drawCircle(fCenterX, fCenterY, fDp, paint);
        long jCurrentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j10 = this.f33035e;
        canvas.rotate((((jCurrentTimeMillis - j10) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - AndroidUtilities.dp(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate((((jCurrentTimeMillis - j10) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), AndroidUtilities.dp(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f33032a == null) {
            this.f33032a = new tb0();
        }
        return this.f33032a;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f33034c != i10) {
            this.f33034c = i10;
            this.f33033b.setAlpha((int) ((this.d / 255.0f) * i10));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
