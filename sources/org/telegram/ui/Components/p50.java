package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends FrameLayout {
    public ImageReceiver f26930a;
    public float f26931b;
    public final w50 f26932c;

    public p50(w50 w50Var, Context context) {
        super(context);
        this.f26932c = w50Var;
        w50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26931b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26931b = f10;
            if (f10 > 1.0f) {
                this.f26931b = 1.0f;
            }
            invalidate();
        }
        if (this.f26930a != null) {
            canvas.save();
            float imageWidth = this.f26930a.getImageWidth();
            int i10 = this.f26932c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26930a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26930a.getImageX(), -this.f26930a.getImageY());
            float alpha = this.f26930a.getAlpha();
            this.f26930a.setAlpha(this.f26931b);
            this.f26930a.draw(canvas);
            this.f26930a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26930a == null) {
            this.f26931b = 0.0f;
        }
        this.f26930a = imageReceiver;
        invalidate();
    }
}
