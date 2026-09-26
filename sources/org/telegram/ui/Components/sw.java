package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class sw extends FrameLayout {
    public final boolean f28361a;
    public final mz f28362b;

    public sw(mz mzVar, Context context, boolean z10) {
        super(context);
        this.f28362b = mzVar;
        this.f28361a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mz mzVar = this.f28362b;
        zw zwVar = mzVar.B0;
        uw uwVar = mzVar.D0;
        yw ywVar = mzVar.G0;
        if (!this.f28361a && (view == uwVar || view == ywVar)) {
            canvas.save();
            float y3 = zwVar.getY() + zwVar.getMeasuredHeight() + 1.0f;
            if (view == uwVar) {
                y3 = Math.max(y3, ywVar.getY() + ywVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * mzVar.f26539a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mz mzVar = this.f28362b;
        mzVar.K0 = true;
        mzVar.Y();
        gg.g1 g1Var = mzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mz mzVar = this.f28362b;
        mzVar.K0 = false;
        mzVar.Y();
        gg.g1 g1Var = mzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
