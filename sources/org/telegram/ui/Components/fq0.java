package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class fq0 extends bi.v6 {
    public final it0 W;

    public fq0(it0 it0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, dh.c cVar) {
        super(g2Var, context, i7, j3, i6Var, cVar);
        this.W = it0Var;
    }

    @Override
    public final void q(boolean z10) {
        float f10;
        float f11;
        it0 it0Var = this.W;
        TextView textView = it0Var.f36152t0;
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
        scaleX.scaleY(f12).withEndAction(new qp0(1, this, z10)).start();
        it0Var.I1(true);
        it0Var.W0();
    }
}
