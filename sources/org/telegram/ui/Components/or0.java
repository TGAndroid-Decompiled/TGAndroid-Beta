package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class or0 extends lh.x3 {
    public final yu0 R;

    public or0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, yu0 yu0Var) {
        super(i10, j10, context, p2Var, g6Var);
        this.R = yu0Var;
    }

    @Override
    public final void p(boolean z4) {
        float f10;
        float f11;
        yu0 yu0Var = this.R;
        TextView textView = yu0Var.f33636n0;
        textView.setVisibility(0);
        ViewPropertyAnimator animate = textView.animate();
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.4f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z4) {
            f12 = 0.4f;
        }
        scaleX.scaleY(f12).withEndAction(new kh.f(27, this, z4)).start();
        yu0Var.q1(true);
    }
}
