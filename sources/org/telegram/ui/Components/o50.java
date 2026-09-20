package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class o50 extends c60 {
    public ImageReceiver f26810a;
    public float f26811b;
    public final a60 f26812c;

    public o50(a60 a60Var, Context context) {
        super(context);
        this.f26812c = a60Var;
        a60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26811b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26811b = f10;
            if (f10 > 1.0f) {
                this.f26811b = 1.0f;
            }
            invalidate();
        }
        if (this.f26810a != null) {
            canvas.save();
            float imageWidth = this.f26810a.getImageWidth();
            int i10 = this.f26812c.Q0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26810a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26810a.getImageX(), -this.f26810a.getImageY());
            float alpha = this.f26810a.getAlpha();
            this.f26810a.setAlpha(this.f26811b);
            this.f26810a.draw(canvas);
            this.f26810a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26810a == null) {
            this.f26811b = 0.0f;
        }
        this.f26810a = imageReceiver;
        invalidate();
    }
}
