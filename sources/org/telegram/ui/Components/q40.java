package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class q40 extends e50 {
    public ImageReceiver f38734a;
    public float f38735b;
    public final c50 f38736c;

    public q40(c50 c50Var, Context context) {
        super(context);
        this.f38736c = c50Var;
        c50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f38735b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f38735b = f11;
            if (f11 > 1.0f) {
                this.f38735b = 1.0f;
            }
            invalidate();
        }
        if (this.f38734a != null) {
            canvas.save();
            float f12 = this.f38734a.N0;
            int i7 = this.f38736c.X0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f38734a;
            canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
            float alpha = this.f38734a.getAlpha();
            this.f38734a.setAlpha(this.f38735b);
            this.f38734a.h(canvas, null);
            this.f38734a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f38734a == null) {
            this.f38735b = 0.0f;
        }
        this.f38734a = imageReceiver;
        invalidate();
    }
}
