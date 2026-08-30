package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class f40 extends FrameLayout {
    public final RectF f34155a;
    public final RectF f34156b;
    public final RectF f34157c;
    public final Paint d;
    public final c60 e;

    public f40(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = c60Var;
        this.f34155a = new RectF();
        this.f34156b = new RectF();
        this.f34157c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c60 c60Var = this.e;
        g40 g40Var = c60Var.C;
        float y10 = g40Var.getY() + g40Var.getMeasuredHeight();
        xd.c cVar = c60Var.f33202y3;
        RectF rectF = this.f34155a;
        rectF.set(0.0f, y10 - cVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f34156b;
        rectF2.set(0.0f, g40Var.getY() + g40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = g40Var.getY() + g40Var.getMeasuredHeight();
        RectF rectF3 = this.f34157c;
        rectF3.set(0.0f, (g40Var.getY() + g40Var.getMeasuredHeight()) - cVar.e, getMeasuredWidth(), y11);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && c60Var.N2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = c60Var.O2;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(c60Var.N2);
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
