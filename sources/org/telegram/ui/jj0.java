package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jj0 extends AnimatorListenerAdapter {
    public final int f46980a;
    public final boolean f46981b;
    public final dk0 f46982c;

    public jj0(dk0 dk0Var, boolean z9, int i7) {
        this.f46980a = i7;
        this.f46982c = dk0Var;
        this.f46981b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f46980a) {
            case 0:
                dk0 dk0Var = this.f46982c;
                AnimatorSet animatorSet = dk0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dk0Var.M = null;
                    return;
                }
                return;
            default:
                dk0 dk0Var2 = this.f46982c;
                AnimatorSet animatorSet2 = dk0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dk0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46980a) {
            case 0:
                dk0 dk0Var = this.f46982c;
                AnimatorSet animatorSet = dk0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f46981b) {
                        dk0Var.N.setVisibility(4);
                        return;
                    } else {
                        dk0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                dk0 dk0Var2 = this.f46982c;
                AnimatorSet animatorSet2 = dk0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f46981b) {
                        dk0Var2.P.setVisibility(4);
                        return;
                    } else {
                        dk0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
