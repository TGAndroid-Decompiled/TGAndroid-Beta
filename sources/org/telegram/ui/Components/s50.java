package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class s50 extends FrameLayout {
    public ImageReceiver f28667a;
    public float f28668b;
    public final y50 f28669c;

    public s50(y50 y50Var, Context context) {
        super(context);
        this.f28669c = y50Var;
        y50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f28668b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f28668b = f11;
            if (f11 > 1.0f) {
                this.f28668b = 1.0f;
            }
            invalidate();
        }
        if (this.f28667a != null) {
            canvas.save();
            float imageWidth = this.f28667a.getImageWidth();
            int i10 = this.f28669c.K0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f28667a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f28667a.getImageX(), -this.f28667a.getImageY());
            float alpha = this.f28667a.getAlpha();
            this.f28667a.setAlpha(this.f28668b);
            this.f28667a.draw(canvas);
            this.f28667a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f28667a == null) {
            this.f28668b = 0.0f;
        }
        this.f28667a = imageReceiver;
        invalidate();
    }
}
