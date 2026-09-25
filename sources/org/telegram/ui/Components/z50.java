package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class z50 extends e60 {
    public ImageReceiver f30789a;
    public float f30790b;
    public final b60 f30791c;

    public z50(b60 b60Var, Context context) {
        super(context);
        this.f30791c = b60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b60 b60Var = this.f30791c;
        FrameLayout frameLayout = b60Var.f22903x;
        im0 im0Var = b60Var.f22901w;
        y50 y50Var = b60Var.f22905y;
        super.dispatchDraw(canvas);
        if (this.f30789a == null) {
            return;
        }
        float f7 = this.f30790b;
        if (f7 < 1.0f) {
            this.f30790b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(y50Var.getLeft() + frameLayout.getLeft() + im0Var.getLeft(), y50Var.getTop() + frameLayout.getTop() + im0Var.getTop());
        if (this.f30789a.getImageWidth() != y50Var.getWidth()) {
            float width = y50Var.getWidth() / this.f30789a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30789a.getImageX(), -this.f30789a.getImageY());
        float alpha = this.f30789a.getAlpha();
        this.f30789a.setAlpha(this.f30790b);
        this.f30789a.draw(canvas);
        this.f30789a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30789a == null) {
            this.f30790b = 0.0f;
        }
        this.f30789a = imageReceiver;
        invalidate();
    }
}
