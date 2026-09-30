package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f29316a;
    public final k3 f29317b;

    public i3(k3 k3Var, int i10) {
        this.f29316a = i10;
        this.f29317b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29316a) {
            case 0:
                k3 k3Var = this.f29317b;
                k3Var.f29356r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f29317b;
                k3Var2.f29357s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
