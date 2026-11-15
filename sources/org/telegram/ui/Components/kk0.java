package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class kk0 extends FrameLayout {
    public final Paint f36528a;
    public final w30 f36529b;
    public final RectF f36530c;
    public final float d;
    public float f36531e;

    public kk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f36528a = paint;
        w30 w30Var = new w30(this, 1);
        this.f36529b = w30Var;
        this.f36530c = new RectF();
        this.d = (org.telegram.messenger.g0.L(3.0f) * 0.5f) + org.telegram.messenger.g0.L(5.0f);
        a(paint, 0.2f);
        a(w30Var, 1.0f);
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
        RectF rectF = this.f36530c;
        rectF.set(f10, f10, getWidth() - f10, getHeight() - f10);
        canvas.drawOval(rectF, this.f36528a);
        canvas.drawArc(rectF, -90.0f, this.f36531e * 360.0f, false, this.f36529b);
    }

    public Paint getPaint() {
        return this.f36529b;
    }

    public void setProgress(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (this.f36531e == max) {
            return;
        }
        this.f36531e = max;
        invalidate();
    }
}
