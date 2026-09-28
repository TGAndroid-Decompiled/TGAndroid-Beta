package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class b60 extends g60 {
    public ImageReceiver f22872a;
    public float f22873b;
    public final d60 f22874c;

    public b60(d60 d60Var, Context context) {
        super(context);
        this.f22874c = d60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d60 d60Var = this.f22874c;
        FrameLayout frameLayout = d60Var.f23560x;
        km0 km0Var = d60Var.f23558w;
        a60 a60Var = d60Var.f23562y;
        super.dispatchDraw(canvas);
        if (this.f22872a == null) {
            return;
        }
        float f7 = this.f22873b;
        if (f7 < 1.0f) {
            this.f22873b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(a60Var.getLeft() + frameLayout.getLeft() + km0Var.getLeft(), a60Var.getTop() + frameLayout.getTop() + km0Var.getTop());
        if (this.f22872a.getImageWidth() != a60Var.getWidth()) {
            float width = a60Var.getWidth() / this.f22872a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f22872a.getImageX(), -this.f22872a.getImageY());
        float alpha = this.f22872a.getAlpha();
        this.f22872a.setAlpha(this.f22873b);
        this.f22872a.draw(canvas);
        this.f22872a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f22872a == null) {
            this.f22873b = 0.0f;
        }
        this.f22872a = imageReceiver;
        invalidate();
    }
}
