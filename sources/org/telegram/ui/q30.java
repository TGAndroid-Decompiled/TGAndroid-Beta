package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class q30 extends FrameLayout {
    public final RectF f41658a;
    public final RectF f41659b;
    public final RectF f41660c;
    public final Paint d;
    public final o50 f41661e;

    public q30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41661e = o50Var;
        this.f41658a = new RectF();
        this.f41659b = new RectF();
        this.f41660c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o50 o50Var = this.f41661e;
        r30 r30Var = o50Var.B;
        float y10 = r30Var.getY() + r30Var.getMeasuredHeight();
        td.c cVar = o50Var.f40981x3;
        RectF rectF = this.f41658a;
        rectF.set(0.0f, y10 - cVar.f47780e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f41659b;
        rectF2.set(0.0f, r30Var.getY() + r30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = r30Var.getY() + r30Var.getMeasuredHeight();
        RectF rectF3 = this.f41660c;
        rectF3.set(0.0f, (r30Var.getY() + r30Var.getMeasuredHeight()) - cVar.f47780e, getMeasuredWidth(), y11);
        int i9 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i9 >= 29 && o50Var.M2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = o50Var.N2;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(o50Var.M2);
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
