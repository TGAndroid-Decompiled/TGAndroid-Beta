package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class o50 extends e60 {
    public ImageReceiver f26989a;
    public float f26990b;
    public final c60 f26991c;

    public o50(c60 c60Var, Context context) {
        super(context);
        this.f26991c = c60Var;
        c60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26990b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26990b = f10;
            if (f10 > 1.0f) {
                this.f26990b = 1.0f;
            }
            invalidate();
        }
        if (this.f26989a != null) {
            canvas.save();
            float imageWidth = this.f26989a.getImageWidth();
            int i10 = this.f26991c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26989a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26989a.getImageX(), -this.f26989a.getImageY());
            float alpha = this.f26989a.getAlpha();
            this.f26989a.setAlpha(this.f26990b);
            this.f26989a.draw(canvas);
            this.f26989a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26989a == null) {
            this.f26990b = 0.0f;
        }
        this.f26989a = imageReceiver;
        invalidate();
    }
}
