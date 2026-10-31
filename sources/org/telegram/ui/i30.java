package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class i30 extends FrameLayout {
    public final RectF f38105a;
    public final RectF f38106b;
    public final RectF f38107c;
    public final Paint d;
    public final b50 e;

    public i30(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = b50Var;
        this.f38105a = new RectF();
        this.f38106b = new RectF();
        this.f38107c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b50 b50Var = this.e;
        j30 j30Var = b50Var.f36091w1;
        float y3 = j30Var.getY() + j30Var.getMeasuredHeight();
        fe.f fVar = b50Var.f36077s5;
        RectF rectF = this.f38105a;
        rectF.set(0.0f, y3 - fVar.f7031f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f38106b;
        rectF2.set(0.0f, j30Var.getY() + j30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = j30Var.getY() + j30Var.getMeasuredHeight();
        RectF rectF3 = this.f38107c;
        rectF3.set(0.0f, (j30Var.getY() + j30Var.getMeasuredHeight()) - fVar.f7031f, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && b50Var.H4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = b50Var.I4;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(b50Var.H4);
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
