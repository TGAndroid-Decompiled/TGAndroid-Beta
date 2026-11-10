package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class xa0 extends Drawable {
    public wa0 f40274a;
    public final Paint f40275b;
    public int f40276c;
    public int d;
    public final long f40277e;
    public int f40278f;

    public xa0() {
        Paint paint = new Paint(1);
        this.f40275b = paint;
        this.f40276c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f40277e = System.currentTimeMillis();
    }

    public final void a(int i7) {
        if (i7 != this.f40278f) {
            int alpha = Color.alpha(i7);
            this.d = alpha;
            this.f40275b.setColor(i0.a.o(i7, (int) ((alpha / 255.0f) * this.f40276c)));
        }
        this.f40278f = i7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        Paint paint = this.f40275b;
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (min >> 1) - org.telegram.messenger.g0.L(0.5f), paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j3 = this.f40277e;
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
        if (this.f40274a == null) {
            this.f40274a = new Drawable.ConstantState();
        }
        return this.f40274a;
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
        if (this.f40276c != i7) {
            this.f40276c = i7;
            this.f40275b.setAlpha((int) ((this.d / 255.0f) * i7));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
