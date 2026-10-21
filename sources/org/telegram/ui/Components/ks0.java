package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class ks0 extends yh.p2 {
    public final uv0 U;

    public ks0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, uv0 uv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.U = uv0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f7;
        float f10;
        uv0 uv0Var = this.U;
        TextView textView = uv0Var.f31058q0;
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
        scaleX.scaleY(f11).withEndAction(new b60(4, this, z10)).start();
        uv0Var.s1(true);
    }
}
