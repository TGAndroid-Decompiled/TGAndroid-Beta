package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class c60 extends h60 {
    public ImageReceiver f25224a;
    public float f25225b;
    public final e60 f25226c;

    public c60(e60 e60Var, Context context) {
        super(context);
        this.f25226c = e60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e60 e60Var = this.f25226c;
        FrameLayout frameLayout = e60Var.f25968x;
        om0 om0Var = e60Var.f25966w;
        b60 b60Var = e60Var.f25970y;
        super.dispatchDraw(canvas);
        if (this.f25224a == null) {
            return;
        }
        float f7 = this.f25225b;
        if (f7 < 1.0f) {
            this.f25225b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(b60Var.getLeft() + frameLayout.getLeft() + om0Var.getLeft(), b60Var.getTop() + frameLayout.getTop() + om0Var.getTop());
        if (this.f25224a.getImageWidth() != b60Var.getWidth()) {
            float width = b60Var.getWidth() / this.f25224a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f25224a.getImageX(), -this.f25224a.getImageY());
        float alpha = this.f25224a.getAlpha();
        this.f25224a.setAlpha(this.f25225b);
        this.f25224a.draw(canvas);
        this.f25224a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f25224a == null) {
            this.f25225b = 0.0f;
        }
        this.f25224a = imageReceiver;
        invalidate();
    }
}
