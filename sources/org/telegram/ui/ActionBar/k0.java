package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f19581a;
    public final u0 f19582b;

    public k0(u0 u0Var, int i10) {
        this.f19581a = i10;
        this.f19582b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19581a) {
            case 0:
                u0 u0Var = this.f19582b;
                u0Var.f19811s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f19582b.v = null;
                return;
        }
    }
}
