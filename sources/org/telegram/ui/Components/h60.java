package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class h60 extends w60 {
    public ImageReceiver f26915a;
    public float f26916b;
    public final u60 f26917c;

    public h60(u60 u60Var, Context context) {
        super(context);
        this.f26917c = u60Var;
        u60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26916b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26916b = f10;
            if (f10 > 1.0f) {
                this.f26916b = 1.0f;
            }
            invalidate();
        }
        if (this.f26915a != null) {
            canvas.save();
            float imageWidth = this.f26915a.getImageWidth();
            int i10 = this.f26917c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26915a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26915a.getImageX(), -this.f26915a.getImageY());
            float alpha = this.f26915a.getAlpha();
            this.f26915a.setAlpha(this.f26916b);
            this.f26915a.draw(canvas);
            this.f26915a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26915a == null) {
            this.f26916b = 0.0f;
        }
        this.f26915a = imageReceiver;
        invalidate();
    }
}
