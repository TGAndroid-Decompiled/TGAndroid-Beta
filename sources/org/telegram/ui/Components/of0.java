package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f26730a;
    public final pf0 f26731b;

    public of0(pf0 pf0Var, int i10) {
        this.f26730a = i10;
        this.f26731b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26730a) {
            case 0:
                this.f26731b.f27020a.f27333n.setVisibility(8);
                return;
            default:
                this.f26731b.f27020a.h.setVisibility(8);
                return;
        }
    }
}
