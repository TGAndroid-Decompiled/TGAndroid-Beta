package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jd0 extends AnimatorListenerAdapter {
    public final int f29644a;
    public final nh.l8 f29645b;

    public jd0(nh.l8 l8Var, int i10) {
        this.f29644a = i10;
        this.f29645b = l8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29644a) {
            case 0:
                nh.l8 l8Var = this.f29645b;
                AnimatorSet animatorSet = (AnimatorSet) l8Var.f18050e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l8Var.f18050e = null;
                    return;
                }
                return;
            case 1:
                nh.l8 l8Var2 = this.f29645b;
                AnimatorSet animatorSet2 = (AnimatorSet) l8Var2.f18050e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    l8Var2.f18050e = null;
                    return;
                }
                return;
            default:
                nh.l8 l8Var3 = this.f29645b;
                AnimatorSet animatorSet3 = (AnimatorSet) l8Var3.f18050e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    l8Var3.f18050e = null;
                    return;
                }
                return;
        }
    }
}
