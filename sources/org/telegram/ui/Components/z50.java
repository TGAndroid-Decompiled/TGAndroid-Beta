package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class z50 extends p60 {
    public ImageReceiver f33147a;
    public float f33148b;
    public final n60 f33149c;

    public z50(n60 n60Var, Context context) {
        super(context);
        this.f33149c = n60Var;
        n60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f33148b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f33148b = f10;
            if (f10 > 1.0f) {
                this.f33148b = 1.0f;
            }
            invalidate();
        }
        if (this.f33147a != null) {
            canvas.save();
            float imageWidth = this.f33147a.getImageWidth();
            int i10 = this.f33149c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f33147a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f33147a.getImageX(), -this.f33147a.getImageY());
            float alpha = this.f33147a.getAlpha();
            this.f33147a.setAlpha(this.f33148b);
            this.f33147a.draw(canvas);
            this.f33147a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f33147a == null) {
            this.f33148b = 0.0f;
        }
        this.f33147a = imageReceiver;
        invalidate();
    }
}
