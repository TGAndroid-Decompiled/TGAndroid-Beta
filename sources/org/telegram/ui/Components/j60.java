package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class j60 extends o60 {
    public ImageReceiver f27410a;
    public float f27411b;
    public final l60 f27412c;

    public j60(l60 l60Var, Context context) {
        super(context);
        this.f27412c = l60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f27412c;
        FrameLayout frameLayout = l60Var.f28057x;
        vm0 vm0Var = l60Var.f28055w;
        i60 i60Var = l60Var.f28059y;
        super.dispatchDraw(canvas);
        if (this.f27410a == null) {
            return;
        }
        float f7 = this.f27411b;
        if (f7 < 1.0f) {
            this.f27411b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(i60Var.getLeft() + frameLayout.getLeft() + vm0Var.getLeft(), i60Var.getTop() + frameLayout.getTop() + vm0Var.getTop());
        if (this.f27410a.getImageWidth() != i60Var.getWidth()) {
            float width = i60Var.getWidth() / this.f27410a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27410a.getImageX(), -this.f27410a.getImageY());
        float alpha = this.f27410a.getAlpha();
        this.f27410a.setAlpha(this.f27411b);
        this.f27410a.draw(canvas);
        this.f27410a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27410a == null) {
            this.f27411b = 0.0f;
        }
        this.f27410a = imageReceiver;
        invalidate();
    }
}
