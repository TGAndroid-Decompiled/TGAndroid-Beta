package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class ws0 extends zh.r2 {
    public final bw0 W;

    public ws0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, bw0 bw0Var) {
        super(i10, j10, context, r2Var, u6Var);
        this.W = bw0Var;
    }

    @Override
    public final void q(boolean z10) {
        float f7;
        float f10;
        bw0 bw0Var = this.W;
        TextView textView = bw0Var.f26979s0;
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
        scaleX.scaleY(f11).withEndAction(new d60(4, this, z10)).start();
        bw0Var.C1(true);
    }
}
