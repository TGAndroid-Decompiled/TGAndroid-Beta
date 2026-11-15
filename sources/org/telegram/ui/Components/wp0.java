package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class wp0 extends bi.i4 {
    public final ys0 W;

    public wp0(ys0 ys0Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, dh.c cVar) {
        super(e2Var, context, i7, j3, e6Var, cVar);
        this.W = ys0Var;
    }

    @Override
    public final void q(boolean z10) {
        float f10;
        float f11;
        ys0 ys0Var = this.W;
        TextView textView = ys0Var.f42136t0;
        textView.setVisibility(0);
        ViewPropertyAnimator animate = textView.animate();
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z10) {
            f12 = 0.4f;
        }
        scaleX.scaleY(f12).withEndAction(new fp0(1, this, z10)).start();
        ys0Var.I1(true);
        ys0Var.W0();
    }
}
