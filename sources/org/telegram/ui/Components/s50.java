package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class s50 extends h60 {
    public ImageReceiver f30624a;
    public float f30625b;
    public final f60 f30626c;

    public s50(f60 f60Var, Context context) {
        super(context);
        this.f30626c = f60Var;
        f60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f30625b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f30625b = f10;
            if (f10 > 1.0f) {
                this.f30625b = 1.0f;
            }
            invalidate();
        }
        if (this.f30624a != null) {
            canvas.save();
            float imageWidth = this.f30624a.getImageWidth();
            int i10 = this.f30626c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f30624a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f30624a.getImageX(), -this.f30624a.getImageY());
            float alpha = this.f30624a.getAlpha();
            this.f30624a.setAlpha(this.f30625b);
            this.f30624a.draw(canvas);
            this.f30624a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30624a == null) {
            this.f30625b = 0.0f;
        }
        this.f30624a = imageReceiver;
        invalidate();
    }
}
