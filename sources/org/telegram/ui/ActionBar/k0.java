package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f19579a;
    public final u0 f19580b;

    public k0(u0 u0Var, int i10) {
        this.f19579a = i10;
        this.f19580b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19579a) {
            case 0:
                u0 u0Var = this.f19580b;
                u0Var.f19809s.setVisibility(4);
                u0Var.v = null;
                return;
            default:
                this.f19580b.v = null;
                return;
        }
    }
}
