package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class gr0 extends ih.x3 {
    public final qu0 Q;

    public gr0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, qu0 qu0Var) {
        super(i10, j10, context, o2Var, c6Var);
        this.Q = qu0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f9;
        float f10;
        qu0 qu0Var = this.Q;
        TextView textView = qu0Var.m0;
        textView.setVisibility(0);
        ViewPropertyAnimator animate = textView.animate();
        float f11 = 1.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f9);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.4f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f11 = 0.4f;
        }
        scaleX.scaleY(f11).withEndAction(new p90(3, this, z10)).start();
        qu0Var.q1(true);
    }
}
