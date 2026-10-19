package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class j60 extends o60 {
    public ImageReceiver f27432a;
    public float f27433b;
    public final l60 f27434c;

    public j60(l60 l60Var, Context context) {
        super(context);
        this.f27434c = l60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f27434c;
        FrameLayout frameLayout = l60Var.f28117x;
        um0 um0Var = l60Var.f28115w;
        i60 i60Var = l60Var.f28119y;
        super.dispatchDraw(canvas);
        if (this.f27432a == null) {
            return;
        }
        float f7 = this.f27433b;
        if (f7 < 1.0f) {
            this.f27433b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(i60Var.getLeft() + frameLayout.getLeft() + um0Var.getLeft(), i60Var.getTop() + frameLayout.getTop() + um0Var.getTop());
        if (this.f27432a.getImageWidth() != i60Var.getWidth()) {
            float width = i60Var.getWidth() / this.f27432a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27432a.getImageX(), -this.f27432a.getImageY());
        float alpha = this.f27432a.getAlpha();
        this.f27432a.setAlpha(this.f27433b);
        this.f27432a.draw(canvas);
        this.f27432a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27432a == null) {
            this.f27433b = 0.0f;
        }
        this.f27432a = imageReceiver;
        invalidate();
    }
}
