package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class h40 extends m40 {
    public ImageReceiver f34295a;
    public float f34296b;
    public final j40 f34297c;

    public h40(j40 j40Var, Context context) {
        super(context);
        this.f34297c = j40Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j40 j40Var = this.f34297c;
        FrameLayout frameLayout = j40Var.f34956x;
        jk0 jk0Var = j40Var.f34954w;
        g40 g40Var = j40Var.f34958y;
        super.dispatchDraw(canvas);
        if (this.f34295a == null) {
            return;
        }
        float f10 = this.f34296b;
        if (f10 < 1.0f) {
            this.f34296b = Math.min(1.0f, f10 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(g40Var.getLeft() + frameLayout.getLeft() + jk0Var.getLeft(), g40Var.getTop() + frameLayout.getTop() + jk0Var.getTop());
        if (this.f34295a.N0 != g40Var.getWidth()) {
            float width = g40Var.getWidth() / this.f34295a.N0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f34295a;
        canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
        float alpha = this.f34295a.getAlpha();
        this.f34295a.setAlpha(this.f34296b);
        this.f34295a.h(canvas, null);
        this.f34295a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f34295a == null) {
            this.f34296b = 0.0f;
        }
        this.f34295a = imageReceiver;
        invalidate();
    }
}
