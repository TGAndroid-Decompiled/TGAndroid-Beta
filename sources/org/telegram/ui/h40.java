package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class h40 extends FrameLayout {
    public final RectF f34568a;
    public final RectF f34569b;
    public final RectF f34570c;
    public final Paint d;
    public final e60 e;

    public h40(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = e60Var;
        this.f34568a = new RectF();
        this.f34569b = new RectF();
        this.f34570c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e60 e60Var = this.e;
        i40 i40Var = e60Var.C;
        float y10 = i40Var.getY() + i40Var.getMeasuredHeight();
        xd.c cVar = e60Var.f33721y3;
        RectF rectF = this.f34568a;
        rectF.set(0.0f, y10 - cVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f34569b;
        rectF2.set(0.0f, i40Var.getY() + i40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = i40Var.getY() + i40Var.getMeasuredHeight();
        RectF rectF3 = this.f34570c;
        rectF3.set(0.0f, (i40Var.getY() + i40Var.getMeasuredHeight()) - cVar.e, getMeasuredWidth(), y11);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && e60Var.N2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = e60Var.O2;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(e60Var.N2);
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
