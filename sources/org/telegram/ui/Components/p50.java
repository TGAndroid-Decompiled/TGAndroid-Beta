package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends FrameLayout {
    public ImageReceiver f29307a;
    public float f29308b;
    public final w50 f29309c;

    public p50(w50 w50Var, Context context) {
        super(context);
        this.f29309c = w50Var;
        w50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f29308b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f29308b = f10;
            if (f10 > 1.0f) {
                this.f29308b = 1.0f;
            }
            invalidate();
        }
        if (this.f29307a != null) {
            canvas.save();
            float imageWidth = this.f29307a.getImageWidth();
            int i10 = this.f29309c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f29307a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f29307a.getImageX(), -this.f29307a.getImageY());
            float alpha = this.f29307a.getAlpha();
            this.f29307a.setAlpha(this.f29308b);
            this.f29307a.draw(canvas);
            this.f29307a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f29307a == null) {
            this.f29308b = 0.0f;
        }
        this.f29307a = imageReceiver;
        invalidate();
    }
}
