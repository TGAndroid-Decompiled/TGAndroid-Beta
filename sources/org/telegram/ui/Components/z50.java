package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class z50 extends o60 {
    public ImageReceiver f32840a;
    public float f32841b;
    public final m60 f32842c;

    public z50(m60 m60Var, Context context) {
        super(context);
        this.f32842c = m60Var;
        m60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f32841b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f32841b = f10;
            if (f10 > 1.0f) {
                this.f32841b = 1.0f;
            }
            invalidate();
        }
        if (this.f32840a != null) {
            canvas.save();
            float imageWidth = this.f32840a.getImageWidth();
            int i10 = this.f32842c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f32840a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f32840a.getImageX(), -this.f32840a.getImageY());
            float alpha = this.f32840a.getAlpha();
            this.f32840a.setAlpha(this.f32841b);
            this.f32840a.draw(canvas);
            this.f32840a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32840a == null) {
            this.f32841b = 0.0f;
        }
        this.f32840a = imageReceiver;
        invalidate();
    }
}
