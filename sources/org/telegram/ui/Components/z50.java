package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class z50 extends e60 {
    public ImageReceiver f30788a;
    public float f30789b;
    public final b60 f30790c;

    public z50(b60 b60Var, Context context) {
        super(context);
        this.f30790c = b60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b60 b60Var = this.f30790c;
        FrameLayout frameLayout = b60Var.f22902x;
        im0 im0Var = b60Var.f22900w;
        y50 y50Var = b60Var.f22904y;
        super.dispatchDraw(canvas);
        if (this.f30788a == null) {
            return;
        }
        float f7 = this.f30789b;
        if (f7 < 1.0f) {
            this.f30789b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(y50Var.getLeft() + frameLayout.getLeft() + im0Var.getLeft(), y50Var.getTop() + frameLayout.getTop() + im0Var.getTop());
        if (this.f30788a.getImageWidth() != y50Var.getWidth()) {
            float width = y50Var.getWidth() / this.f30788a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30788a.getImageX(), -this.f30788a.getImageY());
        float alpha = this.f30788a.getAlpha();
        this.f30788a.setAlpha(this.f30789b);
        this.f30788a.draw(canvas);
        this.f30788a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30788a == null) {
            this.f30789b = 0.0f;
        }
        this.f30788a = imageReceiver;
        invalidate();
    }
}
