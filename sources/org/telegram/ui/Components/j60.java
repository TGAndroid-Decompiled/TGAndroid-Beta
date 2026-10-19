package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class j60 extends o60 {
    public ImageReceiver f27430a;
    public float f27431b;
    public final l60 f27432c;

    public j60(l60 l60Var, Context context) {
        super(context);
        this.f27432c = l60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f27432c;
        FrameLayout frameLayout = l60Var.f28115x;
        um0 um0Var = l60Var.f28113w;
        i60 i60Var = l60Var.f28117y;
        super.dispatchDraw(canvas);
        if (this.f27430a == null) {
            return;
        }
        float f7 = this.f27431b;
        if (f7 < 1.0f) {
            this.f27431b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(i60Var.getLeft() + frameLayout.getLeft() + um0Var.getLeft(), i60Var.getTop() + frameLayout.getTop() + um0Var.getTop());
        if (this.f27430a.getImageWidth() != i60Var.getWidth()) {
            float width = i60Var.getWidth() / this.f27430a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27430a.getImageX(), -this.f27430a.getImageY());
        float alpha = this.f27430a.getAlpha();
        this.f27430a.setAlpha(this.f27431b);
        this.f27430a.draw(canvas);
        this.f27430a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27430a == null) {
            this.f27431b = 0.0f;
        }
        this.f27430a = imageReceiver;
        invalidate();
    }
}
