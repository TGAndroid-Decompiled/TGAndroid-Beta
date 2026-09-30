package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f19596a;
    public final u0 f19597b;

    public k0(u0 u0Var, int i10) {
        this.f19596a = i10;
        this.f19597b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19596a) {
            case 0:
                u0 u0Var = this.f19597b;
                u0Var.f19826s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f19597b.v = null;
                return;
        }
    }
}
