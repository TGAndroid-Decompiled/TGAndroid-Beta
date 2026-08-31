package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class g40 extends FrameLayout {
    public final RectF f37079a;
    public final RectF f37080b;
    public final RectF f37081c;
    public final Paint d;
    public final d60 f37082e;

    public g40(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37082e = d60Var;
        this.f37079a = new RectF();
        this.f37080b = new RectF();
        this.f37081c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d60 d60Var = this.f37082e;
        h40 h40Var = d60Var.C;
        float y10 = h40Var.getY() + h40Var.getMeasuredHeight();
        xd.c cVar = d60Var.f36116y3;
        RectF rectF = this.f37079a;
        rectF.set(0.0f, y10 - cVar.f50509e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f37080b;
        rectF2.set(0.0f, h40Var.getY() + h40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = h40Var.getY() + h40Var.getMeasuredHeight();
        RectF rectF3 = this.f37081c;
        rectF3.set(0.0f, (h40Var.getY() + h40Var.getMeasuredHeight()) - cVar.f50509e, getMeasuredWidth(), y11);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && d60Var.N2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = d60Var.O2;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(d60Var.N2);
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
