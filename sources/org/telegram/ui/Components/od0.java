package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class od0 extends AnimatorListenerAdapter {
    public final int f29037a;
    public final di.l9 f29038b;

    public od0(di.l9 l9Var, int i10) {
        this.f29037a = i10;
        this.f29038b = l9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29037a) {
            case 0:
                di.l9 l9Var = this.f29038b;
                AnimatorSet animatorSet = (AnimatorSet) l9Var.f7575e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l9Var.f7575e = null;
                    return;
                }
                return;
            case 1:
                di.l9 l9Var2 = this.f29038b;
                AnimatorSet animatorSet2 = (AnimatorSet) l9Var2.f7575e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    l9Var2.f7575e = null;
                    return;
                }
                return;
            default:
                di.l9 l9Var3 = this.f29038b;
                AnimatorSet animatorSet3 = (AnimatorSet) l9Var3.f7575e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    l9Var3.f7575e = null;
                    return;
                }
                return;
        }
    }
}
