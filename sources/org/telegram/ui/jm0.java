package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jm0 extends AnimatorListenerAdapter {
    public final int f38185a;
    public final boolean f38186b;
    public final fn0 f38187c;

    public jm0(fn0 fn0Var, boolean z4, int i10) {
        this.f38185a = i10;
        this.f38187c = fn0Var;
        this.f38186b = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f38185a) {
            case 0:
                fn0 fn0Var = this.f38187c;
                AnimatorSet animatorSet = fn0Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fn0Var.J = null;
                    return;
                }
                return;
            default:
                fn0 fn0Var2 = this.f38187c;
                AnimatorSet animatorSet2 = fn0Var2.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fn0Var2.J = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38185a) {
            case 0:
                fn0 fn0Var = this.f38187c;
                AnimatorSet animatorSet = fn0Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f38186b) {
                        fn0Var.K.setVisibility(4);
                        return;
                    } else {
                        fn0Var.I.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                fn0 fn0Var2 = this.f38187c;
                AnimatorSet animatorSet2 = fn0Var2.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f38186b) {
                        fn0Var2.M.setVisibility(4);
                        return;
                    } else {
                        fn0Var2.L.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
