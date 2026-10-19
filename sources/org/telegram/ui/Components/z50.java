package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class z50 extends o60 {
    public ImageReceiver f32861a;
    public float f32862b;
    public final m60 f32863c;

    public z50(m60 m60Var, Context context) {
        super(context);
        this.f32863c = m60Var;
        m60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f32862b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f32862b = f10;
            if (f10 > 1.0f) {
                this.f32862b = 1.0f;
            }
            invalidate();
        }
        if (this.f32861a != null) {
            canvas.save();
            float imageWidth = this.f32861a.getImageWidth();
            int i10 = this.f32863c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f32861a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f32861a.getImageX(), -this.f32861a.getImageY());
            float alpha = this.f32861a.getAlpha();
            this.f32861a.setAlpha(this.f32862b);
            this.f32861a.draw(canvas);
            this.f32861a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32861a == null) {
            this.f32862b = 0.0f;
        }
        this.f32861a = imageReceiver;
        invalidate();
    }
}
