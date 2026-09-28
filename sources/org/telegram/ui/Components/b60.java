package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class b60 extends g60 {
    public ImageReceiver f22873a;
    public float f22874b;
    public final d60 f22875c;

    public b60(d60 d60Var, Context context) {
        super(context);
        this.f22875c = d60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d60 d60Var = this.f22875c;
        FrameLayout frameLayout = d60Var.f23561x;
        km0 km0Var = d60Var.f23559w;
        a60 a60Var = d60Var.f23563y;
        super.dispatchDraw(canvas);
        if (this.f22873a == null) {
            return;
        }
        float f7 = this.f22874b;
        if (f7 < 1.0f) {
            this.f22874b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(a60Var.getLeft() + frameLayout.getLeft() + km0Var.getLeft(), a60Var.getTop() + frameLayout.getTop() + km0Var.getTop());
        if (this.f22873a.getImageWidth() != a60Var.getWidth()) {
            float width = a60Var.getWidth() / this.f22873a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f22873a.getImageX(), -this.f22873a.getImageY());
        float alpha = this.f22873a.getAlpha();
        this.f22873a.setAlpha(this.f22874b);
        this.f22873a.draw(canvas);
        this.f22873a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f22873a == null) {
            this.f22874b = 0.0f;
        }
        this.f22873a = imageReceiver;
        invalidate();
    }
}
