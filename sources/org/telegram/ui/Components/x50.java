package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public final class x50 extends c60 {
    public ImageReceiver f30172a;
    public float f30173b;
    public final z50 f30174c;

    public x50(z50 z50Var, Context context) {
        super(context);
        this.f30174c = z50Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f30172a == null) {
            return;
        }
        float f7 = this.f30173b;
        if (f7 < 1.0f) {
            this.f30173b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        z50 z50Var = this.f30174c;
        canvas.translate(z50Var.f30738w.getLeft() + z50Var.v.getLeft() + z50Var.f30734s.getLeft(), z50Var.f30738w.getTop() + z50Var.v.getTop() + z50Var.f30734s.getTop());
        if (this.f30172a.getImageWidth() != z50Var.f30738w.getWidth()) {
            float width = z50Var.f30738w.getWidth() / this.f30172a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30172a.getImageX(), -this.f30172a.getImageY());
        float alpha = this.f30172a.getAlpha();
        this.f30172a.setAlpha(this.f30173b);
        this.f30172a.draw(canvas);
        this.f30172a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30172a == null) {
            this.f30173b = 0.0f;
        }
        this.f30172a = imageReceiver;
        invalidate();
    }
}
