package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class r60 extends w60 {
    public ImageReceiver f30351a;
    public float f30352b;
    public final t60 f30353c;

    public r60(t60 t60Var, Context context) {
        super(context);
        this.f30353c = t60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t60 t60Var = this.f30353c;
        FrameLayout frameLayout = t60Var.f31033x;
        en0 en0Var = t60Var.f31031w;
        q60 q60Var = t60Var.f31035y;
        super.dispatchDraw(canvas);
        if (this.f30351a == null) {
            return;
        }
        float f7 = this.f30352b;
        if (f7 < 1.0f) {
            this.f30352b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(q60Var.getLeft() + frameLayout.getLeft() + en0Var.getLeft(), q60Var.getTop() + frameLayout.getTop() + en0Var.getTop());
        if (this.f30351a.getImageWidth() != q60Var.getWidth()) {
            float width = q60Var.getWidth() / this.f30351a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30351a.getImageX(), -this.f30351a.getImageY());
        float alpha = this.f30351a.getAlpha();
        this.f30351a.setAlpha(this.f30352b);
        this.f30351a.draw(canvas);
        this.f30351a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30351a == null) {
            this.f30352b = 0.0f;
        }
        this.f30351a = imageReceiver;
        invalidate();
    }
}
