package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class m60 extends r60 {
    public ImageReceiver f30417a;
    public float f30418b;
    public final o60 f30419c;

    public m60(o60 o60Var, Context context) {
        super(context);
        this.f30419c = o60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o60 o60Var = this.f30419c;
        FrameLayout frameLayout = o60Var.f31197w;
        en0 en0Var = o60Var.v;
        l60 l60Var = o60Var.f31199x;
        super.dispatchDraw(canvas);
        if (this.f30417a == null) {
            return;
        }
        float f7 = this.f30418b;
        if (f7 < 1.0f) {
            this.f30418b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(l60Var.getLeft() + frameLayout.getLeft() + en0Var.getLeft(), l60Var.getTop() + frameLayout.getTop() + en0Var.getTop());
        if (this.f30417a.getImageWidth() != l60Var.getWidth()) {
            float width = l60Var.getWidth() / this.f30417a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30417a.getImageX(), -this.f30417a.getImageY());
        float alpha = this.f30417a.getAlpha();
        this.f30417a.setAlpha(this.f30418b);
        this.f30417a.draw(canvas);
        this.f30417a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30417a == null) {
            this.f30418b = 0.0f;
        }
        this.f30417a = imageReceiver;
        invalidate();
    }
}
