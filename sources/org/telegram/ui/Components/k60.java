package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class k60 extends p60 {
    public ImageReceiver f27889a;
    public float f27890b;
    public final m60 f27891c;

    public k60(m60 m60Var, Context context) {
        super(context);
        this.f27891c = m60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m60 m60Var = this.f27891c;
        FrameLayout frameLayout = m60Var.f28548x;
        ym0 ym0Var = m60Var.f28546w;
        j60 j60Var = m60Var.f28550y;
        super.dispatchDraw(canvas);
        if (this.f27889a == null) {
            return;
        }
        float f7 = this.f27890b;
        if (f7 < 1.0f) {
            this.f27890b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(j60Var.getLeft() + frameLayout.getLeft() + ym0Var.getLeft(), j60Var.getTop() + frameLayout.getTop() + ym0Var.getTop());
        if (this.f27889a.getImageWidth() != j60Var.getWidth()) {
            float width = j60Var.getWidth() / this.f27889a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f27889a.getImageX(), -this.f27889a.getImageY());
        float alpha = this.f27889a.getAlpha();
        this.f27889a.setAlpha(this.f27890b);
        this.f27889a.draw(canvas);
        this.f27889a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f27889a == null) {
            this.f27890b = 0.0f;
        }
        this.f27889a = imageReceiver;
        invalidate();
    }
}
