package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class qb0 extends Drawable {
    public pb0 f29706a;
    public final Paint f29707b;
    public int f29708c;
    public int d;
    public final long e;
    public int f29709f;

    public qb0() {
        Paint paint = new Paint(1);
        this.f29707b = paint;
        this.f29708c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.e = System.currentTimeMillis();
    }

    public final void a(int i10) {
        if (i10 != this.f29709f) {
            int alpha = Color.alpha(i10);
            this.d = alpha;
            this.f29707b.setColor(i0.b.o(i10, (int) ((alpha / 255.0f) * this.f29708c)));
        }
        this.f29709f = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        Paint paint = this.f29707b;
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (min >> 1) - org.telegram.messenger.i0.L(0.5f), paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j10 = this.e;
        canvas.rotate(((((float) (currentTimeMillis - j10)) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - org.telegram.messenger.i0.L(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate(((((float) (currentTimeMillis - j10)) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), org.telegram.messenger.i0.L(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f29706a == null) {
            this.f29706a = new Drawable.ConstantState();
        }
        return this.f29706a;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f29708c != i10) {
            this.f29708c = i10;
            this.f29707b.setAlpha((int) ((this.d / 255.0f) * i10));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
