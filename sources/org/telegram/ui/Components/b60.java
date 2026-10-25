package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class b60 extends q60 {
    public ImageReceiver f26761a;
    public float f26762b;
    public final o60 f26763c;

    public b60(o60 o60Var, Context context) {
        super(context);
        this.f26763c = o60Var;
        o60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26762b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26762b = f10;
            if (f10 > 1.0f) {
                this.f26762b = 1.0f;
            }
            invalidate();
        }
        if (this.f26761a != null) {
            canvas.save();
            float imageWidth = this.f26761a.getImageWidth();
            int i10 = this.f26763c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26761a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26761a.getImageX(), -this.f26761a.getImageY());
            float alpha = this.f26761a.getAlpha();
            this.f26761a.setAlpha(this.f26762b);
            this.f26761a.draw(canvas);
            this.f26761a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26761a == null) {
            this.f26762b = 0.0f;
        }
        this.f26761a = imageReceiver;
        invalidate();
    }
}
