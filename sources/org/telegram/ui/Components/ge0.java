package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ge0 extends AnimatorListenerAdapter {
    public final int f28560a;
    public final fi.t8 f28561b;

    public ge0(fi.t8 t8Var, int i10) {
        this.f28560a = i10;
        this.f28561b = t8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28560a) {
            case 0:
                fi.t8 t8Var = this.f28561b;
                AnimatorSet animatorSet = (AnimatorSet) t8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t8Var.e = null;
                    return;
                }
                return;
            case 1:
                fi.t8 t8Var2 = this.f28561b;
                AnimatorSet animatorSet2 = (AnimatorSet) t8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t8Var2.e = null;
                    return;
                }
                return;
            default:
                fi.t8 t8Var3 = this.f28561b;
                AnimatorSet animatorSet3 = (AnimatorSet) t8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    t8Var3.e = null;
                    return;
                }
                return;
        }
    }
}
