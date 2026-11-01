package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class wq0 extends ph.j2 {
    public final au0 V;

    public wq0(au0 au0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(k2Var, context, i10, j10, p6Var, bVar);
        this.V = au0Var;
    }

    @Override
    public final void q(boolean z10) {
        float f7;
        float f10;
        au0 au0Var = this.V;
        TextView textView = au0Var.f24555s0;
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
        scaleX.scaleY(f11).withEndAction(new k2.v(20, this, z10)).start();
        au0Var.E1(true);
    }
}
