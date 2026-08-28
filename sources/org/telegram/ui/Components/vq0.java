package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class vq0 extends fh.j4 {
    public final eu0 Q;

    public vq0(int i9, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, eu0 eu0Var) {
        super(i9, j10, context, o2Var, b6Var);
        this.Q = eu0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f10;
        float f11;
        eu0 eu0Var = this.Q;
        TextView textView = eu0Var.m0;
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
        scaleX.scaleY(f12).withEndAction(new a50(4, this, z10)).start();
        eu0Var.q1(true);
    }
}
