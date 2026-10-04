package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final int f21352a;
    public final v0 f21353b;

    public l0(v0 v0Var, int i10) {
        this.f21352a = i10;
        this.f21353b = v0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21352a) {
            case 0:
                v0 v0Var = this.f21353b;
                v0Var.f21597s.setVisibility(4);
                v0Var.v = null;
                return;
            default:
                this.f21353b.v = null;
                return;
        }
    }
}
