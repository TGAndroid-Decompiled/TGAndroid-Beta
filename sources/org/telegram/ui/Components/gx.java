package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gx extends FrameLayout {
    public final boolean f26889a;
    public final a00 f26890b;

    public gx(a00 a00Var, Context context, boolean z10) {
        super(context);
        this.f26890b = a00Var;
        this.f26889a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        a00 a00Var = this.f26890b;
        mx mxVar = a00Var.B0;
        ix ixVar = a00Var.D0;
        lx lxVar = a00Var.G0;
        if (!this.f26889a && (view == ixVar || view == lxVar)) {
            canvas.save();
            float y3 = mxVar.getY() + mxVar.getMeasuredHeight() + 1.0f;
            if (view == ixVar) {
                y3 = Math.max(y3, lxVar.getY() + lxVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * a00Var.f24392a.f16337e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a00 a00Var = this.f26890b;
        a00Var.K0 = true;
        a00Var.Y();
        gg.f1 f1Var = a00Var.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a00 a00Var = this.f26890b;
        a00Var.K0 = false;
        a00Var.Y();
        gg.f1 f1Var = a00Var.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
