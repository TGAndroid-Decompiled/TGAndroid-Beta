package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class m60 extends r60 {
    public ImageReceiver f26937a;
    public float f26938b;
    public final o60 f26939c;

    public m60(o60 o60Var, Context context) {
        super(context);
        this.f26939c = o60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o60 o60Var = this.f26939c;
        FrameLayout frameLayout = o60Var.f27583x;
        ym0 ym0Var = o60Var.f27581w;
        l60 l60Var = o60Var.f27585y;
        super.dispatchDraw(canvas);
        if (this.f26937a == null) {
            return;
        }
        float f7 = this.f26938b;
        if (f7 < 1.0f) {
            this.f26938b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(l60Var.getLeft() + frameLayout.getLeft() + ym0Var.getLeft(), l60Var.getTop() + frameLayout.getTop() + ym0Var.getTop());
        if (this.f26937a.getImageWidth() != l60Var.getWidth()) {
            float width = l60Var.getWidth() / this.f26937a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f26937a.getImageX(), -this.f26937a.getImageY());
        float alpha = this.f26937a.getAlpha();
        this.f26937a.setAlpha(this.f26938b);
        this.f26937a.draw(canvas);
        this.f26937a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26937a == null) {
            this.f26938b = 0.0f;
        }
        this.f26937a = imageReceiver;
        invalidate();
    }
}
