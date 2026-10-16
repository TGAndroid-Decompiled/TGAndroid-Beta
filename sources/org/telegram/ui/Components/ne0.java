package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ne0 extends AnimatorListenerAdapter {
    public final int f27345a;
    public final di.i9 f27346b;

    public ne0(di.i9 i9Var, int i10) {
        this.f27345a = i10;
        this.f27346b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27345a) {
            case 0:
                di.i9 i9Var = this.f27346b;
                AnimatorSet animatorSet = (AnimatorSet) i9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    i9Var.e = null;
                    return;
                }
                return;
            case 1:
                di.i9 i9Var2 = this.f27346b;
                AnimatorSet animatorSet2 = (AnimatorSet) i9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    i9Var2.e = null;
                    return;
                }
                return;
            default:
                di.i9 i9Var3 = this.f27346b;
                AnimatorSet animatorSet3 = (AnimatorSet) i9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    i9Var3.e = null;
                    return;
                }
                return;
        }
    }
}
