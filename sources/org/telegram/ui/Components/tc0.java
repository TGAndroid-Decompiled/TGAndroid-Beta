package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class tc0 extends AnimatorListenerAdapter {
    public final int f30624a;
    public final uc0 f30625b;

    public tc0(uc0 uc0Var, int i10) {
        this.f30624a = i10;
        this.f30625b = uc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30624a) {
            case 0:
                uc0 uc0Var = this.f30625b;
                AnimatorSet animatorSet = (AnimatorSet) uc0Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    uc0Var.e = null;
                    return;
                }
                return;
            case 1:
                uc0 uc0Var2 = this.f30625b;
                AnimatorSet animatorSet2 = (AnimatorSet) uc0Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    uc0Var2.e = null;
                    return;
                }
                return;
            default:
                uc0 uc0Var3 = this.f30625b;
                AnimatorSet animatorSet3 = (AnimatorSet) uc0Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    uc0Var3.e = null;
                    return;
                }
                return;
        }
    }
}
