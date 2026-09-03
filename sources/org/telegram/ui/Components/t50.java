package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class t50 extends FrameLayout {
    public ImageReceiver f31273a;
    public float f31274b;
    public final z50 f31275c;

    public t50(z50 z50Var, Context context) {
        super(context);
        this.f31275c = z50Var;
        z50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f31274b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f31274b = f11;
            if (f11 > 1.0f) {
                this.f31274b = 1.0f;
            }
            invalidate();
        }
        if (this.f31273a != null) {
            canvas.save();
            float imageWidth = this.f31273a.getImageWidth();
            int i10 = this.f31275c.K0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f31273a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f31273a.getImageX(), -this.f31273a.getImageY());
            float alpha = this.f31273a.getAlpha();
            this.f31273a.setAlpha(this.f31274b);
            this.f31273a.draw(canvas);
            this.f31273a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f31273a == null) {
            this.f31274b = 0.0f;
        }
        this.f31273a = imageReceiver;
        invalidate();
    }
}
