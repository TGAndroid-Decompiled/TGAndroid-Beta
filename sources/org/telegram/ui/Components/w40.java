package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class w40 extends b50 {
    public ImageReceiver f41511a;
    public float f41512b;
    public final y40 f41513c;

    public w40(y40 y40Var, Context context) {
        super(context);
        this.f41513c = y40Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y40 y40Var = this.f41513c;
        FrameLayout frameLayout = y40Var.f42350x;
        uk0 uk0Var = y40Var.f42348w;
        v40 v40Var = y40Var.f42352y;
        super.dispatchDraw(canvas);
        if (this.f41511a == null) {
            return;
        }
        float f10 = this.f41512b;
        if (f10 < 1.0f) {
            this.f41512b = Math.min(1.0f, f10 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(v40Var.getLeft() + frameLayout.getLeft() + uk0Var.getLeft(), v40Var.getTop() + frameLayout.getTop() + uk0Var.getTop());
        if (this.f41511a.N0 != v40Var.getWidth()) {
            float width = v40Var.getWidth() / this.f41511a.N0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f41511a;
        canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
        float alpha = this.f41511a.getAlpha();
        this.f41511a.setAlpha(this.f41512b);
        this.f41511a.h(canvas, null);
        this.f41511a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f41511a == null) {
            this.f41512b = 0.0f;
        }
        this.f41511a = imageReceiver;
        invalidate();
    }
}
