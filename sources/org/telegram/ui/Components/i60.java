package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class i60 extends n60 {
    public ImageReceiver f27308a;
    public float f27309b;
    public final k60 f27310c;

    public i60(k60 k60Var, Context context) {
        super(context);
        this.f27310c = k60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k60 k60Var = this.f27310c;
        FrameLayout frameLayout = k60Var.f27902x;
        xm0 xm0Var = k60Var.f27900w;
        h60 h60Var = k60Var.f27904y;
        super.dispatchDraw(canvas);
        if (this.f27308a == null) {
            return;
        }
        float f7 = this.f27309b;
        if (f7 < 1.0f) {
            this.f27309b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(h60Var.getLeft() + frameLayout.getLeft() + xm0Var.getLeft(), h60Var.getTop() + frameLayout.getTop() + xm0Var.getTop());
        if (this.f27308a.getImageWidth() != h60Var.getWidth()) {
            float width = h60Var.getWidth() / this.f27308a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27308a.getImageX(), -this.f27308a.getImageY());
        float alpha = this.f27308a.getAlpha();
        this.f27308a.setAlpha(this.f27309b);
        this.f27308a.draw(canvas);
        this.f27308a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27308a == null) {
            this.f27309b = 0.0f;
        }
        this.f27308a = imageReceiver;
        invalidate();
    }
}
