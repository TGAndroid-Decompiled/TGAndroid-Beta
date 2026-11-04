package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class sa0 extends Drawable {
    public ra0 f37957a;
    public final Paint f37958b;
    public int f37959c;
    public int d;
    public final long f37960e;
    public int f37961f;

    public sa0() {
        Paint paint = new Paint(1);
        this.f37958b = paint;
        this.f37959c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f37960e = System.currentTimeMillis();
    }

    public final void a(int i3) {
        if (i3 != this.f37961f) {
            int alpha = Color.alpha(i3);
            this.d = alpha;
            this.f37958b.setColor(i0.a.o(i3, (int) ((alpha / 255.0f) * this.f37959c)));
        }
        this.f37961f = i3;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        Paint paint = this.f37958b;
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (min >> 1) - org.telegram.messenger.g0.L(0.5f), paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j10 = this.f37960e;
        canvas.rotate(((((float) (currentTimeMillis - j10)) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - org.telegram.messenger.g0.L(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate(((((float) (currentTimeMillis - j10)) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), org.telegram.messenger.g0.L(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f37957a == null) {
            this.f37957a = new Drawable.ConstantState();
        }
        return this.f37957a;
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
    public final void setAlpha(int i3) {
        if (this.f37959c != i3) {
            this.f37959c = i3;
            this.f37958b.setAlpha((int) ((this.d / 255.0f) * i3));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
