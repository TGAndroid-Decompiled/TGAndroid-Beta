package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class yv extends FrameLayout {
    public final boolean f42565a;
    public final qy f42566b;

    public yv(qy qyVar, Context context, boolean z10) {
        super(context);
        this.f42566b = qyVar;
        this.f42565a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        qy qyVar = this.f42566b;
        ew ewVar = qyVar.C0;
        aw awVar = qyVar.E0;
        dw dwVar = qyVar.H0;
        if (!this.f42565a && (view == awVar || view == dwVar)) {
            canvas.save();
            float y10 = ewVar.getY() + ewVar.getMeasuredHeight() + 1.0f;
            if (view == awVar) {
                y10 = Math.max(y10, dwVar.getY() + dwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * qyVar.f39034a.f57779e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qy qyVar = this.f42566b;
        qyVar.L0 = true;
        qyVar.Z();
        jg.d1 d1Var = qyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qy qyVar = this.f42566b;
        qyVar.L0 = false;
        qyVar.Z();
        jg.d1 d1Var = qyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }
}
