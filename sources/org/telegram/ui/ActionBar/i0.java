package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f20388a;
    public final t0 f20389b;

    public i0(t0 t0Var, int i10) {
        this.f20388a = i10;
        this.f20389b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20388a) {
            case 0:
                t0 t0Var = this.f20389b;
                t0Var.f20848s.setVisibility(4);
                t0Var.f20853w = null;
                return;
            default:
                this.f20389b.f20853w = null;
                return;
        }
    }
}
