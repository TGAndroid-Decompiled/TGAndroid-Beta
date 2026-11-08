package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class c40 extends q40 {
    public ImageReceiver f32448a;
    public float f32449b;
    public final o40 f32450c;

    public c40(o40 o40Var, Context context) {
        super(context);
        this.f32450c = o40Var;
        o40Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f32449b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f32449b = f11;
            if (f11 > 1.0f) {
                this.f32449b = 1.0f;
            }
            invalidate();
        }
        if (this.f32448a != null) {
            canvas.save();
            float f12 = this.f32448a.M0;
            int i7 = this.f32450c.W0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f32448a;
            canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
            float alpha = this.f32448a.getAlpha();
            this.f32448a.setAlpha(this.f32449b);
            this.f32448a.h(canvas, null);
            this.f32448a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32448a == null) {
            this.f32449b = 0.0f;
        }
        this.f32448a = imageReceiver;
        invalidate();
    }
}
