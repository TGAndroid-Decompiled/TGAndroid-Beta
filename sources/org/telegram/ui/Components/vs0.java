package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class vs0 extends zh.r2 {
    public final aw0 W;

    public vs0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, aw0 aw0Var) {
        super(i10, j10, context, r2Var, u6Var);
        this.W = aw0Var;
    }

    @Override
    public final void q(boolean z10) {
        float f7;
        float f10;
        aw0 aw0Var = this.W;
        TextView textView = aw0Var.f26689s0;
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
        aw0Var.C1(true);
    }
}
