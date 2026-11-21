package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class gq0 extends bi.t6 {
    public final jt0 W;

    public gq0(jt0 jt0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, dh.c cVar) {
        super(g2Var, context, i7, j3, h6Var, cVar);
        this.W = jt0Var;
    }

    @Override
    public final void q(boolean z10) {
        float f10;
        float f11;
        jt0 jt0Var = this.W;
        TextView textView = jt0Var.f36675t0;
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
        scaleX.scaleY(f12).withEndAction(new rp0(1, this, z10)).start();
        jt0Var.I1(true);
        jt0Var.W0();
    }
}
