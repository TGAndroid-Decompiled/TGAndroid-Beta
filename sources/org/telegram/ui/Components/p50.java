package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends FrameLayout {
    public ImageReceiver f29306a;
    public float f29307b;
    public final w50 f29308c;

    public p50(w50 w50Var, Context context) {
        super(context);
        this.f29308c = w50Var;
        w50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f29307b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f29307b = f10;
            if (f10 > 1.0f) {
                this.f29307b = 1.0f;
            }
            invalidate();
        }
        if (this.f29306a != null) {
            canvas.save();
            float imageWidth = this.f29306a.getImageWidth();
            int i10 = this.f29308c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f29306a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f29306a.getImageX(), -this.f29306a.getImageY());
            float alpha = this.f29306a.getAlpha();
            this.f29306a.setAlpha(this.f29307b);
            this.f29306a.draw(canvas);
            this.f29306a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f29306a == null) {
            this.f29307b = 0.0f;
        }
        this.f29306a = imageReceiver;
        invalidate();
    }
}
