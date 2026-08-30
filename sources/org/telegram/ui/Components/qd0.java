package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class qd0 extends AnimatorListenerAdapter {
    public final int f28116a;
    public final rd0 f28117b;

    public qd0(rd0 rd0Var, int i10) {
        this.f28116a = i10;
        this.f28117b = rd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28116a) {
            case 0:
                rd0 rd0Var = this.f28117b;
                AnimatorSet animatorSet = (AnimatorSet) rd0Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    rd0Var.e = null;
                    return;
                }
                return;
            case 1:
                rd0 rd0Var2 = this.f28117b;
                AnimatorSet animatorSet2 = (AnimatorSet) rd0Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    rd0Var2.e = null;
                    return;
                }
                return;
            default:
                rd0 rd0Var3 = this.f28117b;
                AnimatorSet animatorSet3 = (AnimatorSet) rd0Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    rd0Var3.e = null;
                    return;
                }
                return;
        }
    }
}
