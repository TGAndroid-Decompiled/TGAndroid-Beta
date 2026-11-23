package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class q40 extends e50 {
    public ImageReceiver f38781a;
    public float f38782b;
    public final c50 f38783c;

    public q40(c50 c50Var, Context context) {
        super(context);
        this.f38783c = c50Var;
        c50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f38782b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f38782b = f11;
            if (f11 > 1.0f) {
                this.f38782b = 1.0f;
            }
            invalidate();
        }
        if (this.f38781a != null) {
            canvas.save();
            float f12 = this.f38781a.N0;
            int i7 = this.f38783c.X0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f38781a;
            canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
            float alpha = this.f38781a.getAlpha();
            this.f38781a.setAlpha(this.f38782b);
            this.f38781a.h(canvas, null);
            this.f38781a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f38781a == null) {
            this.f38782b = 0.0f;
        }
        this.f38781a = imageReceiver;
        invalidate();
    }
}
