package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class q50 extends f60 {
    public ImageReceiver f27594a;
    public float f27595b;
    public final d60 f27596c;

    public q50(d60 d60Var, Context context) {
        super(context);
        this.f27596c = d60Var;
        d60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f27595b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f27595b = f10;
            if (f10 > 1.0f) {
                this.f27595b = 1.0f;
            }
            invalidate();
        }
        if (this.f27594a != null) {
            canvas.save();
            float imageWidth = this.f27594a.getImageWidth();
            int i10 = this.f27596c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27594a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27594a.getImageX(), -this.f27594a.getImageY());
            float alpha = this.f27594a.getAlpha();
            this.f27594a.setAlpha(this.f27595b);
            this.f27594a.draw(canvas);
            this.f27594a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27594a == null) {
            this.f27595b = 0.0f;
        }
        this.f27594a = imageReceiver;
        invalidate();
    }
}
