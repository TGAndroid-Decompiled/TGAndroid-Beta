package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class ov extends FrameLayout {
    public final boolean f36697a;
    public final hy f36698b;

    public ov(hy hyVar, Context context, boolean z9) {
        super(context);
        this.f36698b = hyVar;
        this.f36697a = z9;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hy hyVar = this.f36698b;
        uv uvVar = hyVar.B0;
        qv qvVar = hyVar.D0;
        tv tvVar = hyVar.G0;
        if (!this.f36697a && (view == qvVar || view == tvVar)) {
            canvas.save();
            float y10 = uvVar.getY() + uvVar.getMeasuredHeight() + 1.0f;
            if (view == qvVar) {
                y10 = Math.max(y10, tvVar.getY() + tvVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * hyVar.f34390a.f55486e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hy hyVar = this.f36698b;
        hyVar.K0 = true;
        hyVar.Z();
        jg.e1 e1Var = hyVar.T0;
        if (e1Var != null) {
            e1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hy hyVar = this.f36698b;
        hyVar.K0 = false;
        hyVar.Z();
        jg.e1 e1Var = hyVar.T0;
        if (e1Var != null) {
            e1Var.a();
        }
    }
}
