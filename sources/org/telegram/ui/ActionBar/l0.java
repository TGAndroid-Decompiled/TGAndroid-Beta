package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final int f21167a;
    public final v0 f21168b;

    public l0(v0 v0Var, int i10) {
        this.f21167a = i10;
        this.f21168b = v0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21167a) {
            case 0:
                v0 v0Var = this.f21168b;
                v0Var.f21427s.setVisibility(4);
                v0Var.v = null;
                return;
            default:
                this.f21168b.v = null;
                return;
        }
    }
}
