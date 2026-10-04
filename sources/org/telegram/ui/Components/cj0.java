package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cj0 extends Drawable {
    public final View f25393a;
    public final Paint f25394b;
    public final Path f25395c;
    public int d;
    public boolean f25396e;
    public final e6 f25397f;

    public cj0(View view) {
        Paint paint = new Paint(1);
        this.f25394b = paint;
        Path path = new Path();
        this.f25395c = path;
        this.d = 255;
        this.f25393a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f25397f = new e6(view, 0L, 350L, tr.h);
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
        float e7 = this.f25397f.e(this.f25396e);
        float dpf2 = AndroidUtilities.dpf2(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(dpf2, dpf2);
        canvas.rotate(45.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e7), 1.0f);
        Path path = this.f25395c;
        Paint paint = this.f25394b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f7 = -dpf2;
        canvas.translate(f7, f7);
        canvas.rotate(225.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e7), 1.0f);
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
        this.f25394b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
