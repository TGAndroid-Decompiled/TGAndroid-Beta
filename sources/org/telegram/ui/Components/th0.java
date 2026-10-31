package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class th0 extends Drawable {
    public final View f30578a;
    public final Paint f30579b;
    public final Path f30580c;
    public int d;
    public boolean e;
    public final t5 f30581f;

    public th0(View view) {
        Paint paint = new Paint(1);
        this.f30579b = paint;
        Path path = new Path();
        this.f30580c = path;
        this.d = 255;
        this.f30578a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.f30581f = new t5(view, 0L, 350L, gr.h);
        float N = org.telegram.messenger.i0.N(4.66f);
        float N2 = org.telegram.messenger.i0.N(2.16f);
        path.rewind();
        path.moveTo(N / 2.0f, 0.0f);
        float f7 = (-N) / 2.0f;
        path.lineTo(f7, 0.0f);
        float f10 = f7 + N2;
        path.lineTo(f10, -N2);
        path.moveTo(f7, 0.0f);
        path.lineTo(f10, N2);
    }

    @Override
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float d = this.f30581f.d(this.e);
        float N = org.telegram.messenger.i0.N(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(N, N);
        canvas.rotate(45.0f);
        canvas.scale(org.telegram.messenger.i0.T1(-1.0f, 1.0f, d), 1.0f);
        Path path = this.f30580c;
        Paint paint = this.f30579b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f7 = -N;
        canvas.translate(f7, f7);
        canvas.rotate(225.0f);
        canvas.scale(org.telegram.messenger.i0.T1(-1.0f, 1.0f, d), 1.0f);
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
        this.f30579b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
