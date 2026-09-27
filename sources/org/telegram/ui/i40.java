package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class i40 extends FrameLayout {
    public final RectF f34352a;
    public final RectF f34353b;
    public final RectF f34354c;
    public final Paint d;
    public final g60 e;

    public i40(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = g60Var;
        this.f34352a = new RectF();
        this.f34353b = new RectF();
        this.f34354c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g60 g60Var = this.e;
        j40 j40Var = g60Var.F;
        float y3 = j40Var.getY() + j40Var.getMeasuredHeight();
        le.f fVar = g60Var.B3;
        RectF rectF = this.f34352a;
        rectF.set(0.0f, y3 - fVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f34353b;
        rectF2.set(0.0f, j40Var.getY() + j40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = j40Var.getY() + j40Var.getMeasuredHeight();
        RectF rectF3 = this.f34354c;
        rectF3.set(0.0f, (j40Var.getY() + j40Var.getMeasuredHeight()) - fVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && g60Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = g60Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(g60Var.Q2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.a.h(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
