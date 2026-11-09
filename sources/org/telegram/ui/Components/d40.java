package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class d40 extends r40 {
    public ImageReceiver f32861a;
    public float f32862b;
    public final p40 f32863c;

    public d40(p40 p40Var, Context context) {
        super(context);
        this.f32863c = p40Var;
        p40Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f32862b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f32862b = f11;
            if (f11 > 1.0f) {
                this.f32862b = 1.0f;
            }
            invalidate();
        }
        if (this.f32861a != null) {
            canvas.save();
            float f12 = this.f32861a.M0;
            int i7 = this.f32863c.W0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f32861a;
            canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
            float alpha = this.f32861a.getAlpha();
            this.f32861a.setAlpha(this.f32862b);
            this.f32861a.h(canvas, null);
            this.f32861a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32861a == null) {
            this.f32862b = 0.0f;
        }
        this.f32861a = imageReceiver;
        invalidate();
    }
}
