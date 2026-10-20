package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f21522a;
    public final u0 f21523b;

    public k0(u0 u0Var, int i10) {
        this.f21522a = i10;
        this.f21523b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21522a) {
            case 0:
                u0 u0Var = this.f21523b;
                u0Var.f21753s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f21523b.v = null;
                return;
        }
    }
}
