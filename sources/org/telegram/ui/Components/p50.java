package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends FrameLayout {
    public ImageReceiver f26950a;
    public float f26951b;
    public final w50 f26952c;

    public p50(w50 w50Var, Context context) {
        super(context);
        this.f26952c = w50Var;
        w50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26951b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26951b = f10;
            if (f10 > 1.0f) {
                this.f26951b = 1.0f;
            }
            invalidate();
        }
        if (this.f26950a != null) {
            canvas.save();
            float imageWidth = this.f26950a.getImageWidth();
            int i10 = this.f26952c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26950a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26950a.getImageX(), -this.f26950a.getImageY());
            float alpha = this.f26950a.getAlpha();
            this.f26950a.setAlpha(this.f26951b);
            this.f26950a.draw(canvas);
            this.f26950a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26950a == null) {
            this.f26951b = 0.0f;
        }
        this.f26950a = imageReceiver;
        invalidate();
    }
}
