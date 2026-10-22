package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class z50 extends o60 {
    public ImageReceiver f32846a;
    public float f32847b;
    public final m60 f32848c;

    public z50(m60 m60Var, Context context) {
        super(context);
        this.f32848c = m60Var;
        m60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f32847b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f32847b = f10;
            if (f10 > 1.0f) {
                this.f32847b = 1.0f;
            }
            invalidate();
        }
        if (this.f32846a != null) {
            canvas.save();
            float imageWidth = this.f32846a.getImageWidth();
            int i10 = this.f32848c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f32846a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f32846a.getImageX(), -this.f32846a.getImageY());
            float alpha = this.f32846a.getAlpha();
            this.f32846a.setAlpha(this.f32847b);
            this.f32846a.draw(canvas);
            this.f32846a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32846a == null) {
            this.f32847b = 0.0f;
        }
        this.f32846a = imageReceiver;
        invalidate();
    }
}
