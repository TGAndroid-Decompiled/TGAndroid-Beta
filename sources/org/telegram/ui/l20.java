package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class l20 extends FrameLayout {
    public final RectF f49573a;
    public final RectF f49574b;
    public final RectF f49575c;
    public final Paint d;
    public final e40 f49576e;

    public l20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f49576e = e40Var;
        this.f49573a = new RectF();
        this.f49574b = new RectF();
        this.f49575c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e40 e40Var = this.f49576e;
        n20 n20Var = e40Var.A1;
        float y10 = n20Var.getY() + n20Var.getMeasuredHeight();
        te.c cVar = e40Var.A5;
        RectF rectF = this.f49573a;
        rectF.set(0.0f, y10 - cVar.f57785f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f49574b;
        rectF2.set(0.0f, n20Var.getY() + n20Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = n20Var.getY() + n20Var.getMeasuredHeight();
        RectF rectF3 = this.f49575c;
        rectF3.set(0.0f, (n20Var.getY() + n20Var.getMeasuredHeight()) - cVar.f57785f, getMeasuredWidth(), y11);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i7 >= 29 && e40Var.P4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = e40Var.Q4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(e40Var.P4);
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
