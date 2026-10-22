package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class j60 extends o60 {
    public ImageReceiver f27413a;
    public float f27414b;
    public final l60 f27415c;

    public j60(l60 l60Var, Context context) {
        super(context);
        this.f27415c = l60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f27415c;
        FrameLayout frameLayout = l60Var.f28060x;
        vm0 vm0Var = l60Var.f28058w;
        i60 i60Var = l60Var.f28062y;
        super.dispatchDraw(canvas);
        if (this.f27413a == null) {
            return;
        }
        float f7 = this.f27414b;
        if (f7 < 1.0f) {
            this.f27414b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(i60Var.getLeft() + frameLayout.getLeft() + vm0Var.getLeft(), i60Var.getTop() + frameLayout.getTop() + vm0Var.getTop());
        if (this.f27413a.getImageWidth() != i60Var.getWidth()) {
            float width = i60Var.getWidth() / this.f27413a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27413a.getImageX(), -this.f27413a.getImageY());
        float alpha = this.f27413a.getAlpha();
        this.f27413a.setAlpha(this.f27414b);
        this.f27413a.draw(canvas);
        this.f27413a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27413a == null) {
            this.f27414b = 0.0f;
        }
        this.f27413a = imageReceiver;
        invalidate();
    }
}
