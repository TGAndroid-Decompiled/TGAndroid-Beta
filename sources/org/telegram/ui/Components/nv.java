package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class nv extends FrameLayout {
    public final boolean f36428a;
    public final gy f36429b;

    public nv(gy gyVar, Context context, boolean z9) {
        super(context);
        this.f36429b = gyVar;
        this.f36428a = z9;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gy gyVar = this.f36429b;
        tv tvVar = gyVar.B0;
        pv pvVar = gyVar.D0;
        sv svVar = gyVar.G0;
        if (!this.f36428a && (view == pvVar || view == svVar)) {
            canvas.save();
            float y10 = tvVar.getY() + tvVar.getMeasuredHeight() + 1.0f;
            if (view == pvVar) {
                y10 = Math.max(y10, svVar.getY() + svVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * gyVar.f34022a.f55394e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gy gyVar = this.f36429b;
        gyVar.K0 = true;
        gyVar.Z();
        jg.e1 e1Var = gyVar.T0;
        if (e1Var != null) {
            e1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gy gyVar = this.f36429b;
        gyVar.K0 = false;
        gyVar.Z();
        jg.e1 e1Var = gyVar.T0;
        if (e1Var != null) {
            e1Var.a();
        }
    }
}
