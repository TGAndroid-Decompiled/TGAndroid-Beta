package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class xs0 extends xh.r2 {
    public final hw0 U;

    public xs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, hw0 hw0Var) {
        super(i10, j3, context, m2Var, c6Var);
        this.U = hw0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f7;
        float f10;
        hw0 hw0Var = this.U;
        TextView textView = hw0Var.f26959q0;
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
        scaleX.scaleY(f11).withEndAction(new js0(1, this, z10)).start();
        hw0Var.q1(true);
    }
}
