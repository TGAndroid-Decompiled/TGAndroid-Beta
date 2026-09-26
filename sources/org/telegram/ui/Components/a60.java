package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class a60 extends f60 {
    public ImageReceiver f22546a;
    public float f22547b;
    public final c60 f22548c;

    public a60(c60 c60Var, Context context) {
        super(context);
        this.f22548c = c60Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c60 c60Var = this.f22548c;
        FrameLayout frameLayout = c60Var.f23245x;
        jm0 jm0Var = c60Var.f23243w;
        z50 z50Var = c60Var.f23247y;
        super.dispatchDraw(canvas);
        if (this.f22546a == null) {
            return;
        }
        float f7 = this.f22547b;
        if (f7 < 1.0f) {
            this.f22547b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(z50Var.getLeft() + frameLayout.getLeft() + jm0Var.getLeft(), z50Var.getTop() + frameLayout.getTop() + jm0Var.getTop());
        if (this.f22546a.getImageWidth() != z50Var.getWidth()) {
            float width = z50Var.getWidth() / this.f22546a.getImageWidth();
            canvas.scale(width, width);
        }
        canvas.translate(-this.f22546a.getImageX(), -this.f22546a.getImageY());
        float alpha = this.f22546a.getAlpha();
        this.f22546a.setAlpha(this.f22547b);
        this.f22546a.draw(canvas);
        this.f22546a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f22546a == null) {
            this.f22547b = 0.0f;
        }
        this.f22546a = imageReceiver;
        invalidate();
    }
}
