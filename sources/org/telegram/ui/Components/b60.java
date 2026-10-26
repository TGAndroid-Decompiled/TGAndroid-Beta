package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class b60 extends q60 {
    public ImageReceiver f26763a;
    public float f26764b;
    public final o60 f26765c;

    public b60(o60 o60Var, Context context) {
        super(context);
        this.f26765c = o60Var;
        o60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26764b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26764b = f10;
            if (f10 > 1.0f) {
                this.f26764b = 1.0f;
            }
            invalidate();
        }
        if (this.f26763a != null) {
            canvas.save();
            float imageWidth = this.f26763a.getImageWidth();
            int i10 = this.f26765c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26763a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26763a.getImageX(), -this.f26763a.getImageY());
            float alpha = this.f26763a.getAlpha();
            this.f26763a.setAlpha(this.f26764b);
            this.f26763a.draw(canvas);
            this.f26763a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26763a == null) {
            this.f26764b = 0.0f;
        }
        this.f26763a = imageReceiver;
        invalidate();
    }
}
