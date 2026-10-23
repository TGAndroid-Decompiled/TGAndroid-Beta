package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class j60 extends o60 {
    public ImageReceiver f27414a;
    public float f27415b;
    public final l60 f27416c;

    public j60(l60 l60Var, Context context) {
        super(context);
        this.f27416c = l60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f27416c;
        FrameLayout frameLayout = l60Var.f28061x;
        vm0 vm0Var = l60Var.f28059w;
        i60 i60Var = l60Var.f28063y;
        super.dispatchDraw(canvas);
        if (this.f27414a == null) {
            return;
        }
        float f7 = this.f27415b;
        if (f7 < 1.0f) {
            this.f27415b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(i60Var.getLeft() + frameLayout.getLeft() + vm0Var.getLeft(), i60Var.getTop() + frameLayout.getTop() + vm0Var.getTop());
        if (this.f27414a.getImageWidth() != i60Var.getWidth()) {
            float width = i60Var.getWidth() / this.f27414a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27414a.getImageX(), -this.f27414a.getImageY());
        float alpha = this.f27414a.getAlpha();
        this.f27414a.setAlpha(this.f27415b);
        this.f27414a.draw(canvas);
        this.f27414a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27414a == null) {
            this.f27415b = 0.0f;
        }
        this.f27414a = imageReceiver;
        invalidate();
    }
}
