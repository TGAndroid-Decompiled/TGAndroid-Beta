package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f33967a;
    public final k3 f33968b;

    public i3(k3 k3Var, int i10) {
        this.f33967a = i10;
        this.f33968b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33967a) {
            case 0:
                k3 k3Var = this.f33968b;
                k3Var.f33997r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f33968b;
                k3Var2.f33998s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
