package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final int f19575a;
    public final v0 f19576b;

    public l0(v0 v0Var, int i10) {
        this.f19575a = i10;
        this.f19576b = v0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19575a) {
            case 0:
                v0 v0Var = this.f19576b;
                v0Var.f19818s.setVisibility(4);
                v0Var.v = null;
                return;
            default:
                this.f19576b.v = null;
                return;
        }
    }
}
