package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class l60 extends q60 {
    public ImageReceiver f30088a;
    public float f30089b;
    public final n60 f30090c;

    public l60(n60 n60Var, Context context) {
        super(context);
        this.f30090c = n60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n60 n60Var = this.f30090c;
        FrameLayout frameLayout = n60Var.f30876x;
        dn0 dn0Var = n60Var.f30874w;
        k60 k60Var = n60Var.f30878y;
        super.dispatchDraw(canvas);
        if (this.f30088a == null) {
            return;
        }
        float f7 = this.f30089b;
        if (f7 < 1.0f) {
            this.f30089b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(k60Var.getLeft() + frameLayout.getLeft() + dn0Var.getLeft(), k60Var.getTop() + frameLayout.getTop() + dn0Var.getTop());
        if (this.f30088a.getImageWidth() != k60Var.getWidth()) {
            float width = k60Var.getWidth() / this.f30088a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30088a.getImageX(), -this.f30088a.getImageY());
        float alpha = this.f30088a.getAlpha();
        this.f30088a.setAlpha(this.f30089b);
        this.f30088a.draw(canvas);
        this.f30088a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30088a == null) {
            this.f30089b = 0.0f;
        }
        this.f30088a = imageReceiver;
        invalidate();
    }
}
