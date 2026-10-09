package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class q60 extends v60 {
    public ImageReceiver f30088a;
    public float f30089b;
    public final s60 f30090c;

    public q60(s60 s60Var, Context context) {
        super(context);
        this.f30090c = s60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s60 s60Var = this.f30090c;
        FrameLayout frameLayout = s60Var.f30700x;
        cn0 cn0Var = s60Var.f30698w;
        p60 p60Var = s60Var.f30702y;
        super.dispatchDraw(canvas);
        if (this.f30088a == null) {
            return;
        }
        float f7 = this.f30089b;
        if (f7 < 1.0f) {
            this.f30089b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(p60Var.getLeft() + frameLayout.getLeft() + cn0Var.getLeft(), p60Var.getTop() + frameLayout.getTop() + cn0Var.getTop());
        if (this.f30088a.getImageWidth() != p60Var.getWidth()) {
            float width = p60Var.getWidth() / this.f30088a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f30088a.getImageX(), -this.f30088a.getImageY());
        float alpha = this.f30088a.getAlpha();
        this.f30088a.setAlpha(this.f30089b);
        this.f30088a.draw(canvas);
        this.f30088a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f30088a == null) {
            this.f30089b = 0.0f;
        }
        this.f30088a = imageReceiver;
        invalidate();
    }
}
