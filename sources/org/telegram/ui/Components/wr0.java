package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class wr0 extends wh.q2 {
    public final iv0 U;

    public wr0(int i10, long j3, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, iv0 iv0Var) {
        super(i10, j3, context, p2Var, f6Var);
        this.U = iv0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f7;
        float f10;
        iv0 iv0Var = this.U;
        TextView textView = iv0Var.f24118q0;
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
        scaleX.scaleY(f11).withEndAction(new ai.j(29, this, z10)).start();
        iv0Var.q1(true);
    }
}
