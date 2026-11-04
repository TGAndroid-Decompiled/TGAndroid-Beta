package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class jk0 extends FrameLayout {
    public final Paint f35095a;
    public final p30 f35096b;
    public final RectF f35097c;
    public final float d;
    public float f35098e;

    public jk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f35095a = paint;
        p30 p30Var = new p30(this, 1);
        this.f35096b = p30Var;
        this.f35097c = new RectF();
        this.d = (org.telegram.messenger.g0.L(3.0f) * 0.5f) + org.telegram.messenger.g0.L(5.0f);
        a(paint, 0.2f);
        a(p30Var, 1.0f);
        setWillNotDraw(false);
    }

    public static void a(Paint paint, float f10) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f10 * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.d;
        RectF rectF = this.f35097c;
        rectF.set(f10, f10, getWidth() - f10, getHeight() - f10);
        canvas.drawOval(rectF, this.f35095a);
        canvas.drawArc(rectF, -90.0f, this.f35098e * 360.0f, false, this.f35096b);
    }

    public Paint getPaint() {
        return this.f35096b;
    }

    public void setProgress(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (this.f35098e == max) {
            return;
        }
        this.f35098e = max;
        invalidate();
    }
}
