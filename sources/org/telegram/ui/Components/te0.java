package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class te0 extends AnimatorListenerAdapter {
    public final int f30871a;
    public final ci.j9 f30872b;

    public te0(ci.j9 j9Var, int i10) {
        this.f30871a = i10;
        this.f30872b = j9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30871a) {
            case 0:
                ci.j9 j9Var = this.f30872b;
                AnimatorSet animatorSet = (AnimatorSet) j9Var.f5287e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    j9Var.f5287e = null;
                    return;
                }
                return;
            case 1:
                ci.j9 j9Var2 = this.f30872b;
                AnimatorSet animatorSet2 = (AnimatorSet) j9Var2.f5287e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j9Var2.f5287e = null;
                    return;
                }
                return;
            default:
                ci.j9 j9Var3 = this.f30872b;
                AnimatorSet animatorSet3 = (AnimatorSet) j9Var3.f5287e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    j9Var3.f5287e = null;
                    return;
                }
                return;
        }
    }
}
