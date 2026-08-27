package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class ei0 extends Drawable {

    public final View f28066a;

    public final Paint f28067b;

    public final Path f28068c;
    public int d;

    public boolean f28069e;

    public final y5 f28070f;

    public ei0(View view) {
        Paint paint = new Paint(1);
        this.f28067b = paint;
        Path path = new Path();
        this.f28068c = path;
        this.d = 255;
        this.f28066a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f28070f = new y5(view, 0L, 350L, er.h);
        float fDpf2 = AndroidUtilities.dpf2(4.66f);
        float fDpf3 = AndroidUtilities.dpf2(2.16f);
        path.rewind();
        path.moveTo(fDpf2 / 2.0f, 0.0f);
        float f10 = (-fDpf2) / 2.0f;
        path.lineTo(f10, 0.0f);
        float f11 = f10 + fDpf3;
        path.lineTo(f11, -fDpf3);
        path.moveTo(f10, 0.0f);
        path.lineTo(f11, fDpf3);
    }

    @Override
    public final void draw(Canvas canvas) {
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        float fE = this.f28070f.e(this.f28069e);
        float fDpf2 = AndroidUtilities.dpf2(2.51f);
        canvas.save();
        canvas.translate(iCenterX, iCenterY);
        canvas.save();
        canvas.translate(fDpf2, fDpf2);
        canvas.rotate(45.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, fE), 1.0f);
        Path path = this.f28068c;
        Paint paint = this.f28067b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f10 = -fDpf2;
        canvas.translate(f10, f10);
        canvas.rotate(225.0f);
        canvas.scale(AndroidUtilities.lerp(-1.0f, 1.0f, fE), 1.0f);
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
        this.f28067b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
