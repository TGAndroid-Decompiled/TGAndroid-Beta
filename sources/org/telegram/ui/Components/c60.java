package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class c60 extends h60 {
    public ImageReceiver f25272a;
    public float f25273b;
    public final e60 f25274c;

    public c60(e60 e60Var, Context context) {
        super(context);
        this.f25274c = e60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e60 e60Var = this.f25274c;
        FrameLayout frameLayout = e60Var.f26021x;
        om0 om0Var = e60Var.f26019w;
        b60 b60Var = e60Var.f26023y;
        super.dispatchDraw(canvas);
        if (this.f25272a == null) {
            return;
        }
        float f7 = this.f25273b;
        if (f7 < 1.0f) {
            this.f25273b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(b60Var.getLeft() + frameLayout.getLeft() + om0Var.getLeft(), b60Var.getTop() + frameLayout.getTop() + om0Var.getTop());
        if (this.f25272a.getImageWidth() != b60Var.getWidth()) {
            float width = b60Var.getWidth() / this.f25272a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f25272a.getImageX(), -this.f25272a.getImageY());
        float alpha = this.f25272a.getAlpha();
        this.f25272a.setAlpha(this.f25273b);
        this.f25272a.draw(canvas);
        this.f25272a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f25272a == null) {
            this.f25273b = 0.0f;
        }
        this.f25272a = imageReceiver;
        invalidate();
    }
}
