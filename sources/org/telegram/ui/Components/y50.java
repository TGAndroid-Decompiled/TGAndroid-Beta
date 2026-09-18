package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public final class y50 extends d60 {
    public ImageReceiver f30480a;
    public float f30481b;
    public final a60 f30482c;

    public y50(a60 a60Var, Context context) {
        super(context);
        this.f30482c = a60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f30480a == null) {
            return;
        }
        float f7 = this.f30481b;
        if (f7 < 1.0f) {
            this.f30481b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        a60 a60Var = this.f30482c;
        canvas.translate(a60Var.v.getLeft() + a60Var.f22526s.getLeft(), a60Var.v.getTop() + a60Var.f22526s.getTop());
        if (this.f30480a.getImageWidth() != a60Var.v.getWidth()) {
            float width = a60Var.v.getWidth() / this.f30480a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30480a.getImageX(), -this.f30480a.getImageY());
        float alpha = this.f30480a.getAlpha();
        this.f30480a.setAlpha(this.f30481b);
        this.f30480a.draw(canvas);
        this.f30480a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30480a == null) {
            this.f30481b = 0.0f;
        }
        this.f30480a = imageReceiver;
        invalidate();
    }
}
