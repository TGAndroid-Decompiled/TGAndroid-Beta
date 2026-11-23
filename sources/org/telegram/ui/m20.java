package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class m20 extends FrameLayout {
    public final RectF f49715a;
    public final RectF f49716b;
    public final RectF f49717c;
    public final Paint d;
    public final f40 f49718e;

    public m20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f49718e = f40Var;
        this.f49715a = new RectF();
        this.f49716b = new RectF();
        this.f49717c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f40 f40Var = this.f49718e;
        o20 o20Var = f40Var.A1;
        float y10 = o20Var.getY() + o20Var.getMeasuredHeight();
        te.c cVar = f40Var.A5;
        RectF rectF = this.f49715a;
        rectF.set(0.0f, y10 - cVar.f57671f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f49716b;
        rectF2.set(0.0f, o20Var.getY() + o20Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = o20Var.getY() + o20Var.getMeasuredHeight();
        RectF rectF3 = this.f49717c;
        rectF3.set(0.0f, (o20Var.getY() + o20Var.getMeasuredHeight()) - cVar.f57671f, getMeasuredWidth(), y11);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i7 >= 29 && f40Var.P4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = f40Var.Q4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(f40Var.P4);
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
