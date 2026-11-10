package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class c40 extends q40 {
    public ImageReceiver f32452a;
    public float f32453b;
    public final o40 f32454c;

    public c40(o40 o40Var, Context context) {
        super(context);
        this.f32454c = o40Var;
        o40Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f32453b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f32453b = f11;
            if (f11 > 1.0f) {
                this.f32453b = 1.0f;
            }
            invalidate();
        }
        if (this.f32452a != null) {
            canvas.save();
            float f12 = this.f32452a.M0;
            int i7 = this.f32454c.W0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f32452a;
            canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
            float alpha = this.f32452a.getAlpha();
            this.f32452a.setAlpha(this.f32453b);
            this.f32452a.h(canvas, null);
            this.f32452a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32452a == null) {
            this.f32453b = 0.0f;
        }
        this.f32452a = imageReceiver;
        invalidate();
    }
}
