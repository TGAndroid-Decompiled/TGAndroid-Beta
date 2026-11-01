package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ok0 extends AnimatorListenerAdapter {
    public final int f40184a;
    public final boolean f40185b;
    public final jl0 f40186c;

    public ok0(jl0 jl0Var, boolean z10, int i10) {
        this.f40184a = i10;
        this.f40186c = jl0Var;
        this.f40185b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f40184a) {
            case 0:
                jl0 jl0Var = this.f40186c;
                AnimatorSet animatorSet = jl0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jl0Var.M = null;
                    return;
                }
                return;
            default:
                jl0 jl0Var2 = this.f40186c;
                AnimatorSet animatorSet2 = jl0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jl0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40184a) {
            case 0:
                jl0 jl0Var = this.f40186c;
                AnimatorSet animatorSet = jl0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40185b) {
                        jl0Var.N.setVisibility(4);
                        return;
                    } else {
                        jl0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                jl0 jl0Var2 = this.f40186c;
                AnimatorSet animatorSet2 = jl0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f40185b) {
                        jl0Var2.P.setVisibility(4);
                        return;
                    } else {
                        jl0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
