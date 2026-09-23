package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class h40 extends FrameLayout {
    public final RectF f33728a;
    public final RectF f33729b;
    public final RectF f33730c;
    public final Paint d;
    public final f60 e;

    public h40(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = f60Var;
        this.f33728a = new RectF();
        this.f33729b = new RectF();
        this.f33730c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f60 f60Var = this.e;
        i40 i40Var = f60Var.F;
        float y3 = i40Var.getY() + i40Var.getMeasuredHeight();
        le.f fVar = f60Var.B3;
        RectF rectF = this.f33728a;
        rectF.set(0.0f, y3 - fVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f33729b;
        rectF2.set(0.0f, i40Var.getY() + i40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = i40Var.getY() + i40Var.getMeasuredHeight();
        RectF rectF3 = this.f33730c;
        rectF3.set(0.0f, (i40Var.getY() + i40Var.getMeasuredHeight()) - fVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && f60Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = f60Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(f60Var.Q2);
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
