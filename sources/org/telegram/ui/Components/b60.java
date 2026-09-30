package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class b60 extends g60 {
    public ImageReceiver f22860a;
    public float f22861b;
    public final d60 f22862c;

    public b60(d60 d60Var, Context context) {
        super(context);
        this.f22862c = d60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d60 d60Var = this.f22862c;
        FrameLayout frameLayout = d60Var.f23556x;
        km0 km0Var = d60Var.f23554w;
        a60 a60Var = d60Var.f23558y;
        super.dispatchDraw(canvas);
        if (this.f22860a == null) {
            return;
        }
        float f7 = this.f22861b;
        if (f7 < 1.0f) {
            this.f22861b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(a60Var.getLeft() + frameLayout.getLeft() + km0Var.getLeft(), a60Var.getTop() + frameLayout.getTop() + km0Var.getTop());
        if (this.f22860a.getImageWidth() != a60Var.getWidth()) {
            float width = a60Var.getWidth() / this.f22860a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f22860a.getImageX(), -this.f22860a.getImageY());
        float alpha = this.f22860a.getAlpha();
        this.f22860a.setAlpha(this.f22861b);
        this.f22860a.draw(canvas);
        this.f22860a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f22860a == null) {
            this.f22861b = 0.0f;
        }
        this.f22860a = imageReceiver;
        invalidate();
    }
}
