package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class od0 extends AnimatorListenerAdapter {
    public final int f26768a;
    public final ci.m9 f26769b;

    public od0(ci.m9 m9Var, int i10) {
        this.f26768a = i10;
        this.f26769b = m9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26768a) {
            case 0:
                ci.m9 m9Var = this.f26769b;
                AnimatorSet animatorSet = (AnimatorSet) m9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m9Var.e = null;
                    return;
                }
                return;
            case 1:
                ci.m9 m9Var2 = this.f26769b;
                AnimatorSet animatorSet2 = (AnimatorSet) m9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    m9Var2.e = null;
                    return;
                }
                return;
            default:
                ci.m9 m9Var3 = this.f26769b;
                AnimatorSet animatorSet3 = (AnimatorSet) m9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m9Var3.e = null;
                    return;
                }
                return;
        }
    }
}
