package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class mv extends FrameLayout {
    public final boolean f36256a;
    public final ey f36257b;

    public mv(ey eyVar, Context context, boolean z10) {
        super(context);
        this.f36257b = eyVar;
        this.f36256a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ey eyVar = this.f36257b;
        sv svVar = eyVar.C0;
        ov ovVar = eyVar.E0;
        rv rvVar = eyVar.H0;
        if (!this.f36256a && (view == ovVar || view == rvVar)) {
            canvas.save();
            float y9 = svVar.getY() + svVar.getMeasuredHeight() + 1.0f;
            if (view == ovVar) {
                y9 = Math.max(y9, rvVar.getY() + rvVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y9 - (org.telegram.messenger.g0.L(16.0f) * eyVar.f33517a.f53840e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ey eyVar = this.f36257b;
        eyVar.L0 = true;
        eyVar.Z();
        kg.a1 a1Var = eyVar.U0;
        if (a1Var != null) {
            a1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ey eyVar = this.f36257b;
        eyVar.L0 = false;
        eyVar.Z();
        kg.a1 a1Var = eyVar.U0;
        if (a1Var != null) {
            a1Var.a();
        }
    }
}
