package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class rs0 extends xh.s2 {
    public final bw0 U;

    public rs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, bw0 bw0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.U = bw0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f7;
        float f10;
        bw0 bw0Var = this.U;
        TextView textView = bw0Var.f25153q0;
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
        scaleX.scaleY(f11).withEndAction(new ds0(1, this, z10)).start();
        bw0Var.q1(true);
    }
}
