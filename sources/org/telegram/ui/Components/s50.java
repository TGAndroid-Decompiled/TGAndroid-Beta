package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class s50 extends h60 {
    public ImageReceiver f30631a;
    public float f30632b;
    public final f60 f30633c;

    public s50(f60 f60Var, Context context) {
        super(context);
        this.f30633c = f60Var;
        f60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f30632b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f30632b = f10;
            if (f10 > 1.0f) {
                this.f30632b = 1.0f;
            }
            invalidate();
        }
        if (this.f30631a != null) {
            canvas.save();
            float imageWidth = this.f30631a.getImageWidth();
            int i10 = this.f30633c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f30631a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f30631a.getImageX(), -this.f30631a.getImageY());
            float alpha = this.f30631a.getAlpha();
            this.f30631a.setAlpha(this.f30632b);
            this.f30631a.draw(canvas);
            this.f30631a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30631a == null) {
            this.f30632b = 0.0f;
        }
        this.f30631a = imageReceiver;
        invalidate();
    }
}
