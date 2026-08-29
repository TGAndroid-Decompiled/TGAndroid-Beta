package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class m50 extends FrameLayout {
    public ImageReceiver f30574a;
    public float f30575b;
    public final s50 f30576c;

    public m50(s50 s50Var, Context context) {
        super(context);
        this.f30576c = s50Var;
        s50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f9 = this.f30575b;
        if (f9 != 1.0f) {
            float f10 = f9 + 0.064f;
            this.f30575b = f10;
            if (f10 > 1.0f) {
                this.f30575b = 1.0f;
            }
            invalidate();
        }
        if (this.f30574a != null) {
            canvas.save();
            float imageWidth = this.f30574a.getImageWidth();
            int i10 = this.f30576c.J0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f30574a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f30574a.getImageX(), -this.f30574a.getImageY());
            float alpha = this.f30574a.getAlpha();
            this.f30574a.setAlpha(this.f30575b);
            this.f30574a.draw(canvas);
            this.f30574a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30574a == null) {
            this.f30575b = 0.0f;
        }
        this.f30574a = imageReceiver;
        invalidate();
    }
}
