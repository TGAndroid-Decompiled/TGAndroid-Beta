package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class c60 extends h60 {
    public ImageReceiver f25223a;
    public float f25224b;
    public final e60 f25225c;

    public c60(e60 e60Var, Context context) {
        super(context);
        this.f25225c = e60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e60 e60Var = this.f25225c;
        FrameLayout frameLayout = e60Var.f25967x;
        om0 om0Var = e60Var.f25965w;
        b60 b60Var = e60Var.f25969y;
        super.dispatchDraw(canvas);
        if (this.f25223a == null) {
            return;
        }
        float f7 = this.f25224b;
        if (f7 < 1.0f) {
            this.f25224b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(b60Var.getLeft() + frameLayout.getLeft() + om0Var.getLeft(), b60Var.getTop() + frameLayout.getTop() + om0Var.getTop());
        if (this.f25223a.getImageWidth() != b60Var.getWidth()) {
            float width = b60Var.getWidth() / this.f25223a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f25223a.getImageX(), -this.f25223a.getImageY());
        float alpha = this.f25223a.getAlpha();
        this.f25223a.setAlpha(this.f25224b);
        this.f25223a.draw(canvas);
        this.f25223a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f25223a == null) {
            this.f25224b = 0.0f;
        }
        this.f25223a = imageReceiver;
        invalidate();
    }
}
