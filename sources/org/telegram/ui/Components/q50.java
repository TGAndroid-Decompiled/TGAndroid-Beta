package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class q50 extends FrameLayout {
    public ImageReceiver f27236a;
    public float f27237b;
    public final x50 f27238c;

    public q50(x50 x50Var, Context context) {
        super(context);
        this.f27238c = x50Var;
        x50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f27237b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f27237b = f10;
            if (f10 > 1.0f) {
                this.f27237b = 1.0f;
            }
            invalidate();
        }
        if (this.f27236a != null) {
            canvas.save();
            float imageWidth = this.f27236a.getImageWidth();
            int i10 = this.f27238c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27236a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27236a.getImageX(), -this.f27236a.getImageY());
            float alpha = this.f27236a.getAlpha();
            this.f27236a.setAlpha(this.f27237b);
            this.f27236a.draw(canvas);
            this.f27236a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27236a == null) {
            this.f27237b = 0.0f;
        }
        this.f27236a = imageReceiver;
        invalidate();
    }
}
