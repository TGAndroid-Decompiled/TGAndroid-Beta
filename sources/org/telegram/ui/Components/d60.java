package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class d60 extends r60 {
    public ImageReceiver f23994a;
    public float f23995b;
    public final p60 f23996c;

    public d60(p60 p60Var, Context context) {
        super(context);
        this.f23996c = p60Var;
        p60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f23995b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f23995b = f10;
            if (f10 > 1.0f) {
                this.f23995b = 1.0f;
            }
            invalidate();
        }
        if (this.f23994a != null) {
            canvas.save();
            float imageWidth = this.f23994a.getImageWidth();
            int i10 = this.f23996c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f23994a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f23994a.getImageX(), -this.f23994a.getImageY());
            float alpha = this.f23994a.getAlpha();
            this.f23994a.setAlpha(this.f23995b);
            this.f23994a.draw(canvas);
            this.f23994a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f23994a == null) {
            this.f23995b = 0.0f;
        }
        this.f23994a = imageReceiver;
        invalidate();
    }
}
