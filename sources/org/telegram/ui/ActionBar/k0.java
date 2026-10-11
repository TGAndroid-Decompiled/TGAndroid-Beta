package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f21311a;
    public final u0 f21312b;

    public k0(u0 u0Var, int i10) {
        this.f21311a = i10;
        this.f21312b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21311a) {
            case 0:
                u0 u0Var = this.f21312b;
                u0Var.f21557s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f21312b.v = null;
                return;
        }
    }
}
