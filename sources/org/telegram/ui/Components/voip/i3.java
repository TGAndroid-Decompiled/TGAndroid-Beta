package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f31721a;
    public final k3 f31722b;

    public i3(k3 k3Var, int i10) {
        this.f31721a = i10;
        this.f31722b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31721a) {
            case 0:
                k3 k3Var = this.f31722b;
                k3Var.f31762r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f31722b;
                k3Var2.f31763s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
