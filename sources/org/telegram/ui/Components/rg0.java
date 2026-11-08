package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class rg0 extends Drawable {
    public final View f37654a;
    public final Paint f37655b;
    public final Path f37656c;
    public int d;
    public boolean f37657e;
    public final w5 f37658f;

    public rg0(View view) {
        Paint paint = new Paint(1);
        this.f37655b = paint;
        Path path = new Path();
        this.f37656c = path;
        this.d = 255;
        this.f37654a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f37658f = new w5(view, 0L, 350L, xq.h);
        float N = org.telegram.messenger.g0.N(4.66f);
        float N2 = org.telegram.messenger.g0.N(2.16f);
        path.rewind();
        path.moveTo(N / 2.0f, 0.0f);
        float f10 = (-N) / 2.0f;
        path.lineTo(f10, 0.0f);
        float f11 = f10 + N2;
        path.lineTo(f11, -N2);
        path.moveTo(f10, 0.0f);
        path.lineTo(f11, N2);
    }

    @Override
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float d = this.f37658f.d(this.f37657e);
        float N = org.telegram.messenger.g0.N(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(N, N);
        canvas.rotate(45.0f);
        canvas.scale(org.telegram.messenger.g0.T1(-1.0f, 1.0f, d), 1.0f);
        Path path = this.f37656c;
        Paint paint = this.f37655b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f10 = -N;
        canvas.translate(f10, f10);
        canvas.rotate(225.0f);
        canvas.scale(org.telegram.messenger.g0.T1(-1.0f, 1.0f, d), 1.0f);
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
        this.f37655b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
