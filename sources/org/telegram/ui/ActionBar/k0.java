package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f19565a;
    public final u0 f19566b;

    public k0(u0 u0Var, int i10) {
        this.f19565a = i10;
        this.f19566b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19565a) {
            case 0:
                u0 u0Var = this.f19566b;
                u0Var.f19795s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f19566b.v = null;
                return;
        }
    }
}
