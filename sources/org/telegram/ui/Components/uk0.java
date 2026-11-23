package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class uk0 extends FrameLayout {
    public final Paint f40472a;
    public final h40 f40473b;
    public final RectF f40474c;
    public final float d;
    public float f40475e;

    public uk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40472a = paint;
        h40 h40Var = new h40(this, 1);
        this.f40473b = h40Var;
        this.f40474c = new RectF();
        this.d = (org.telegram.messenger.g0.L(3.0f) * 0.5f) + org.telegram.messenger.g0.L(5.0f);
        a(paint, 0.2f);
        a(h40Var, 1.0f);
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
        RectF rectF = this.f40474c;
        rectF.set(f10, f10, getWidth() - f10, getHeight() - f10);
        canvas.drawOval(rectF, this.f40472a);
        canvas.drawArc(rectF, -90.0f, this.f40475e * 360.0f, false, this.f40473b);
    }

    public Paint getPaint() {
        return this.f40473b;
    }

    public void setProgress(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (this.f40475e == max) {
            return;
        }
        this.f40475e = max;
        invalidate();
    }
}
