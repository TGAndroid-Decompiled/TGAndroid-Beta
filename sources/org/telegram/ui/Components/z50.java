package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class z50 extends o60 {
    public ImageReceiver f32859a;
    public float f32860b;
    public final m60 f32861c;

    public z50(m60 m60Var, Context context) {
        super(context);
        this.f32861c = m60Var;
        m60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f32860b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f32860b = f10;
            if (f10 > 1.0f) {
                this.f32860b = 1.0f;
            }
            invalidate();
        }
        if (this.f32859a != null) {
            canvas.save();
            float imageWidth = this.f32859a.getImageWidth();
            int i10 = this.f32861c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f32859a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f32859a.getImageX(), -this.f32859a.getImageY());
            float alpha = this.f32859a.getAlpha();
            this.f32859a.setAlpha(this.f32860b);
            this.f32859a.draw(canvas);
            this.f32859a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f32859a == null) {
            this.f32860b = 0.0f;
        }
        this.f32859a = imageReceiver;
        invalidate();
    }
}
