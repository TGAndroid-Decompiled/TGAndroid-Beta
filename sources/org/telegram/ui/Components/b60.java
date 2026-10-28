package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class b60 extends r60 {
    public ImageReceiver f26741a;
    public float f26742b;
    public final p60 f26743c;

    public b60(p60 p60Var, Context context) {
        super(context);
        this.f26743c = p60Var;
        p60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f26742b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f26742b = f10;
            if (f10 > 1.0f) {
                this.f26742b = 1.0f;
            }
            invalidate();
        }
        if (this.f26741a != null) {
            canvas.save();
            float imageWidth = this.f26741a.getImageWidth();
            int i10 = this.f26743c.W0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f26741a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f26741a.getImageX(), -this.f26741a.getImageY());
            float alpha = this.f26741a.getAlpha();
            this.f26741a.setAlpha(this.f26742b);
            this.f26741a.draw(canvas);
            this.f26741a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f26741a == null) {
            this.f26742b = 0.0f;
        }
        this.f26741a = imageReceiver;
        invalidate();
    }
}
