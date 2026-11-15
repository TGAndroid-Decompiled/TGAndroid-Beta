package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class o40 extends t40 {
    public ImageReceiver f37833a;
    public float f37834b;
    public final q40 f37835c;

    public o40(q40 q40Var, Context context) {
        super(context);
        this.f37835c = q40Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q40 q40Var = this.f37835c;
        FrameLayout frameLayout = q40Var.f38514x;
        kk0 kk0Var = q40Var.f38512w;
        n40 n40Var = q40Var.f38516y;
        super.dispatchDraw(canvas);
        if (this.f37833a == null) {
            return;
        }
        float f10 = this.f37834b;
        if (f10 < 1.0f) {
            this.f37834b = Math.min(1.0f, f10 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(n40Var.getLeft() + frameLayout.getLeft() + kk0Var.getLeft(), n40Var.getTop() + frameLayout.getTop() + kk0Var.getTop());
        if (this.f37833a.N0 != n40Var.getWidth()) {
            float width = n40Var.getWidth() / this.f37833a.N0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f37833a;
        canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
        float alpha = this.f37833a.getAlpha();
        this.f37833a.setAlpha(this.f37834b);
        this.f37833a.h(canvas, null);
        this.f37833a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f37833a == null) {
            this.f37834b = 0.0f;
        }
        this.f37833a = imageReceiver;
        invalidate();
    }
}
