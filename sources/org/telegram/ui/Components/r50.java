package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class r50 extends g60 {
    public ImageReceiver f27906a;
    public float f27907b;
    public final e60 f27908c;

    public r50(e60 e60Var, Context context) {
        super(context);
        this.f27908c = e60Var;
        e60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f27907b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f27907b = f10;
            if (f10 > 1.0f) {
                this.f27907b = 1.0f;
            }
            invalidate();
        }
        if (this.f27906a != null) {
            canvas.save();
            float imageWidth = this.f27906a.getImageWidth();
            int i10 = this.f27908c.S0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27906a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27906a.getImageX(), -this.f27906a.getImageY());
            float alpha = this.f27906a.getAlpha();
            this.f27906a.setAlpha(this.f27907b);
            this.f27906a.draw(canvas);
            this.f27906a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27906a == null) {
            this.f27907b = 0.0f;
        }
        this.f27906a = imageReceiver;
        invalidate();
    }
}
