package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yi0 extends Drawable {
    public final View f33545a;
    public final Paint f33546b;
    public final Path f33547c;
    public int d;
    public boolean f33548e;
    public final z5 f33549f;

    public yi0(View view) {
        Paint paint = new Paint(1);
        this.f33546b = paint;
        Path path = new Path();
        this.f33547c = path;
        this.d = 255;
        this.f33545a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f33549f = new z5(view, 0L, 350L, pr.h);
        float dpf2 = AndroidUtilities.dpf2(4.66f);
        float dpf22 = AndroidUtilities.dpf2(2.16f);
        path.rewind();
        path.moveTo(dpf2 / 2.0f, 0.0f);
        float f10 = (-dpf2) / 2.0f;
        path.lineTo(f10, 0.0f);
        float f11 = f10 + dpf22;
        path.lineTo(f11, -dpf22);
        path.moveTo(f10, 0.0f);
        path.lineTo(f11, dpf22);
    }

    @Override
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float e6 = this.f33549f.e(this.f33548e);
        float dpf2 = AndroidUtilities.dpf2(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(dpf2, dpf2);
        canvas.rotate(45.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e6), 1.0f);
        Path path = this.f33547c;
        Paint paint = this.f33546b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f10 = -dpf2;
        canvas.translate(f10, f10);
        canvas.rotate(225.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, e6), 1.0f);
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
        this.f33546b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
