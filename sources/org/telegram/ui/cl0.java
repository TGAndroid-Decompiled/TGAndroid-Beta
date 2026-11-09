package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class cl0 extends AnimatorListenerAdapter {
    public final int f44358a;
    public final boolean f44359b;
    public final jl0 f44360c;

    public cl0(jl0 jl0Var, boolean z9, int i7) {
        this.f44358a = i7;
        this.f44360c = jl0Var;
        this.f44359b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f44358a) {
            case 0:
                jl0 jl0Var = this.f44360c;
                AnimatorSet animatorSet = jl0Var.f47028w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jl0Var.f47028w = null;
                    return;
                }
                return;
            default:
                jl0 jl0Var2 = this.f44360c;
                AnimatorSet animatorSet2 = jl0Var2.f47028w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jl0Var2.f47028w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44358a) {
            case 0:
                jl0 jl0Var = this.f44360c;
                AnimatorSet animatorSet = jl0Var.f47028w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f44359b) {
                        jl0Var.f47021r.setVisibility(4);
                        return;
                    } else {
                        jl0Var.f47016n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                jl0 jl0Var2 = this.f44360c;
                AnimatorSet animatorSet2 = jl0Var2.f47028w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f44359b) {
                        jl0Var2.f47023s.setVisibility(4);
                        return;
                    } else {
                        jl0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
