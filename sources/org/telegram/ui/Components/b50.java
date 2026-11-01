package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class b50 extends g50 {
    public ImageReceiver f24634a;
    public float f24635b;
    public final d50 f24636c;

    public b50(d50 d50Var, Context context) {
        super(context);
        this.f24636c = d50Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d50 d50Var = this.f24636c;
        FrameLayout frameLayout = d50Var.f25406x;
        kl0 kl0Var = d50Var.f25404w;
        nh.f fVar = d50Var.f25408y;
        super.dispatchDraw(canvas);
        if (this.f24634a == null) {
            return;
        }
        float f7 = this.f24635b;
        if (f7 < 1.0f) {
            this.f24635b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(fVar.getLeft() + frameLayout.getLeft() + kl0Var.getLeft(), fVar.getTop() + frameLayout.getTop() + kl0Var.getTop());
        if (this.f24634a.M0 != fVar.getWidth()) {
            float width = fVar.getWidth() / this.f24634a.M0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f24634a;
        canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
        float alpha = this.f24634a.getAlpha();
        this.f24634a.setAlpha(this.f24635b);
        this.f24634a.h(canvas, null);
        this.f24634a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f24634a == null) {
            this.f24635b = 0.0f;
        }
        this.f24634a = imageReceiver;
        invalidate();
    }
}
