package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class c60 extends h60 {
    public ImageReceiver f25229a;
    public float f25230b;
    public final e60 f25231c;

    public c60(e60 e60Var, Context context) {
        super(context);
        this.f25231c = e60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e60 e60Var = this.f25231c;
        FrameLayout frameLayout = e60Var.f25973x;
        om0 om0Var = e60Var.f25971w;
        b60 b60Var = e60Var.f25975y;
        super.dispatchDraw(canvas);
        if (this.f25229a == null) {
            return;
        }
        float f7 = this.f25230b;
        if (f7 < 1.0f) {
            this.f25230b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(b60Var.getLeft() + frameLayout.getLeft() + om0Var.getLeft(), b60Var.getTop() + frameLayout.getTop() + om0Var.getTop());
        if (this.f25229a.getImageWidth() != b60Var.getWidth()) {
            float width = b60Var.getWidth() / this.f25229a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f25229a.getImageX(), -this.f25229a.getImageY());
        float alpha = this.f25229a.getAlpha();
        this.f25229a.setAlpha(this.f25230b);
        this.f25229a.draw(canvas);
        this.f25229a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f25229a == null) {
            this.f25230b = 0.0f;
        }
        this.f25229a = imageReceiver;
        invalidate();
    }
}
