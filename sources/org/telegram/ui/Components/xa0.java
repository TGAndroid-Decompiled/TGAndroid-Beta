package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class xa0 extends Drawable {
    public wa0 f40221a;
    public final Paint f40222b;
    public int f40223c;
    public int d;
    public final long f40224e;
    public int f40225f;

    public xa0() {
        Paint paint = new Paint(1);
        this.f40222b = paint;
        this.f40223c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f40224e = System.currentTimeMillis();
    }

    public final void a(int i7) {
        if (i7 != this.f40225f) {
            int alpha = Color.alpha(i7);
            this.d = alpha;
            this.f40222b.setColor(i0.a.o(i7, (int) ((alpha / 255.0f) * this.f40223c)));
        }
        this.f40225f = i7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        Paint paint = this.f40222b;
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (min >> 1) - org.telegram.messenger.g0.L(0.5f), paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j3 = this.f40224e;
        canvas.rotate(((((float) (currentTimeMillis - j3)) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - org.telegram.messenger.g0.L(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate(((((float) (currentTimeMillis - j3)) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), org.telegram.messenger.g0.L(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f40221a == null) {
            this.f40221a = new Drawable.ConstantState();
        }
        return this.f40221a;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f40223c != i7) {
            this.f40223c = i7;
            this.f40222b.setAlpha((int) ((this.d / 255.0f) * i7));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
