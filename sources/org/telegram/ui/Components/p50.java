package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends FrameLayout {
    public ImageReceiver f29280a;
    public float f29281b;
    public final w50 f29282c;

    public p50(w50 w50Var, Context context) {
        super(context);
        this.f29282c = w50Var;
        w50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f29281b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f29281b = f10;
            if (f10 > 1.0f) {
                this.f29281b = 1.0f;
            }
            invalidate();
        }
        if (this.f29280a != null) {
            canvas.save();
            float imageWidth = this.f29280a.getImageWidth();
            int i10 = this.f29282c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f29280a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f29280a.getImageX(), -this.f29280a.getImageY());
            float alpha = this.f29280a.getAlpha();
            this.f29280a.setAlpha(this.f29281b);
            this.f29280a.draw(canvas);
            this.f29280a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f29280a == null) {
            this.f29281b = 0.0f;
        }
        this.f29280a = imageReceiver;
        invalidate();
    }
}
