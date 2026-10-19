package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lf0 extends AnimatorListenerAdapter {
    public final int f28210a;
    public final nf0 f28211b;

    public lf0(nf0 nf0Var, int i10) {
        this.f28210a = i10;
        this.f28211b = nf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28210a) {
            case 0:
                this.f28211b.f28770s = null;
                return;
            default:
                this.f28211b.v = null;
                return;
        }
    }
}
