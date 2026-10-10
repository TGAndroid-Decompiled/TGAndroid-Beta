package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class h60 extends w60 {
    public ImageReceiver f26953a;
    public float f26954b;
    public final u60 f26955c;

    public h60(u60 u60Var, Context context) {
        super(context);
        this.f26955c = u60Var;
        u60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26954b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26954b = f10;
            if (f10 > 1.0f) {
                this.f26954b = 1.0f;
            }
            invalidate();
        }
        if (this.f26953a != null) {
            canvas.save();
            float imageWidth = this.f26953a.getImageWidth();
            int i10 = this.f26955c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26953a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26953a.getImageX(), -this.f26953a.getImageY());
            float alpha = this.f26953a.getAlpha();
            this.f26953a.setAlpha(this.f26954b);
            this.f26953a.draw(canvas);
            this.f26953a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26953a == null) {
            this.f26954b = 0.0f;
        }
        this.f26953a = imageReceiver;
        invalidate();
    }
}
