package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class sk0 extends FrameLayout {
    public final Paint f39763a;
    public final e40 f39764b;
    public final RectF f39765c;
    public final float d;
    public float f39766e;

    public sk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f39763a = paint;
        e40 e40Var = new e40(this, 1);
        this.f39764b = e40Var;
        this.f39765c = new RectF();
        this.d = (org.telegram.messenger.g0.L(3.0f) * 0.5f) + org.telegram.messenger.g0.L(5.0f);
        a(paint, 0.2f);
        a(e40Var, 1.0f);
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
        RectF rectF = this.f39765c;
        rectF.set(f10, f10, getWidth() - f10, getHeight() - f10);
        canvas.drawOval(rectF, this.f39763a);
        canvas.drawArc(rectF, -90.0f, this.f39766e * 360.0f, false, this.f39764b);
    }

    public Paint getPaint() {
        return this.f39764b;
    }

    public void setProgress(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (this.f39766e == max) {
            return;
        }
        this.f39766e = max;
        invalidate();
    }
}
