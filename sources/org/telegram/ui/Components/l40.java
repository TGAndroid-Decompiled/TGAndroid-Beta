package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class l40 extends q40 {
    public ImageReceiver f35526a;
    public float f35527b;
    public final n40 f35528c;

    public l40(n40 n40Var, Context context) {
        super(context);
        this.f35528c = n40Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n40 n40Var = this.f35528c;
        FrameLayout frameLayout = n40Var.f36187x;
        fk0 fk0Var = n40Var.f36185w;
        k40 k40Var = n40Var.f36189y;
        super.dispatchDraw(canvas);
        if (this.f35526a == null) {
            return;
        }
        float f10 = this.f35527b;
        if (f10 < 1.0f) {
            this.f35527b = Math.min(1.0f, f10 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(k40Var.getLeft() + frameLayout.getLeft() + fk0Var.getLeft(), k40Var.getTop() + frameLayout.getTop() + fk0Var.getTop());
        if (this.f35526a.M0 != k40Var.getWidth()) {
            float width = k40Var.getWidth() / this.f35526a.M0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f35526a;
        canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
        float alpha = this.f35526a.getAlpha();
        this.f35526a.setAlpha(this.f35527b);
        this.f35526a.h(canvas, null);
        this.f35526a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f35526a == null) {
            this.f35527b = 0.0f;
        }
        this.f35526a = imageReceiver;
        invalidate();
    }
}
