package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i3 extends AnimatorListenerAdapter {
    public final int f29399a;
    public final k3 f29400b;

    public i3(k3 k3Var, int i10) {
        this.f29399a = i10;
        this.f29400b = k3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29399a) {
            case 0:
                k3 k3Var = this.f29400b;
                k3Var.f29439r = 0;
                k3Var.invalidate();
                return;
            default:
                k3 k3Var2 = this.f29400b;
                k3Var2.f29440s = 0;
                k3Var2.invalidate();
                return;
        }
    }
}
