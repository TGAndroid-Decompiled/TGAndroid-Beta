package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class k60 extends y60 {
    public ImageReceiver f27767a;
    public float f27768b;
    public final w60 f27769c;

    public k60(w60 w60Var, Context context) {
        super(context);
        this.f27769c = w60Var;
        w60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f27768b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f27768b = f10;
            if (f10 > 1.0f) {
                this.f27768b = 1.0f;
            }
            invalidate();
        }
        if (this.f27767a != null) {
            canvas.save();
            float imageWidth = this.f27767a.getImageWidth();
            int i10 = this.f27769c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27767a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27767a.getImageX(), -this.f27767a.getImageY());
            float alpha = this.f27767a.getAlpha();
            this.f27767a.setAlpha(this.f27768b);
            this.f27767a.draw(canvas);
            this.f27767a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27767a == null) {
            this.f27768b = 0.0f;
        }
        this.f27767a = imageReceiver;
        invalidate();
    }
}
