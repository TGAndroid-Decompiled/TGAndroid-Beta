package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class vp0 extends ai.u4 {
    public final ws0 W;

    public vp0(ws0 ws0Var, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, eh.c cVar) {
        super(d2Var, context, i3, j10, e6Var, cVar);
        this.W = ws0Var;
    }

    @Override
    public final void q(boolean z10) {
        float f10;
        float f11;
        ws0 ws0Var = this.W;
        TextView textView = ws0Var.f40128t0;
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
        scaleX.scaleY(f12).withEndAction(new up0(0, this, z10)).start();
        ws0Var.G1(true);
    }
}
