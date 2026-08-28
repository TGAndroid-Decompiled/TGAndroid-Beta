package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class y40 extends FrameLayout {
    public ImageReceiver f34848a;
    public float f34849b;
    public final f50 f34850c;

    public y40(f50 f50Var, Context context) {
        super(context);
        this.f34850c = f50Var;
        f50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f34849b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f34849b = f11;
            if (f11 > 1.0f) {
                this.f34849b = 1.0f;
            }
            invalidate();
        }
        if (this.f34848a != null) {
            canvas.save();
            float imageWidth = this.f34848a.getImageWidth();
            int i9 = this.f34850c.J0;
            if (imageWidth != i9) {
                float imageWidth2 = i9 / this.f34848a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f34848a.getImageX(), -this.f34848a.getImageY());
            float alpha = this.f34848a.getAlpha();
            this.f34848a.setAlpha(this.f34849b);
            this.f34848a.draw(canvas);
            this.f34848a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f34848a == null) {
            this.f34849b = 0.0f;
        }
        this.f34848a = imageReceiver;
        invalidate();
    }
}
