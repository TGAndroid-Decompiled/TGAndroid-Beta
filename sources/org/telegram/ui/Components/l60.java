package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class l60 extends q60 {
    public ImageReceiver f30086a;
    public float f30087b;
    public final n60 f30088c;

    public l60(n60 n60Var, Context context) {
        super(context);
        this.f30088c = n60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n60 n60Var = this.f30088c;
        FrameLayout frameLayout = n60Var.f30874x;
        dn0 dn0Var = n60Var.f30872w;
        k60 k60Var = n60Var.f30876y;
        super.dispatchDraw(canvas);
        if (this.f30086a == null) {
            return;
        }
        float f7 = this.f30087b;
        if (f7 < 1.0f) {
            this.f30087b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(k60Var.getLeft() + frameLayout.getLeft() + dn0Var.getLeft(), k60Var.getTop() + frameLayout.getTop() + dn0Var.getTop());
        if (this.f30086a.getImageWidth() != k60Var.getWidth()) {
            float width = k60Var.getWidth() / this.f30086a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30086a.getImageX(), -this.f30086a.getImageY());
        float alpha = this.f30086a.getAlpha();
        this.f30086a.setAlpha(this.f30087b);
        this.f30086a.draw(canvas);
        this.f30086a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30086a == null) {
            this.f30087b = 0.0f;
        }
        this.f30086a = imageReceiver;
        invalidate();
    }
}
