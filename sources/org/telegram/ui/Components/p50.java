package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends e60 {
    public ImageReceiver f27267a;
    public float f27268b;
    public final c60 f27269c;

    public p50(c60 c60Var, Context context) {
        super(context);
        this.f27269c = c60Var;
        c60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f27268b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f27268b = f10;
            if (f10 > 1.0f) {
                this.f27268b = 1.0f;
            }
            invalidate();
        }
        if (this.f27267a != null) {
            canvas.save();
            float imageWidth = this.f27267a.getImageWidth();
            int i10 = this.f27269c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27267a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27267a.getImageX(), -this.f27267a.getImageY());
            float alpha = this.f27267a.getAlpha();
            this.f27267a.setAlpha(this.f27268b);
            this.f27267a.draw(canvas);
            this.f27267a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27267a == null) {
            this.f27268b = 0.0f;
        }
        this.f27267a = imageReceiver;
        invalidate();
    }
}
