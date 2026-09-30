package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class c60 extends h60 {
    public ImageReceiver f23168a;
    public float f23169b;
    public final e60 f23170c;

    public c60(e60 e60Var, Context context) {
        super(context);
        this.f23170c = e60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e60 e60Var = this.f23170c;
        FrameLayout frameLayout = e60Var.f23885x;
        lm0 lm0Var = e60Var.f23883w;
        b60 b60Var = e60Var.f23887y;
        super.dispatchDraw(canvas);
        if (this.f23168a == null) {
            return;
        }
        float f7 = this.f23169b;
        if (f7 < 1.0f) {
            this.f23169b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(b60Var.getLeft() + frameLayout.getLeft() + lm0Var.getLeft(), b60Var.getTop() + frameLayout.getTop() + lm0Var.getTop());
        if (this.f23168a.getImageWidth() != b60Var.getWidth()) {
            float width = b60Var.getWidth() / this.f23168a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f23168a.getImageX(), -this.f23168a.getImageY());
        float alpha = this.f23168a.getAlpha();
        this.f23168a.setAlpha(this.f23169b);
        this.f23168a.draw(canvas);
        this.f23168a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f23168a == null) {
            this.f23169b = 0.0f;
        }
        this.f23168a = imageReceiver;
        invalidate();
    }
}
