package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class c40 extends q40 {
    public ImageReceiver f32407a;
    public float f32408b;
    public final o40 f32409c;

    public c40(o40 o40Var, Context context) {
        super(context);
        this.f32409c = o40Var;
        o40Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f32408b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f32408b = f11;
            if (f11 > 1.0f) {
                this.f32408b = 1.0f;
            }
            invalidate();
        }
        if (this.f32407a != null) {
            canvas.save();
            float f12 = this.f32407a.M0;
            int i7 = this.f32409c.W0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f32407a;
            canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
            float alpha = this.f32407a.getAlpha();
            this.f32407a.setAlpha(this.f32408b);
            this.f32407a.h(canvas, null);
            this.f32407a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32407a == null) {
            this.f32408b = 0.0f;
        }
        this.f32407a = imageReceiver;
        invalidate();
    }
}
