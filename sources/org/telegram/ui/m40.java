package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class m40 extends FrameLayout {
    public final RectF f35678a;
    public final RectF f35679b;
    public final RectF f35680c;
    public final Paint d;
    public final k60 e;

    public m40(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = k60Var;
        this.f35678a = new RectF();
        this.f35679b = new RectF();
        this.f35680c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k60 k60Var = this.e;
        n40 n40Var = k60Var.F;
        float y3 = n40Var.getY() + n40Var.getMeasuredHeight();
        le.e eVar = k60Var.B3;
        RectF rectF = this.f35678a;
        rectF.set(0.0f, y3 - eVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f35679b;
        rectF2.set(0.0f, n40Var.getY() + n40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = n40Var.getY() + n40Var.getMeasuredHeight();
        RectF rectF3 = this.f35680c;
        rectF3.set(0.0f, (n40Var.getY() + n40Var.getMeasuredHeight()) - eVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && k60Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = k60Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(k60Var.Q2);
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
