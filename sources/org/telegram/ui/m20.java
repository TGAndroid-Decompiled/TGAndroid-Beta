package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class m20 extends FrameLayout {
    public final RectF f47776a;
    public final RectF f47777b;
    public final RectF f47778c;
    public final Paint d;
    public final f40 f47779e;

    public m20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f47779e = f40Var;
        this.f47776a = new RectF();
        this.f47777b = new RectF();
        this.f47778c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f40 f40Var = this.f47779e;
        n20 n20Var = f40Var.f45610z1;
        float y10 = n20Var.getY() + n20Var.getMeasuredHeight();
        te.c cVar = f40Var.f45596v5;
        RectF rectF = this.f47776a;
        rectF.set(0.0f, y10 - cVar.f55504f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f47777b;
        rectF2.set(0.0f, n20Var.getY() + n20Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y11 = n20Var.getY() + n20Var.getMeasuredHeight();
        RectF rectF3 = this.f47778c;
        rectF3.set(0.0f, (n20Var.getY() + n20Var.getMeasuredHeight()) - cVar.f55504f, getMeasuredWidth(), y11);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i7 >= 29 && f40Var.K4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f10 = f40Var.L4;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(f40Var.K4);
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
