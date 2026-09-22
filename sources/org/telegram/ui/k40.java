package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class k40 extends FrameLayout {
    public final RectF f35050a;
    public final RectF f35051b;
    public final RectF f35052c;
    public final Paint d;
    public final i60 e;

    public k40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = i60Var;
        this.f35050a = new RectF();
        this.f35051b = new RectF();
        this.f35052c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i60 i60Var = this.e;
        l40 l40Var = i60Var.F;
        float y3 = l40Var.getY() + l40Var.getMeasuredHeight();
        le.e eVar = i60Var.B3;
        RectF rectF = this.f35050a;
        rectF.set(0.0f, y3 - eVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f35051b;
        rectF2.set(0.0f, l40Var.getY() + l40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = l40Var.getY() + l40Var.getMeasuredHeight();
        RectF rectF3 = this.f35052c;
        rectF3.set(0.0f, (l40Var.getY() + l40Var.getMeasuredHeight()) - eVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && i60Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = i60Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(i60Var.Q2);
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
