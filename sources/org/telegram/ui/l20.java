package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class l20 extends FrameLayout {
    public final RectF f47448a;
    public final RectF f47449b;
    public final RectF f47450c;
    public final Paint d;
    public final e40 f47451e;

    public l20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f47451e = e40Var;
        this.f47448a = new RectF();
        this.f47449b = new RectF();
        this.f47450c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e40 e40Var = this.f47451e;
        m20 m20Var = e40Var.f45282w1;
        float y10 = m20Var.getY() + m20Var.getMeasuredHeight();
        te.c cVar = e40Var.s5;
        RectF rectF = this.f47448a;
        rectF.set(0.0f, y10 - cVar.f55505f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f47449b;
        rectF2.set(0.0f, m20Var.getY() + m20Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = m20Var.getY() + m20Var.getMeasuredHeight();
        RectF rectF3 = this.f47450c;
        rectF3.set(0.0f, (m20Var.getY() + m20Var.getMeasuredHeight()) - cVar.f55505f, getMeasuredWidth(), y11);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i7 >= 29 && e40Var.H4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = e40Var.I4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(e40Var.H4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.a.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
