package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class gh0 extends Drawable {
    public final View f35574a;
    public final Paint f35575b;
    public final Path f35576c;
    public int d;
    public boolean f35577e;
    public final d6 f35578f;

    public gh0(View view) {
        Paint paint = new Paint(1);
        this.f35575b = paint;
        Path path = new Path();
        this.f35576c = path;
        this.d = 255;
        this.f35574a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f35578f = new d6(view, 0L, 350L, nr.h);
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
        float d = this.f35578f.d(this.f35577e);
        float N = org.telegram.messenger.g0.N(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(N, N);
        canvas.rotate(45.0f);
        canvas.scale(org.telegram.messenger.g0.T1(-1.0f, 1.0f, d), 1.0f);
        Path path = this.f35576c;
        Paint paint = this.f35575b;
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
        this.f35575b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
