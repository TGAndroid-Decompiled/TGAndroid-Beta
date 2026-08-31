package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class pr0 extends lh.x3 {
    public final zu0 R;

    public pr0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, zu0 zu0Var) {
        super(i10, j10, context, p2Var, g6Var);
        this.R = zu0Var;
    }

    @Override
    public final void p(boolean z4) {
        float f10;
        float f11;
        zu0 zu0Var = this.R;
        TextView textView = zu0Var.f33991n0;
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
        zu0Var.q1(true);
    }
}
