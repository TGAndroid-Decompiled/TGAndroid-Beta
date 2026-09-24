package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class yd0 extends AnimatorListenerAdapter {
    public final int f30583a;
    public final ci.j9 f30584b;

    public yd0(ci.j9 j9Var, int i10) {
        this.f30583a = i10;
        this.f30584b = j9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30583a) {
            case 0:
                ci.j9 j9Var = this.f30584b;
                AnimatorSet animatorSet = (AnimatorSet) j9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    j9Var.e = null;
                    return;
                }
                return;
            case 1:
                ci.j9 j9Var2 = this.f30584b;
                AnimatorSet animatorSet2 = (AnimatorSet) j9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j9Var2.e = null;
                    return;
                }
                return;
            default:
                ci.j9 j9Var3 = this.f30584b;
                AnimatorSet animatorSet3 = (AnimatorSet) j9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    j9Var3.e = null;
                    return;
                }
                return;
        }
    }
}
