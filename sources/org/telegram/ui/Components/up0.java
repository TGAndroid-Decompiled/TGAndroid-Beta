package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class up0 extends zh.d2 {
    public final ys0 V;

    public up0(ys0 ys0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, dh.c cVar) {
        super(f2Var, context, i7, j3, h6Var, cVar);
        this.V = ys0Var;
    }

    @Override
    public final void q(boolean z9) {
        float f10;
        float f11;
        ys0 ys0Var = this.V;
        TextView textView = ys0Var.f40706s0;
        textView.setVisibility(0);
        ViewPropertyAnimator animate = textView.animate();
        float f12 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z9) {
            f12 = 0.4f;
        }
        scaleX.scaleY(f12).withEndAction(new tp0(0, this, z9)).start();
        ys0Var.I1(true);
        ys0Var.W0();
    }
}
