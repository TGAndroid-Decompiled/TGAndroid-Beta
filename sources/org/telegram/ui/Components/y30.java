package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class y30 extends m40 {
    public ImageReceiver f40602a;
    public float f40603b;
    public final k40 f40604c;

    public y30(k40 k40Var, Context context) {
        super(context);
        this.f40604c = k40Var;
        k40Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f40603b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f40603b = f11;
            if (f11 > 1.0f) {
                this.f40603b = 1.0f;
            }
            invalidate();
        }
        if (this.f40602a != null) {
            canvas.save();
            float f12 = this.f40602a.N0;
            int i3 = this.f40604c.X0;
            if (f12 != i3) {
                float f13 = i3 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f40602a;
            canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
            float alpha = this.f40602a.getAlpha();
            this.f40602a.setAlpha(this.f40603b);
            this.f40602a.h(canvas, null);
            this.f40602a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f40602a == null) {
            this.f40603b = 0.0f;
        }
        this.f40602a = imageReceiver;
        invalidate();
    }
}
