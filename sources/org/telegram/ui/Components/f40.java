package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class f40 extends t40 {
    public ImageReceiver f34513a;
    public float f34514b;
    public final r40 f34515c;

    public f40(r40 r40Var, Context context) {
        super(context);
        this.f34515c = r40Var;
        r40Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f34514b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f34514b = f11;
            if (f11 > 1.0f) {
                this.f34514b = 1.0f;
            }
            invalidate();
        }
        if (this.f34513a != null) {
            canvas.save();
            float f12 = this.f34513a.N0;
            int i7 = this.f34515c.X0;
            if (f12 != i7) {
                float f13 = i7 / f12;
                canvas.scale(f13, f13);
            }
            ImageReceiver imageReceiver = this.f34513a;
            canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
            float alpha = this.f34513a.getAlpha();
            this.f34513a.setAlpha(this.f34514b);
            this.f34513a.h(canvas, null);
            this.f34513a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f34513a == null) {
            this.f34514b = 0.0f;
        }
        this.f34513a = imageReceiver;
        invalidate();
    }
}
