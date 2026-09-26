package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class aj0 extends Drawable {
    public final View f22707a;
    public final Paint f22708b;
    public final Path f22709c;
    public int d;
    public boolean e;
    public final e6 f22710f;

    public aj0(View view) {
        Paint paint = new Paint(1);
        this.f22708b = paint;
        Path path = new Path();
        this.f22709c = path;
        this.d = 255;
        this.f22707a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f22710f = new e6(view, 0L, 350L, rr.h);
        float dpf2 = AndroidUtilities.dpf2(4.66f);
        float dpf22 = AndroidUtilities.dpf2(2.16f);
        path.rewind();
        path.moveTo(dpf2 / 2.0f, 0.0f);
        float f7 = (-dpf2) / 2.0f;
        path.lineTo(f7, 0.0f);
        float f10 = f7 + dpf22;
        path.lineTo(f10, -dpf22);
        path.moveTo(f7, 0.0f);
        path.lineTo(f10, dpf22);
    }

    @Override
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float e = this.f22710f.e(this.e);
        float dpf2 = AndroidUtilities.dpf2(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(dpf2, dpf2);
        canvas.rotate(45.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e), 1.0f);
        Path path = this.f22709c;
        Paint paint = this.f22708b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f7 = -dpf2;
        canvas.translate(f7, f7);
        canvas.rotate(225.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e), 1.0f);
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
        this.f22708b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
