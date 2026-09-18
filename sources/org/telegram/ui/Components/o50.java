package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class o50 extends d60 {
    public ImageReceiver f26862a;
    public float f26863b;
    public final b60 f26864c;

    public o50(b60 b60Var, Context context) {
        super(context);
        this.f26864c = b60Var;
        b60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26863b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26863b = f10;
            if (f10 > 1.0f) {
                this.f26863b = 1.0f;
            }
            invalidate();
        }
        if (this.f26862a != null) {
            canvas.save();
            float imageWidth = this.f26862a.getImageWidth();
            int i10 = this.f26864c.Q0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26862a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26862a.getImageX(), -this.f26862a.getImageY());
            float alpha = this.f26862a.getAlpha();
            this.f26862a.setAlpha(this.f26863b);
            this.f26862a.draw(canvas);
            this.f26862a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26862a == null) {
            this.f26863b = 0.0f;
        }
        this.f26862a = imageReceiver;
        invalidate();
    }
}
