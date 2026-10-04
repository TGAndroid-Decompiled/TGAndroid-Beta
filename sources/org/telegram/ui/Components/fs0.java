package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class fs0 extends xh.s2 {
    public final pv0 U;

    public fs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, pv0 pv0Var) {
        super(i10, j3, context, n2Var, d6Var);
        this.U = pv0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f7;
        float f10;
        pv0 pv0Var = this.U;
        TextView textView = pv0Var.f29787q0;
        textView.setVisibility(0);
        ViewPropertyAnimator animate = textView.animate();
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.4f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f11 = 0.4f;
        }
        scaleX.scaleY(f11).withEndAction(new es0(0, this, z10)).start();
        pv0Var.q1(true);
    }
}
