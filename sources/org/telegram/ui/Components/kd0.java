package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class kd0 extends Drawable {
    public jd0 f27998a;
    public final Paint f27999b;
    public int f28000c;
    public int d;
    public final long f28001e;
    public int f28002f;

    public kd0() {
        Paint paint = new Paint(1);
        this.f27999b = paint;
        this.f28000c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f28001e = System.currentTimeMillis();
    }

    public final void a(int i10) {
        if (i10 != this.f28002f) {
            int alpha = Color.alpha(i10);
            this.d = alpha;
            this.f27999b.setColor(i0.a.k(i10, (int) ((alpha / 255.0f) * this.f28000c)));
        }
        this.f28002f = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        Paint paint = this.f27999b;
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (min >> 1) - AndroidUtilities.dp(0.5f), paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j3 = this.f28001e;
        canvas.rotate(((((float) (currentTimeMillis - j3)) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - AndroidUtilities.dp(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate(((((float) (currentTimeMillis - j3)) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), AndroidUtilities.dp(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f27998a == null) {
            this.f27998a = new Drawable.ConstantState();
        }
        return this.f27998a;
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
        if (this.f28000c != i10) {
            this.f28000c = i10;
            this.f27999b.setAlpha((int) ((this.d / 255.0f) * i10));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
