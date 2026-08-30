package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class r50 extends FrameLayout {
    public ImageReceiver f28388a;
    public float f28389b;
    public final x50 f28390c;

    public r50(x50 x50Var, Context context) {
        super(context);
        this.f28390c = x50Var;
        x50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f28389b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f28389b = f11;
            if (f11 > 1.0f) {
                this.f28389b = 1.0f;
            }
            invalidate();
        }
        if (this.f28388a != null) {
            canvas.save();
            float imageWidth = this.f28388a.getImageWidth();
            int i10 = this.f28390c.K0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f28388a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f28388a.getImageX(), -this.f28388a.getImageY());
            float alpha = this.f28388a.getAlpha();
            this.f28388a.setAlpha(this.f28389b);
            this.f28388a.draw(canvas);
            this.f28388a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f28388a == null) {
            this.f28389b = 0.0f;
        }
        this.f28388a = imageReceiver;
        invalidate();
    }
}
