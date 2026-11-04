package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ug0 extends Drawable {
    public final View f38741a;
    public final Paint f38742b;
    public final Path f38743c;
    public int d;
    public boolean f38744e;
    public final u5 f38745f;

    public ug0(View view) {
        Paint paint = new Paint(1);
        this.f38742b = paint;
        Path path = new Path();
        this.f38743c = path;
        this.d = 255;
        this.f38741a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f38745f = new u5(view, 0L, 350L, xq.h);
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
        float d = this.f38745f.d(this.f38744e);
        float N = org.telegram.messenger.g0.N(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(N, N);
        canvas.rotate(45.0f);
        canvas.scale(org.telegram.messenger.g0.T1(-1.0f, 1.0f, d), 1.0f);
        Path path = this.f38743c;
        Paint paint = this.f38742b;
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
    public final void setAlpha(int i3) {
        this.d = i3;
        this.f38742b.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
