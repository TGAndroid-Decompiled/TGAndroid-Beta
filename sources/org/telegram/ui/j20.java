package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class j20 extends FrameLayout {
    public final RectF f48198a;
    public final RectF f48199b;
    public final RectF f48200c;
    public final Paint d;
    public final c40 f48201e;

    public j20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f48201e = c40Var;
        this.f48198a = new RectF();
        this.f48199b = new RectF();
        this.f48200c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c40 c40Var = this.f48201e;
        l20 l20Var = c40Var.A1;
        float y10 = l20Var.getY() + l20Var.getMeasuredHeight();
        te.c cVar = c40Var.A5;
        RectF rectF = this.f48198a;
        rectF.set(0.0f, y10 - cVar.f57087f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f48199b;
        rectF2.set(0.0f, l20Var.getY() + l20Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = l20Var.getY() + l20Var.getMeasuredHeight();
        RectF rectF3 = this.f48200c;
        rectF3.set(0.0f, (l20Var.getY() + l20Var.getMeasuredHeight()) - cVar.f57087f, getMeasuredWidth(), y11);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i7 >= 29 && c40Var.P4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = c40Var.Q4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(c40Var.P4);
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
