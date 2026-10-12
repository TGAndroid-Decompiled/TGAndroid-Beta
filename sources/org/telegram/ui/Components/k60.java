package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class k60 extends y60 {
    public ImageReceiver f27764a;
    public float f27765b;
    public final w60 f27766c;

    public k60(w60 w60Var, Context context) {
        super(context);
        this.f27766c = w60Var;
        w60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f27765b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f27765b = f10;
            if (f10 > 1.0f) {
                this.f27765b = 1.0f;
            }
            invalidate();
        }
        if (this.f27764a != null) {
            canvas.save();
            float imageWidth = this.f27764a.getImageWidth();
            int i10 = this.f27766c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27764a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27764a.getImageX(), -this.f27764a.getImageY());
            float alpha = this.f27764a.getAlpha();
            this.f27764a.setAlpha(this.f27765b);
            this.f27764a.draw(canvas);
            this.f27764a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27764a == null) {
            this.f27765b = 0.0f;
        }
        this.f27764a = imageReceiver;
        invalidate();
    }
}
