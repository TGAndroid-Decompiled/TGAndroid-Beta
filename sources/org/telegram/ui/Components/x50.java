package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class x50 extends n60 {
    public ImageReceiver f32524a;
    public float f32525b;
    public final l60 f32526c;

    public x50(l60 l60Var, Context context) {
        super(context);
        this.f32526c = l60Var;
        l60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f32525b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f32525b = f10;
            if (f10 > 1.0f) {
                this.f32525b = 1.0f;
            }
            invalidate();
        }
        if (this.f32524a != null) {
            canvas.save();
            float imageWidth = this.f32524a.getImageWidth();
            int i10 = this.f32526c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f32524a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f32524a.getImageX(), -this.f32524a.getImageY());
            float alpha = this.f32524a.getAlpha();
            this.f32524a.setAlpha(this.f32525b);
            this.f32524a.draw(canvas);
            this.f32524a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32524a == null) {
            this.f32525b = 0.0f;
        }
        this.f32524a = imageReceiver;
        invalidate();
    }
}
