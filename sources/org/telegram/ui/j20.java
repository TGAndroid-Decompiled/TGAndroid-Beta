package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class j20 extends FrameLayout {
    public final RectF f46815a;
    public final RectF f46816b;
    public final RectF f46817c;
    public final Paint d;
    public final c40 f46818e;

    public j20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f46818e = c40Var;
        this.f46815a = new RectF();
        this.f46816b = new RectF();
        this.f46817c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c40 c40Var = this.f46818e;
        k20 k20Var = c40Var.f44639w1;
        float y10 = k20Var.getY() + k20Var.getMeasuredHeight();
        te.c cVar = c40Var.s5;
        RectF rectF = this.f46815a;
        rectF.set(0.0f, y10 - cVar.f55400f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f46816b;
        rectF2.set(0.0f, k20Var.getY() + k20Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = k20Var.getY() + k20Var.getMeasuredHeight();
        RectF rectF3 = this.f46817c;
        rectF3.set(0.0f, (k20Var.getY() + k20Var.getMeasuredHeight()) - cVar.f55400f, getMeasuredWidth(), y11);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i7 >= 29 && c40Var.H4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = c40Var.I4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(c40Var.H4);
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
