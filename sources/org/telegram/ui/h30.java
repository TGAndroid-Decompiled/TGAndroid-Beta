package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class h30 extends FrameLayout {
    public final RectF f37642a;
    public final RectF f37643b;
    public final RectF f37644c;
    public final Paint d;
    public final a50 e;

    public h30(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = a50Var;
        this.f37642a = new RectF();
        this.f37643b = new RectF();
        this.f37644c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a50 a50Var = this.e;
        i30 i30Var = a50Var.f35675w1;
        float y3 = i30Var.getY() + i30Var.getMeasuredHeight();
        fe.f fVar = a50Var.f35661s5;
        RectF rectF = this.f37642a;
        rectF.set(0.0f, y3 - fVar.f7032f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f37643b;
        rectF2.set(0.0f, i30Var.getY() + i30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = i30Var.getY() + i30Var.getMeasuredHeight();
        RectF rectF3 = this.f37644c;
        rectF3.set(0.0f, (i30Var.getY() + i30Var.getMeasuredHeight()) - fVar.f7032f, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && a50Var.H4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = a50Var.I4;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(a50Var.H4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.b.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
