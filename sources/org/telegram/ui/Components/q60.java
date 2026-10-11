package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class q60 extends v60 {
    public ImageReceiver f30157a;
    public float f30158b;
    public final s60 f30159c;

    public q60(s60 s60Var, Context context) {
        super(context);
        this.f30159c = s60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s60 s60Var = this.f30159c;
        FrameLayout frameLayout = s60Var.f30777x;
        dn0 dn0Var = s60Var.f30775w;
        p60 p60Var = s60Var.f30779y;
        super.dispatchDraw(canvas);
        if (this.f30157a == null) {
            return;
        }
        float f7 = this.f30158b;
        if (f7 < 1.0f) {
            this.f30158b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(p60Var.getLeft() + frameLayout.getLeft() + dn0Var.getLeft(), p60Var.getTop() + frameLayout.getTop() + dn0Var.getTop());
        if (this.f30157a.getImageWidth() != p60Var.getWidth()) {
            float width = p60Var.getWidth() / this.f30157a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30157a.getImageX(), -this.f30157a.getImageY());
        float alpha = this.f30157a.getAlpha();
        this.f30157a.setAlpha(this.f30158b);
        this.f30157a.draw(canvas);
        this.f30157a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30157a == null) {
            this.f30158b = 0.0f;
        }
        this.f30157a = imageReceiver;
        invalidate();
    }
}
