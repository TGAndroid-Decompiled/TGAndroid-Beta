package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class s50 extends h60 {
    public ImageReceiver f30625a;
    public float f30626b;
    public final f60 f30627c;

    public s50(f60 f60Var, Context context) {
        super(context);
        this.f30627c = f60Var;
        f60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f30626b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f30626b = f10;
            if (f10 > 1.0f) {
                this.f30626b = 1.0f;
            }
            invalidate();
        }
        if (this.f30625a != null) {
            canvas.save();
            float imageWidth = this.f30625a.getImageWidth();
            int i10 = this.f30627c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f30625a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f30625a.getImageX(), -this.f30625a.getImageY());
            float alpha = this.f30625a.getAlpha();
            this.f30625a.setAlpha(this.f30626b);
            this.f30625a.draw(canvas);
            this.f30625a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30625a == null) {
            this.f30626b = 0.0f;
        }
        this.f30625a = imageReceiver;
        invalidate();
    }
}
