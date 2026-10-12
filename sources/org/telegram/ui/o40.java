package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class o40 extends FrameLayout {
    public final RectF f38860a;
    public final RectF f38861b;
    public final RectF f38862c;
    public final Paint d;
    public final n60 e;

    public o40(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = n60Var;
        this.f38860a = new RectF();
        this.f38861b = new RectF();
        this.f38862c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n60 n60Var = this.e;
        p40 p40Var = n60Var.F;
        float y3 = p40Var.getY() + p40Var.getMeasuredHeight();
        ne.e eVar = n60Var.B3;
        RectF rectF = this.f38860a;
        rectF.set(0.0f, y3 - eVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f38861b;
        rectF2.set(0.0f, p40Var.getY() + p40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = p40Var.getY() + p40Var.getMeasuredHeight();
        RectF rectF3 = this.f38862c;
        rectF3.set(0.0f, (p40Var.getY() + p40Var.getMeasuredHeight()) - eVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && n60Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = n60Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(n60Var.Q2);
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
