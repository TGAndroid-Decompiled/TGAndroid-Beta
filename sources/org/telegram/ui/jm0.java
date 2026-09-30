package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jm0 extends AnimatorListenerAdapter {
    public final int f34925a;
    public final boolean f34926b;
    public final fn0 f34927c;

    public jm0(fn0 fn0Var, boolean z10, int i10) {
        this.f34925a = i10;
        this.f34927c = fn0Var;
        this.f34926b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f34925a) {
            case 0:
                fn0 fn0Var = this.f34927c;
                AnimatorSet animatorSet = fn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fn0Var.M = null;
                    return;
                }
                return;
            default:
                fn0 fn0Var2 = this.f34927c;
                AnimatorSet animatorSet2 = fn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34925a) {
            case 0:
                fn0 fn0Var = this.f34927c;
                AnimatorSet animatorSet = fn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f34926b) {
                        fn0Var.N.setVisibility(4);
                        return;
                    } else {
                        fn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                fn0 fn0Var2 = this.f34927c;
                AnimatorSet animatorSet2 = fn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f34926b) {
                        fn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        fn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
