package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class pe0 extends AnimatorListenerAdapter {
    public final int f29858a;
    public final ci.j9 f29859b;

    public pe0(ci.j9 j9Var, int i10) {
        this.f29858a = i10;
        this.f29859b = j9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29858a) {
            case 0:
                ci.j9 j9Var = this.f29859b;
                AnimatorSet animatorSet = (AnimatorSet) j9Var.f5289e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    j9Var.f5289e = null;
                    return;
                }
                return;
            case 1:
                ci.j9 j9Var2 = this.f29859b;
                AnimatorSet animatorSet2 = (AnimatorSet) j9Var2.f5289e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j9Var2.f5289e = null;
                    return;
                }
                return;
            default:
                ci.j9 j9Var3 = this.f29859b;
                AnimatorSet animatorSet3 = (AnimatorSet) j9Var3.f5289e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    j9Var3.f5289e = null;
                    return;
                }
                return;
        }
    }
}
