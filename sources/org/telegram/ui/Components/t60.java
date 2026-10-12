package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class t60 extends y60 {
    public ImageReceiver f30771a;
    public float f30772b;
    public final v60 f30773c;

    public t60(v60 v60Var, Context context) {
        super(context);
        this.f30773c = v60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v60 v60Var = this.f30773c;
        FrameLayout frameLayout = v60Var.f31439x;
        in0 in0Var = v60Var.f31437w;
        s60 s60Var = v60Var.f31441y;
        super.dispatchDraw(canvas);
        if (this.f30771a == null) {
            return;
        }
        float f7 = this.f30772b;
        if (f7 < 1.0f) {
            this.f30772b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(s60Var.getLeft() + frameLayout.getLeft() + in0Var.getLeft(), s60Var.getTop() + frameLayout.getTop() + in0Var.getTop());
        if (this.f30771a.getImageWidth() != s60Var.getWidth()) {
            float width = s60Var.getWidth() / this.f30771a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30771a.getImageX(), -this.f30771a.getImageY());
        float alpha = this.f30771a.getAlpha();
        this.f30771a.setAlpha(this.f30772b);
        this.f30771a.draw(canvas);
        this.f30771a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30771a == null) {
            this.f30772b = 0.0f;
        }
        this.f30771a = imageReceiver;
        invalidate();
    }
}
