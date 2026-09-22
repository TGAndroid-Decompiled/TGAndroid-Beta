package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends FrameLayout {
    public ImageReceiver f26947a;
    public float f26948b;
    public final w50 f26949c;

    public p50(w50 w50Var, Context context) {
        super(context);
        this.f26949c = w50Var;
        w50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26948b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26948b = f10;
            if (f10 > 1.0f) {
                this.f26948b = 1.0f;
            }
            invalidate();
        }
        if (this.f26947a != null) {
            canvas.save();
            float imageWidth = this.f26947a.getImageWidth();
            int i10 = this.f26949c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26947a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26947a.getImageX(), -this.f26947a.getImageY());
            float alpha = this.f26947a.getAlpha();
            this.f26947a.setAlpha(this.f26948b);
            this.f26947a.draw(canvas);
            this.f26947a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26947a == null) {
            this.f26948b = 0.0f;
        }
        this.f26947a = imageReceiver;
        invalidate();
    }
}
