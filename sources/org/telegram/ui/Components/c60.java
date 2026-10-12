package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
public abstract class c60 extends r60 {
    public ImageReceiver f23957a;
    public float f23958b;
    public final p60 f23959c;

    public c60(p60 p60Var, Context context) {
        super(context);
        this.f23959c = p60Var;
        p60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f23958b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f23958b = f10;
            if (f10 > 1.0f) {
                this.f23958b = 1.0f;
            }
            invalidate();
        }
        if (this.f23957a != null) {
            canvas.save();
            float imageWidth = this.f23957a.getImageWidth();
            int i10 = this.f23959c.X0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f23957a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f23957a.getImageX(), -this.f23957a.getImageY());
            float alpha = this.f23957a.getAlpha();
            this.f23957a.setAlpha(this.f23958b);
            this.f23957a.draw(canvas);
            this.f23957a.setAlpha(alpha);
            canvas.restore();
        }
    }

    @Override
    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f23957a == null) {
            this.f23958b = 0.0f;
        }
        this.f23957a = imageReceiver;
        invalidate();
    }
}
