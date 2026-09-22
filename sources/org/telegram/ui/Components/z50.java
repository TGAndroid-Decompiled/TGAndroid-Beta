package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class z50 extends e60 {
    public ImageReceiver f30824a;
    public float f30825b;
    public final b60 f30826c;

    public z50(b60 b60Var, Context context) {
        super(context);
        this.f30826c = b60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b60 b60Var = this.f30826c;
        FrameLayout frameLayout = b60Var.f22897x;
        km0 km0Var = b60Var.f22895w;
        y50 y50Var = b60Var.f22899y;
        super.dispatchDraw(canvas);
        if (this.f30824a == null) {
            return;
        }
        float f7 = this.f30825b;
        if (f7 < 1.0f) {
            this.f30825b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(y50Var.getLeft() + frameLayout.getLeft() + km0Var.getLeft(), y50Var.getTop() + frameLayout.getTop() + km0Var.getTop());
        if (this.f30824a.getImageWidth() != y50Var.getWidth()) {
            float width = y50Var.getWidth() / this.f30824a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30824a.getImageX(), -this.f30824a.getImageY());
        float alpha = this.f30824a.getAlpha();
        this.f30824a.setAlpha(this.f30825b);
        this.f30824a.draw(canvas);
        this.f30824a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30824a == null) {
            this.f30825b = 0.0f;
        }
        this.f30824a = imageReceiver;
        invalidate();
    }
}
