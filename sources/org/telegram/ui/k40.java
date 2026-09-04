package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class k40 extends FrameLayout {
    public final RectF f37908a;
    public final RectF f37909b;
    public final RectF f37910c;
    public final Paint d;
    public final j60 f37911e;

    public k40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37911e = j60Var;
        this.f37908a = new RectF();
        this.f37909b = new RectF();
        this.f37910c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j60 j60Var = this.f37911e;
        l40 l40Var = j60Var.F;
        float y3 = l40Var.getY() + l40Var.getMeasuredHeight();
        le.e eVar = j60Var.B3;
        RectF rectF = this.f37908a;
        rectF.set(0.0f, y3 - eVar.f15376e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f37909b;
        rectF2.set(0.0f, l40Var.getY() + l40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = l40Var.getY() + l40Var.getMeasuredHeight();
        RectF rectF3 = this.f37910c;
        rectF3.set(0.0f, (l40Var.getY() + l40Var.getMeasuredHeight()) - eVar.f15376e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && j60Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = j60Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(j60Var.Q2);
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
