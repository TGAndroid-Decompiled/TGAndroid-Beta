package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class b50 extends g50 {
    public ImageReceiver f24543a;
    public float f24544b;
    public final d50 f24545c;

    public b50(d50 d50Var, Context context) {
        super(context);
        this.f24545c = d50Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d50 d50Var = this.f24545c;
        FrameLayout frameLayout = d50Var.f25335x;
        jl0 jl0Var = d50Var.f25333w;
        nh.f fVar = d50Var.f25337y;
        super.dispatchDraw(canvas);
        if (this.f24543a == null) {
            return;
        }
        float f7 = this.f24544b;
        if (f7 < 1.0f) {
            this.f24544b = Math.min(1.0f, f7 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(fVar.getLeft() + frameLayout.getLeft() + jl0Var.getLeft(), fVar.getTop() + frameLayout.getTop() + jl0Var.getTop());
        if (this.f24543a.M0 != fVar.getWidth()) {
            float width = fVar.getWidth() / this.f24543a.M0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f24543a;
        canvas.translate(-imageReceiver.K0, -imageReceiver.L0);
        float alpha = this.f24543a.getAlpha();
        this.f24543a.setAlpha(this.f24544b);
        this.f24543a.h(canvas, null);
        this.f24543a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f24543a == null) {
            this.f24544b = 0.0f;
        }
        this.f24543a = imageReceiver;
        invalidate();
    }
}
