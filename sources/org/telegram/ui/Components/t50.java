package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class t50 extends FrameLayout {
    public ImageReceiver f31264a;
    public float f31265b;
    public final z50 f31266c;

    public t50(z50 z50Var, Context context) {
        super(context);
        this.f31266c = z50Var;
        z50Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.f31265b;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.064f;
            this.f31265b = f11;
            if (f11 > 1.0f) {
                this.f31265b = 1.0f;
            }
            invalidate();
        }
        if (this.f31264a != null) {
            canvas.save();
            float imageWidth = this.f31264a.getImageWidth();
            int i10 = this.f31266c.K0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f31264a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f31264a.getImageX(), -this.f31264a.getImageY());
            float alpha = this.f31264a.getAlpha();
            this.f31264a.setAlpha(this.f31265b);
            this.f31264a.draw(canvas);
            this.f31264a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f31264a == null) {
            this.f31265b = 0.0f;
        }
        this.f31264a = imageReceiver;
        invalidate();
    }
}
