package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class p50 extends FrameLayout {
    public ImageReceiver f29279a;
    public float f29280b;
    public final w50 f29281c;

    public p50(w50 w50Var, Context context) {
        super(context);
        this.f29281c = w50Var;
        w50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f29280b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f29280b = f10;
            if (f10 > 1.0f) {
                this.f29280b = 1.0f;
            }
            invalidate();
        }
        if (this.f29279a != null) {
            canvas.save();
            float imageWidth = this.f29279a.getImageWidth();
            int i10 = this.f29281c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f29279a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f29279a.getImageX(), -this.f29279a.getImageY());
            float alpha = this.f29279a.getAlpha();
            this.f29279a.setAlpha(this.f29280b);
            this.f29279a.draw(canvas);
            this.f29279a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f29279a == null) {
            this.f29280b = 0.0f;
        }
        this.f29279a = imageReceiver;
        invalidate();
    }
}
