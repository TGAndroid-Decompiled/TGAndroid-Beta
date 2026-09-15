package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final int f19366a;
    public final v0 f19367b;

    public l0(v0 v0Var, int i10) {
        this.f19366a = i10;
        this.f19367b = v0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19366a) {
            case 0:
                v0 v0Var = this.f19367b;
                v0Var.f19599s.setVisibility(4);
                v0Var.v = null;
                return;
            default:
                this.f19367b.v = null;
                return;
        }
    }
}
