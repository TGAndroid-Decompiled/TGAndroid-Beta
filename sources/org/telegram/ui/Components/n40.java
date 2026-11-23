package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class n40 extends b50 {
    public ImageReceiver f37644a;
    public float f37645b;
    public final z40 f37646c;

    public n40(z40 z40Var, Context context) {
        super(context);
        this.f37646c = z40Var;
        z40Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f37645b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f37645b = f11;
            if (f11 > 1.0f) {
                this.f37645b = 1.0f;
            }
            invalidate();
        }
        if (this.f37644a != null) {
            canvas.save();
            float f12 = this.f37644a.N0;
            int i7 = this.f37646c.X0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f37644a;
            canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
            float alpha = this.f37644a.getAlpha();
            this.f37644a.setAlpha(this.f37645b);
            this.f37644a.h(canvas, null);
            this.f37644a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f37644a == null) {
            this.f37645b = 0.0f;
        }
        this.f37644a = imageReceiver;
        invalidate();
    }
}
