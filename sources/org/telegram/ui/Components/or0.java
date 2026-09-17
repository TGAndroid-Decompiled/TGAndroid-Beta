package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class or0 extends xh.r2 {
    public final zu0 U;

    public or0(int i10, long j3, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var, zu0 zu0Var) {
        super(i10, j3, context, o2Var, f6Var);
        this.U = zu0Var;
    }

    @Override
    public final void p(boolean z10) {
        float f7;
        float f10;
        zu0 zu0Var = this.U;
        TextView textView = zu0Var.f30643q0;
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
        scaleX.scaleY(f11).withEndAction(new bi.f(29, this, z10)).start();
        zu0Var.q1(true);
    }
}
