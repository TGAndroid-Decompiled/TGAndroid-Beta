package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class c40 extends q40 {
    public ImageReceiver f32417a;
    public float f32418b;
    public final o40 f32419c;

    public c40(o40 o40Var, Context context) {
        super(context);
        this.f32419c = o40Var;
        o40Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f32418b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f32418b = f11;
            if (f11 > 1.0f) {
                this.f32418b = 1.0f;
            }
            invalidate();
        }
        if (this.f32417a != null) {
            canvas.save();
            float f12 = this.f32417a.M0;
            int i7 = this.f32419c.W0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f32417a;
            canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
            float alpha = this.f32417a.getAlpha();
            this.f32417a.setAlpha(this.f32418b);
            this.f32417a.h(canvas, null);
            this.f32417a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32417a == null) {
            this.f32418b = 0.0f;
        }
        this.f32417a = imageReceiver;
        invalidate();
    }
}
