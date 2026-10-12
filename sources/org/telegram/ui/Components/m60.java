package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class m60 extends r60 {
    public ImageReceiver f27219a;
    public float f27220b;
    public final o60 f27221c;

    public m60(o60 o60Var, Context context) {
        super(context);
        this.f27221c = o60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o60 o60Var = this.f27221c;
        FrameLayout frameLayout = o60Var.f27887x;
        ym0 ym0Var = o60Var.f27885w;
        l60 l60Var = o60Var.f27889y;
        super.dispatchDraw(canvas);
        if (this.f27219a == null) {
            return;
        }
        float f7 = this.f27220b;
        if (f7 < 1.0f) {
            this.f27220b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(l60Var.getLeft() + frameLayout.getLeft() + ym0Var.getLeft(), l60Var.getTop() + frameLayout.getTop() + ym0Var.getTop());
        if (this.f27219a.getImageWidth() != l60Var.getWidth()) {
            float width = l60Var.getWidth() / this.f27219a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27219a.getImageX(), -this.f27219a.getImageY());
        float alpha = this.f27219a.getAlpha();
        this.f27219a.setAlpha(this.f27220b);
        this.f27219a.draw(canvas);
        this.f27219a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27219a == null) {
            this.f27220b = 0.0f;
        }
        this.f27219a = imageReceiver;
        invalidate();
    }
}
