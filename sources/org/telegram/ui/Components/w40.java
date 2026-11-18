package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class w40 extends b50 {
    public ImageReceiver f41560a;
    public float f41561b;
    public final y40 f41562c;

    public w40(y40 y40Var, Context context) {
        super(context);
        this.f41562c = y40Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y40 y40Var = this.f41562c;
        FrameLayout frameLayout = y40Var.f42322x;
        sk0 sk0Var = y40Var.f42320w;
        v40 v40Var = y40Var.f42324y;
        super.dispatchDraw(canvas);
        if (this.f41560a == null) {
            return;
        }
        float f10 = this.f41561b;
        if (f10 < 1.0f) {
            this.f41561b = Math.min(1.0f, f10 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(v40Var.getLeft() + frameLayout.getLeft() + sk0Var.getLeft(), v40Var.getTop() + frameLayout.getTop() + sk0Var.getTop());
        if (this.f41560a.N0 != v40Var.getWidth()) {
            float width = v40Var.getWidth() / this.f41560a.N0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f41560a;
        canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
        float alpha = this.f41560a.getAlpha();
        this.f41560a.setAlpha(this.f41561b);
        this.f41560a.h(canvas, null);
        this.f41560a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f41560a == null) {
            this.f41561b = 0.0f;
        }
        this.f41560a = imageReceiver;
        invalidate();
    }
}
