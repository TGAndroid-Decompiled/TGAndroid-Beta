package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jx extends FrameLayout {
    public final boolean f27659a;
    public final d00 f27660b;

    public jx(d00 d00Var, Context context, boolean z10) {
        super(context);
        this.f27660b = d00Var;
        this.f27659a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d00 d00Var = this.f27660b;
        px pxVar = d00Var.B0;
        lx lxVar = d00Var.D0;
        ox oxVar = d00Var.G0;
        if (!this.f27659a && (view == lxVar || view == oxVar)) {
            canvas.save();
            float y3 = pxVar.getY() + pxVar.getMeasuredHeight() + 1.0f;
            if (view == lxVar) {
                y3 = Math.max(y3, oxVar.getY() + oxVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * d00Var.f25063a.f16088e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d00 d00Var = this.f27660b;
        d00Var.K0 = true;
        d00Var.Y();
        gg.f1 f1Var = d00Var.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d00 d00Var = this.f27660b;
        d00Var.K0 = false;
        d00Var.Y();
        gg.f1 f1Var = d00Var.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
