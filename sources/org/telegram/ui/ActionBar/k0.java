package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f21086a;
    public final u0 f21087b;

    public k0(u0 u0Var, int i10) {
        this.f21086a = i10;
        this.f21087b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21086a) {
            case 0:
                u0 u0Var = this.f21087b;
                u0Var.f21332s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f21087b.v = null;
                return;
        }
    }
}
