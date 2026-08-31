package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class nc0 extends Drawable {
    public mc0 f29452a;
    public final Paint f29453b;
    public int f29454c;
    public int d;
    public final long f29455e;
    public int f29456f;

    public nc0() {
        Paint paint = new Paint(1);
        this.f29453b = paint;
        this.f29454c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f29455e = System.currentTimeMillis();
    }

    public final void a(int i10) {
        if (i10 != this.f29456f) {
            int alpha = Color.alpha(i10);
            this.d = alpha;
            this.f29453b.setColor(i0.a.k(i10, (int) ((alpha / 255.0f) * this.f29454c)));
        }
        this.f29456f = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        Paint paint = this.f29453b;
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (min >> 1) - AndroidUtilities.dp(0.5f), paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j10 = this.f29455e;
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
        if (this.f29452a == null) {
            this.f29452a = new Drawable.ConstantState();
        }
        return this.f29452a;
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
        if (this.f29454c != i10) {
            this.f29454c = i10;
            this.f29453b.setAlpha((int) ((this.d / 255.0f) * i10));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
