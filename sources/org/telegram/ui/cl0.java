package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class cl0 extends AnimatorListenerAdapter {
    public final int f46185a;
    public final boolean f46186b;
    public final jl0 f46187c;

    public cl0(jl0 jl0Var, boolean z10, int i7) {
        this.f46185a = i7;
        this.f46187c = jl0Var;
        this.f46186b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f46185a) {
            case 0:
                jl0 jl0Var = this.f46187c;
                AnimatorSet animatorSet = jl0Var.f48418w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jl0Var.f48418w = null;
                    return;
                }
                return;
            default:
                jl0 jl0Var2 = this.f46187c;
                AnimatorSet animatorSet2 = jl0Var2.f48418w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jl0Var2.f48418w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46185a) {
            case 0:
                jl0 jl0Var = this.f46187c;
                AnimatorSet animatorSet = jl0Var.f48418w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f46186b) {
                        jl0Var.f48411r.setVisibility(4);
                        return;
                    } else {
                        jl0Var.f48406n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                jl0 jl0Var2 = this.f46187c;
                AnimatorSet animatorSet2 = jl0Var2.f48418w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f46186b) {
                        jl0Var2.f48413s.setVisibility(4);
                        return;
                    } else {
                        jl0Var2.V.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
