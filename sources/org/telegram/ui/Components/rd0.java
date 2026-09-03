package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class rd0 extends AnimatorListenerAdapter {
    public final int f28461a;
    public final sd0 f28462b;

    public rd0(sd0 sd0Var, int i10) {
        this.f28461a = i10;
        this.f28462b = sd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28461a) {
            case 0:
                sd0 sd0Var = this.f28462b;
                AnimatorSet animatorSet = (AnimatorSet) sd0Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sd0Var.e = null;
                    return;
                }
                return;
            case 1:
                sd0 sd0Var2 = this.f28462b;
                AnimatorSet animatorSet2 = (AnimatorSet) sd0Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sd0Var2.e = null;
                    return;
                }
                return;
            default:
                sd0 sd0Var3 = this.f28462b;
                AnimatorSet animatorSet3 = (AnimatorSet) sd0Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    sd0Var3.e = null;
                    return;
                }
                return;
        }
    }
}
