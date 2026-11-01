package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class t40 extends g50 {
    public ImageReceiver f30524a;
    public float f30525b;
    public final e50 f30526c;

    public t40(e50 e50Var, Context context) {
        super(context);
        this.f30526c = e50Var;
        e50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f30525b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f30525b = f10;
            if (f10 > 1.0f) {
                this.f30525b = 1.0f;
            }
            invalidate();
        }
        if (this.f30524a != null) {
            canvas.save();
            float f11 = this.f30524a.M0;
            int i10 = this.f30526c.W0;
            if (f11 != i10) {
                float f12 = i10 / f11;
                canvas.scale(f12, f12);
            }
            ImageReceiver imageReceiver = this.f30524a;
            canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
            float alpha = this.f30524a.getAlpha();
            this.f30524a.setAlpha(this.f30525b);
            this.f30524a.h(canvas, null);
            this.f30524a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30524a == null) {
            this.f30525b = 0.0f;
        }
        this.f30524a = imageReceiver;
        invalidate();
    }
}
