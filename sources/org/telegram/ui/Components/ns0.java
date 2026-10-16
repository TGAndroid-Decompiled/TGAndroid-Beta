package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class ns0 extends yh.q2 {
    public final xv0 U;

    public ns0(int i10, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, xv0 xv0Var) {
        super(i10, j10, context, m2Var, c6Var);
        this.U = xv0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f7;
        float f10;
        xv0 xv0Var = this.U;
        TextView textView = xv0Var.f31056q0;
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
        scaleX.scaleY(f11).withEndAction(new zr0(1, this, z10)).start();
        xv0Var.r1(true);
    }
}
