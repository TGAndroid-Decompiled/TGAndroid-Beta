package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class pe0 extends AnimatorListenerAdapter {
    public final int f29861a;
    public final ci.j9 f29862b;

    public pe0(ci.j9 j9Var, int i10) {
        this.f29861a = i10;
        this.f29862b = j9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29861a) {
            case 0:
                ci.j9 j9Var = this.f29862b;
                AnimatorSet animatorSet = (AnimatorSet) j9Var.f5288e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    j9Var.f5288e = null;
                    return;
                }
                return;
            case 1:
                ci.j9 j9Var2 = this.f29862b;
                AnimatorSet animatorSet2 = (AnimatorSet) j9Var2.f5288e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j9Var2.f5288e = null;
                    return;
                }
                return;
            default:
                ci.j9 j9Var3 = this.f29862b;
                AnimatorSet animatorSet3 = (AnimatorSet) j9Var3.f5288e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    j9Var3.f5288e = null;
                    return;
                }
                return;
        }
    }
}
