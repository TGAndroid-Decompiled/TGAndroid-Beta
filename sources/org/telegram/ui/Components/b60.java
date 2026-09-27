package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class b60 extends g60 {
    public ImageReceiver f22909a;
    public float f22910b;
    public final d60 f22911c;

    public b60(d60 d60Var, Context context) {
        super(context);
        this.f22911c = d60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d60 d60Var = this.f22911c;
        FrameLayout frameLayout = d60Var.f23574x;
        km0 km0Var = d60Var.f23572w;
        a60 a60Var = d60Var.f23576y;
        super.dispatchDraw(canvas);
        if (this.f22909a == null) {
            return;
        }
        float f7 = this.f22910b;
        if (f7 < 1.0f) {
            this.f22910b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(a60Var.getLeft() + frameLayout.getLeft() + km0Var.getLeft(), a60Var.getTop() + frameLayout.getTop() + km0Var.getTop());
        if (this.f22909a.getImageWidth() != a60Var.getWidth()) {
            float width = a60Var.getWidth() / this.f22909a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f22909a.getImageX(), -this.f22909a.getImageY());
        float alpha = this.f22909a.getAlpha();
        this.f22909a.setAlpha(this.f22910b);
        this.f22909a.draw(canvas);
        this.f22909a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f22909a == null) {
            this.f22910b = 0.0f;
        }
        this.f22909a = imageReceiver;
        invalidate();
    }
}
