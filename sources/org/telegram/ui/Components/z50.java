package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class z50 extends o60 {
    public ImageReceiver f32842a;
    public float f32843b;
    public final m60 f32844c;

    public z50(m60 m60Var, Context context) {
        super(context);
        this.f32844c = m60Var;
        m60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f32843b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f32843b = f10;
            if (f10 > 1.0f) {
                this.f32843b = 1.0f;
            }
            invalidate();
        }
        if (this.f32842a != null) {
            canvas.save();
            float imageWidth = this.f32842a.getImageWidth();
            int i10 = this.f32844c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f32842a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f32842a.getImageX(), -this.f32842a.getImageY());
            float alpha = this.f32842a.getAlpha();
            this.f32842a.setAlpha(this.f32843b);
            this.f32842a.draw(canvas);
            this.f32842a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32842a == null) {
            this.f32843b = 0.0f;
        }
        this.f32842a = imageReceiver;
        invalidate();
    }
}
