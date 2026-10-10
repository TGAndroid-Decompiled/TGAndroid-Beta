package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class r60 extends w60 {
    public ImageReceiver f30401a;
    public float f30402b;
    public final t60 f30403c;

    public r60(t60 t60Var, Context context) {
        super(context);
        this.f30403c = t60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t60 t60Var = this.f30403c;
        FrameLayout frameLayout = t60Var.f31028x;
        dn0 dn0Var = t60Var.f31026w;
        q60 q60Var = t60Var.f31030y;
        super.dispatchDraw(canvas);
        if (this.f30401a == null) {
            return;
        }
        float f7 = this.f30402b;
        if (f7 < 1.0f) {
            this.f30402b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(q60Var.getLeft() + frameLayout.getLeft() + dn0Var.getLeft(), q60Var.getTop() + frameLayout.getTop() + dn0Var.getTop());
        if (this.f30401a.getImageWidth() != q60Var.getWidth()) {
            float width = q60Var.getWidth() / this.f30401a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30401a.getImageX(), -this.f30401a.getImageY());
        float alpha = this.f30401a.getAlpha();
        this.f30401a.setAlpha(this.f30402b);
        this.f30401a.draw(canvas);
        this.f30401a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30401a == null) {
            this.f30402b = 0.0f;
        }
        this.f30401a = imageReceiver;
        invalidate();
    }
}
