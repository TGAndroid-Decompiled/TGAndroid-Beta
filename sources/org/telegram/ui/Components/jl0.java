package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class jl0 extends FrameLayout {
    public final Paint f27398a;
    public final l40 f27399b;
    public final RectF f27400c;
    public final float d;
    public float e;

    public jl0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f27398a = paint;
        l40 l40Var = new l40(this, 1);
        this.f27399b = l40Var;
        this.f27400c = new RectF();
        this.d = (org.telegram.messenger.i0.L(3.0f) * 0.5f) + org.telegram.messenger.i0.L(5.0f);
        a(paint, 0.2f);
        a(l40Var, 1.0f);
        setWillNotDraw(false);
    }

    public static void a(Paint paint, float f7) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f7 * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.d;
        RectF rectF = this.f27400c;
        rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.f27398a);
        canvas.drawArc(rectF, -90.0f, this.e * 360.0f, false, this.f27399b);
    }

    public Paint getPaint() {
        return this.f27399b;
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.e == max) {
            return;
        }
        this.e = max;
        invalidate();
    }
}
