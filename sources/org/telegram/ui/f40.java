package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class f40 extends FrameLayout {
    public final RectF f33541a;
    public final RectF f33542b;
    public final RectF f33543c;
    public final Paint d;
    public final d60 e;

    public f40(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = d60Var;
        this.f33541a = new RectF();
        this.f33542b = new RectF();
        this.f33543c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d60 d60Var = this.e;
        g40 g40Var = d60Var.F;
        float y3 = g40Var.getY() + g40Var.getMeasuredHeight();
        le.f fVar = d60Var.B3;
        RectF rectF = this.f33541a;
        rectF.set(0.0f, y3 - fVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f33542b;
        rectF2.set(0.0f, g40Var.getY() + g40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = g40Var.getY() + g40Var.getMeasuredHeight();
        RectF rectF3 = this.f33543c;
        rectF3.set(0.0f, (g40Var.getY() + g40Var.getMeasuredHeight()) - fVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && d60Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = d60Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(d60Var.Q2);
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
