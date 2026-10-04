package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f31908a;
    public final k3 f31909b;

    public i3(k3 k3Var, int i10) {
        this.f31908a = i10;
        this.f31909b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31908a) {
            case 0:
                k3 k3Var = this.f31909b;
                k3Var.f31951r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f31909b;
                k3Var2.f31952s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
