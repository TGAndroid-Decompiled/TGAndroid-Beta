package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class r50 extends g60 {
    public ImageReceiver f27905a;
    public float f27906b;
    public final e60 f27907c;

    public r50(e60 e60Var, Context context) {
        super(context);
        this.f27907c = e60Var;
        e60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f27906b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f27906b = f10;
            if (f10 > 1.0f) {
                this.f27906b = 1.0f;
            }
            invalidate();
        }
        if (this.f27905a != null) {
            canvas.save();
            float imageWidth = this.f27905a.getImageWidth();
            int i10 = this.f27907c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27905a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27905a.getImageX(), -this.f27905a.getImageY());
            float alpha = this.f27905a.getAlpha();
            this.f27905a.setAlpha(this.f27906b);
            this.f27905a.draw(canvas);
            this.f27905a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27905a == null) {
            this.f27906b = 0.0f;
        }
        this.f27905a = imageReceiver;
        invalidate();
    }
}
