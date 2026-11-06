package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class al0 extends AnimatorListenerAdapter {
    public final int f43673a;
    public final boolean f43674b;
    public final hl0 f43675c;

    public al0(hl0 hl0Var, boolean z9, int i7) {
        this.f43673a = i7;
        this.f43675c = hl0Var;
        this.f43674b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f43673a) {
            case 0:
                hl0 hl0Var = this.f43675c;
                AnimatorSet animatorSet = hl0Var.f46422w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hl0Var.f46422w = null;
                    return;
                }
                return;
            default:
                hl0 hl0Var2 = this.f43675c;
                AnimatorSet animatorSet2 = hl0Var2.f46422w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    hl0Var2.f46422w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43673a) {
            case 0:
                hl0 hl0Var = this.f43675c;
                AnimatorSet animatorSet = hl0Var.f46422w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f43674b) {
                        hl0Var.f46415r.setVisibility(4);
                        return;
                    } else {
                        hl0Var.f46410n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                hl0 hl0Var2 = this.f43675c;
                AnimatorSet animatorSet2 = hl0Var2.f46422w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f43674b) {
                        hl0Var2.f46417s.setVisibility(4);
                        return;
                    } else {
                        hl0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
