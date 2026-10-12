package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class t60 extends y60 {
    public ImageReceiver f30774a;
    public float f30775b;
    public final v60 f30776c;

    public t60(v60 v60Var, Context context) {
        super(context);
        this.f30776c = v60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v60 v60Var = this.f30776c;
        FrameLayout frameLayout = v60Var.f31439x;
        in0 in0Var = v60Var.f31437w;
        s60 s60Var = v60Var.f31441y;
        super.dispatchDraw(canvas);
        if (this.f30774a == null) {
            return;
        }
        float f7 = this.f30775b;
        if (f7 < 1.0f) {
            this.f30775b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(s60Var.getLeft() + frameLayout.getLeft() + in0Var.getLeft(), s60Var.getTop() + frameLayout.getTop() + in0Var.getTop());
        if (this.f30774a.getImageWidth() != s60Var.getWidth()) {
            float width = s60Var.getWidth() / this.f30774a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30774a.getImageX(), -this.f30774a.getImageY());
        float alpha = this.f30774a.getAlpha();
        this.f30774a.setAlpha(this.f30775b);
        this.f30774a.draw(canvas);
        this.f30774a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30774a == null) {
            this.f30775b = 0.0f;
        }
        this.f30774a = imageReceiver;
        invalidate();
    }
}
