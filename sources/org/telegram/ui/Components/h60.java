package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class h60 extends v60 {
    public ImageReceiver f26982a;
    public float f26983b;
    public final t60 f26984c;

    public h60(t60 t60Var, Context context) {
        super(context);
        this.f26984c = t60Var;
        t60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26983b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26983b = f10;
            if (f10 > 1.0f) {
                this.f26983b = 1.0f;
            }
            invalidate();
        }
        if (this.f26982a != null) {
            canvas.save();
            float imageWidth = this.f26982a.getImageWidth();
            int i10 = this.f26984c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26982a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26982a.getImageX(), -this.f26982a.getImageY());
            float alpha = this.f26982a.getAlpha();
            this.f26982a.setAlpha(this.f26983b);
            this.f26982a.draw(canvas);
            this.f26982a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26982a == null) {
            this.f26983b = 0.0f;
        }
        this.f26982a = imageReceiver;
        invalidate();
    }
}
