package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public abstract class z50 extends FrameLayout {
    public ImageReceiver f29595a;
    public float f29596b;
    public final f60 f29597c;

    public z50(f60 f60Var, Context context) {
        super(context);
        this.f29597c = f60Var;
        f60Var.setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f29596b;
        if (f7 != 1.0f) {
            float f10 = f7 + 0.064f;
            this.f29596b = f10;
            if (f10 > 1.0f) {
                this.f29596b = 1.0f;
            }
            invalidate();
        }
        if (this.f29595a != null) {
            canvas.save();
            float imageWidth = this.f29595a.getImageWidth();
            int i10 = this.f29597c.N0;
            if (imageWidth != i10) {
                float imageWidth2 = i10 / this.f29595a.getImageWidth();
                canvas.scale(imageWidth2, imageWidth2);
            }
            canvas.translate(-this.f29595a.getImageX(), -this.f29595a.getImageY());
            float alpha = this.f29595a.getAlpha();
            this.f29595a.setAlpha(this.f29596b);
            this.f29595a.draw(canvas);
            this.f29595a.setAlpha(alpha);
            canvas.restore();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f29595a == null) {
            this.f29596b = 0.0f;
        }
        this.f29595a = imageReceiver;
        invalidate();
    }
}
