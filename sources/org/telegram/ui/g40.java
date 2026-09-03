package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class g40 extends FrameLayout {
    public final RectF f36981a;
    public final RectF f36982b;
    public final RectF f36983c;
    public final Paint d;
    public final d60 f36984e;

    public g40(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f36984e = d60Var;
        this.f36981a = new RectF();
        this.f36982b = new RectF();
        this.f36983c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d60 d60Var = this.f36984e;
        h40 h40Var = d60Var.C;
        float y10 = h40Var.getY() + h40Var.getMeasuredHeight();
        xd.c cVar = d60Var.f36095y3;
        RectF rectF = this.f36981a;
        rectF.set(0.0f, y10 - cVar.f50546e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f36982b;
        rectF2.set(0.0f, h40Var.getY() + h40Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = h40Var.getY() + h40Var.getMeasuredHeight();
        RectF rectF3 = this.f36983c;
        rectF3.set(0.0f, (h40Var.getY() + h40Var.getMeasuredHeight()) - cVar.f50546e, getMeasuredWidth(), y11);
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
