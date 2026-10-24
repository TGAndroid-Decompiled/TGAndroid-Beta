package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f21095a;
    public final u0 f21096b;

    public k0(u0 u0Var, int i10) {
        this.f21095a = i10;
        this.f21096b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21095a) {
            case 0:
                u0 u0Var = this.f21096b;
                u0Var.f21896s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f21096b.v = null;
                return;
        }
    }
}
