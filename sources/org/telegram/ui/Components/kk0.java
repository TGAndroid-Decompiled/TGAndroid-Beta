package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class kk0 extends FrameLayout {
    public final Paint f36540a;
    public final w30 f36541b;
    public final RectF f36542c;
    public final float d;
    public float f36543e;

    public kk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f36540a = paint;
        w30 w30Var = new w30(this, 1);
        this.f36541b = w30Var;
        this.f36542c = new RectF();
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
        RectF rectF = this.f36542c;
        rectF.set(f10, f10, getWidth() - f10, getHeight() - f10);
        canvas.drawOval(rectF, this.f36540a);
        canvas.drawArc(rectF, -90.0f, this.f36543e * 360.0f, false, this.f36541b);
    }

    public Paint getPaint() {
        return this.f36541b;
    }

    public void setProgress(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (this.f36543e == max) {
            return;
        }
        this.f36543e = max;
        invalidate();
    }
}
