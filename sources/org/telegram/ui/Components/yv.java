package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class yv extends FrameLayout {
    public final boolean f42641a;
    public final ry f42642b;

    public yv(ry ryVar, Context context, boolean z10) {
        super(context);
        this.f42642b = ryVar;
        this.f42641a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ry ryVar = this.f42642b;
        fw fwVar = ryVar.C0;
        aw awVar = ryVar.E0;
        ew ewVar = ryVar.H0;
        if (!this.f42641a && (view == awVar || view == ewVar)) {
            canvas.save();
            float y10 = fwVar.getY() + fwVar.getMeasuredHeight() + 1.0f;
            if (view == awVar) {
                y10 = Math.max(y10, ewVar.getY() + ewVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * ryVar.f39332a.f57657e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ry ryVar = this.f42642b;
        ryVar.L0 = true;
        ryVar.Z();
        jg.d1 d1Var = ryVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ry ryVar = this.f42642b;
        ryVar.L0 = false;
        ryVar.Z();
        jg.d1 d1Var = ryVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }
}
