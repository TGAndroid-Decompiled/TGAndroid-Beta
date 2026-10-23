package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f3 extends AnimatorListenerAdapter {
    public final int f31600a;
    public final h3 f31601b;

    public f3(h3 h3Var, int i10) {
        this.f31600a = i10;
        this.f31601b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31600a) {
            case 0:
                h3 h3Var = this.f31601b;
                h3Var.f31644r = 0;
                h3Var.invalidate();
                return;
            default:
                h3 h3Var2 = this.f31601b;
                h3Var2.f31645s = 0;
                h3Var2.invalidate();
                return;
        }
    }
}
