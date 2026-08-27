package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

public abstract class d50 extends FrameLayout {

    public ImageReceiver f27651a;

    public float f27652b;

    public final k50 f27653c;

    public d50(k50 k50Var, Context context) {
        super(context);
        this.f27653c = k50Var;
        k50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f27652b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f27652b = f11;
            if (f11 > 1.0f) {
                this.f27652b = 1.0f;
            }
            invalidate();
        }
        if (this.f27651a != null) {
            canvas.save();
            float imageWidth = this.f27651a.getImageWidth();
            int i10 = this.f27653c.J0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f27651a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f27651a.getImageX(), -this.f27651a.getImageY());
            float alpha = this.f27651a.getAlpha();
            this.f27651a.setAlpha(this.f27652b);
            this.f27651a.draw(canvas);
            this.f27651a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27651a == null) {
            this.f27652b = 0.0f;
        }
        this.f27651a = imageReceiver;
        invalidate();
    }
}
