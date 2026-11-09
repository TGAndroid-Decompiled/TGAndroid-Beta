package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class m40 extends r40 {
    public ImageReceiver f35939a;
    public float f35940b;
    public final o40 f35941c;

    public m40(o40 o40Var, Context context) {
        super(context);
        this.f35941c = o40Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o40 o40Var = this.f35941c;
        FrameLayout frameLayout = o40Var.f36644x;
        gk0 gk0Var = o40Var.f36642w;
        l40 l40Var = o40Var.f36646y;
        super.dispatchDraw(canvas);
        if (this.f35939a == null) {
            return;
        }
        float f10 = this.f35940b;
        if (f10 < 1.0f) {
            this.f35940b = Math.min(1.0f, f10 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(l40Var.getLeft() + frameLayout.getLeft() + gk0Var.getLeft(), l40Var.getTop() + frameLayout.getTop() + gk0Var.getTop());
        if (this.f35939a.M0 != l40Var.getWidth()) {
            float width = l40Var.getWidth() / this.f35939a.M0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f35939a;
        canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
        float alpha = this.f35939a.getAlpha();
        this.f35939a.setAlpha(this.f35940b);
        this.f35939a.h(canvas, null);
        this.f35939a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f35939a == null) {
            this.f35940b = 0.0f;
        }
        this.f35939a = imageReceiver;
        invalidate();
    }
}
