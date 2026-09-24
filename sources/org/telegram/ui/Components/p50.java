package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends e60 {
    public ImageReceiver f27253a;
    public float f27254b;
    public final c60 f27255c;

    public p50(c60 c60Var, Context context) {
        super(context);
        this.f27255c = c60Var;
        c60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f27254b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f27254b = f10;
            if (f10 > 1.0f) {
                this.f27254b = 1.0f;
            }
            invalidate();
        }
        if (this.f27253a != null) {
            canvas.save();
            float imageWidth = this.f27253a.getImageWidth();
            int i10 = this.f27255c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27253a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27253a.getImageX(), -this.f27253a.getImageY());
            float alpha = this.f27253a.getAlpha();
            this.f27253a.setAlpha(this.f27254b);
            this.f27253a.draw(canvas);
            this.f27253a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27253a == null) {
            this.f27254b = 0.0f;
        }
        this.f27253a = imageReceiver;
        invalidate();
    }
}
