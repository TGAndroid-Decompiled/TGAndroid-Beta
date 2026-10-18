package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class j60 extends o60 {
    public ImageReceiver f27425a;
    public float f27426b;
    public final l60 f27427c;

    public j60(l60 l60Var, Context context) {
        super(context);
        this.f27427c = l60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f27427c;
        FrameLayout frameLayout = l60Var.f28114x;
        um0 um0Var = l60Var.f28112w;
        i60 i60Var = l60Var.f28116y;
        super.dispatchDraw(canvas);
        if (this.f27425a == null) {
            return;
        }
        float f7 = this.f27426b;
        if (f7 < 1.0f) {
            this.f27426b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(i60Var.getLeft() + frameLayout.getLeft() + um0Var.getLeft(), i60Var.getTop() + frameLayout.getTop() + um0Var.getTop());
        if (this.f27425a.getImageWidth() != i60Var.getWidth()) {
            float width = i60Var.getWidth() / this.f27425a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27425a.getImageX(), -this.f27425a.getImageY());
        float alpha = this.f27425a.getAlpha();
        this.f27425a.setAlpha(this.f27426b);
        this.f27425a.draw(canvas);
        this.f27425a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27425a == null) {
            this.f27426b = 0.0f;
        }
        this.f27425a = imageReceiver;
        invalidate();
    }
}
