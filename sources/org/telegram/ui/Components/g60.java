package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class g60 extends v60 {
    public ImageReceiver f26606a;
    public float f26607b;
    public final t60 f26608c;

    public g60(t60 t60Var, Context context) {
        super(context);
        this.f26608c = t60Var;
        t60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26607b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26607b = f10;
            if (f10 > 1.0f) {
                this.f26607b = 1.0f;
            }
            invalidate();
        }
        if (this.f26606a != null) {
            canvas.save();
            float imageWidth = this.f26606a.getImageWidth();
            int i10 = this.f26608c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26606a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26606a.getImageX(), -this.f26606a.getImageY());
            float alpha = this.f26606a.getAlpha();
            this.f26606a.setAlpha(this.f26607b);
            this.f26606a.draw(canvas);
            this.f26606a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26606a == null) {
            this.f26607b = 0.0f;
        }
        this.f26606a = imageReceiver;
        invalidate();
    }
}
