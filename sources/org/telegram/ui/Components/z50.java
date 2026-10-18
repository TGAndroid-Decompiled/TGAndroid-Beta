package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class z50 extends o60 {
    public ImageReceiver f32847a;
    public float f32848b;
    public final m60 f32849c;

    public z50(m60 m60Var, Context context) {
        super(context);
        this.f32849c = m60Var;
        m60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f32848b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f32848b = f10;
            if (f10 > 1.0f) {
                this.f32848b = 1.0f;
            }
            invalidate();
        }
        if (this.f32847a != null) {
            canvas.save();
            float imageWidth = this.f32847a.getImageWidth();
            int i10 = this.f32849c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f32847a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f32847a.getImageX(), -this.f32847a.getImageY());
            float alpha = this.f32847a.getAlpha();
            this.f32847a.setAlpha(this.f32848b);
            this.f32847a.draw(canvas);
            this.f32847a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32847a == null) {
            this.f32848b = 0.0f;
        }
        this.f32847a = imageReceiver;
        invalidate();
    }
}
