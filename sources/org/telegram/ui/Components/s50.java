package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class s50 extends h60 {
    public ImageReceiver f28195a;
    public float f28196b;
    public final f60 f28197c;

    public s50(f60 f60Var, Context context) {
        super(context);
        this.f28197c = f60Var;
        f60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f28196b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f28196b = f10;
            if (f10 > 1.0f) {
                this.f28196b = 1.0f;
            }
            invalidate();
        }
        if (this.f28195a != null) {
            canvas.save();
            float imageWidth = this.f28195a.getImageWidth();
            int i10 = this.f28197c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f28195a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f28195a.getImageX(), -this.f28195a.getImageY());
            float alpha = this.f28195a.getAlpha();
            this.f28195a.setAlpha(this.f28196b);
            this.f28195a.draw(canvas);
            this.f28195a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f28195a == null) {
            this.f28196b = 0.0f;
        }
        this.f28195a = imageReceiver;
        invalidate();
    }
}
