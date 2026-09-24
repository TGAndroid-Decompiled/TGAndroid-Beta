package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class z50 extends e60 {
    public ImageReceiver f30778a;
    public float f30779b;
    public final b60 f30780c;

    public z50(b60 b60Var, Context context) {
        super(context);
        this.f30780c = b60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b60 b60Var = this.f30780c;
        FrameLayout frameLayout = b60Var.f22894x;
        im0 im0Var = b60Var.f22892w;
        y50 y50Var = b60Var.f22896y;
        super.dispatchDraw(canvas);
        if (this.f30778a == null) {
            return;
        }
        float f7 = this.f30779b;
        if (f7 < 1.0f) {
            this.f30779b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(y50Var.getLeft() + frameLayout.getLeft() + im0Var.getLeft(), y50Var.getTop() + frameLayout.getTop() + im0Var.getTop());
        if (this.f30778a.getImageWidth() != y50Var.getWidth()) {
            float width = y50Var.getWidth() / this.f30778a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30778a.getImageX(), -this.f30778a.getImageY());
        float alpha = this.f30778a.getAlpha();
        this.f30778a.setAlpha(this.f30779b);
        this.f30778a.draw(canvas);
        this.f30778a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30778a == null) {
            this.f30779b = 0.0f;
        }
        this.f30778a = imageReceiver;
        invalidate();
    }
}
