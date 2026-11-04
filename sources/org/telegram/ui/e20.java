package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class e20 extends FrameLayout {
    public final RectF f44857a;
    public final RectF f44858b;
    public final RectF f44859c;
    public final Paint d;
    public final x30 f44860e;

    public e20(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f44860e = x30Var;
        this.f44857a = new RectF();
        this.f44858b = new RectF();
        this.f44859c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x30 x30Var = this.f44860e;
        f20 f20Var = x30Var.f51814x1;
        float y9 = f20Var.getY() + f20Var.getMeasuredHeight();
        qe.c cVar = x30Var.f51800t5;
        RectF rectF = this.f44857a;
        rectF.set(0.0f, y9 - cVar.f53846f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f44858b;
        rectF2.set(0.0f, f20Var.getY() + f20Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = f20Var.getY() + f20Var.getMeasuredHeight();
        RectF rectF3 = this.f44859c;
        rectF3.set(0.0f, (f20Var.getY() + f20Var.getMeasuredHeight()) - cVar.f53846f, getMeasuredWidth(), y10);
        int i3 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i3 >= 29 && x30Var.I4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = x30Var.J4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(x30Var.I4);
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
