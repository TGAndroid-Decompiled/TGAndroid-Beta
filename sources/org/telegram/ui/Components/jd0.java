package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class jd0 extends Drawable {
    public id0 f26339a;
    public final Paint f26340b;
    public int f26341c;
    public int d;
    public final long e;
    public int f26342f;

    public jd0() {
        Paint paint = new Paint(1);
        this.f26340b = paint;
        this.f26341c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.e = System.currentTimeMillis();
    }

    public final void a(int i10) {
        if (i10 != this.f26342f) {
            int alpha = Color.alpha(i10);
            this.d = alpha;
            this.f26340b.setColor(i0.a.k(i10, (int) ((alpha / 255.0f) * this.f26341c)));
        }
        this.f26342f = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        Paint paint = this.f26340b;
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (min >> 1) - AndroidUtilities.dp(0.5f), paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j10 = this.e;
        canvas.rotate(((((float) (currentTimeMillis - j10)) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - AndroidUtilities.dp(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate(((((float) (currentTimeMillis - j10)) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), AndroidUtilities.dp(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f26339a == null) {
            this.f26339a = new Drawable.ConstantState();
        }
        return this.f26339a;
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
        if (this.f26341c != i10) {
            this.f26341c = i10;
            this.f26340b.setAlpha((int) ((this.d / 255.0f) * i10));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
