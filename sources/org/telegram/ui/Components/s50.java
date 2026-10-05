package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class s50 extends h60 {
    public ImageReceiver f30693a;
    public float f30694b;
    public final f60 f30695c;

    public s50(f60 f60Var, Context context) {
        super(context);
        this.f30695c = f60Var;
        f60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f30694b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f30694b = f10;
            if (f10 > 1.0f) {
                this.f30694b = 1.0f;
            }
            invalidate();
        }
        if (this.f30693a != null) {
            canvas.save();
            float imageWidth = this.f30693a.getImageWidth();
            int i10 = this.f30695c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f30693a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f30693a.getImageX(), -this.f30693a.getImageY());
            float alpha = this.f30693a.getAlpha();
            this.f30693a.setAlpha(this.f30694b);
            this.f30693a.draw(canvas);
            this.f30693a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30693a == null) {
            this.f30694b = 0.0f;
        }
        this.f30693a = imageReceiver;
        invalidate();
    }
}
