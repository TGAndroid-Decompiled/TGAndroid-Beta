package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ni0 extends Drawable {
    public final View f31072a;
    public final Paint f31073b;
    public final Path f31074c;
    public int d;
    public boolean f31075e;
    public final d6 f31076f;

    public ni0(View view) {
        Paint paint = new Paint(1);
        this.f31073b = paint;
        Path path = new Path();
        this.f31074c = path;
        this.d = 255;
        this.f31072a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f31076f = new d6(view, 0L, 350L, jr.h);
        float dpf2 = AndroidUtilities.dpf2(4.66f);
        float dpf22 = AndroidUtilities.dpf2(2.16f);
        path.rewind();
        path.moveTo(dpf2 / 2.0f, 0.0f);
        float f9 = (-dpf2) / 2.0f;
        path.lineTo(f9, 0.0f);
        float f10 = f9 + dpf22;
        path.lineTo(f10, -dpf22);
        path.moveTo(f9, 0.0f);
        path.lineTo(f10, dpf22);
    }

    @Override
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float e10 = this.f31076f.e(this.f31075e);
        float dpf2 = AndroidUtilities.dpf2(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(dpf2, dpf2);
        canvas.rotate(45.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e10), 1.0f);
        Path path = this.f31074c;
        Paint paint = this.f31073b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f9 = -dpf2;
        canvas.translate(f9, f9);
        canvas.rotate(225.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e10), 1.0f);
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
        this.f31073b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
