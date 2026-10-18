package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class j60 extends o60 {
    public ImageReceiver f27418a;
    public float f27419b;
    public final l60 f27420c;

    public j60(l60 l60Var, Context context) {
        super(context);
        this.f27420c = l60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f27420c;
        FrameLayout frameLayout = l60Var.f28107x;
        um0 um0Var = l60Var.f28105w;
        i60 i60Var = l60Var.f28109y;
        super.dispatchDraw(canvas);
        if (this.f27418a == null) {
            return;
        }
        float f7 = this.f27419b;
        if (f7 < 1.0f) {
            this.f27419b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(i60Var.getLeft() + frameLayout.getLeft() + um0Var.getLeft(), i60Var.getTop() + frameLayout.getTop() + um0Var.getTop());
        if (this.f27418a.getImageWidth() != i60Var.getWidth()) {
            float width = i60Var.getWidth() / this.f27418a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27418a.getImageX(), -this.f27418a.getImageY());
        float alpha = this.f27418a.getAlpha();
        this.f27418a.setAlpha(this.f27419b);
        this.f27418a.draw(canvas);
        this.f27418a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27418a == null) {
            this.f27419b = 0.0f;
        }
        this.f27418a = imageReceiver;
        invalidate();
    }
}
