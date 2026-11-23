package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class lj0 extends AnimatorListenerAdapter {
    public final int f49771a;
    public final boolean f49772b;
    public final fk0 f49773c;

    public lj0(fk0 fk0Var, boolean z10, int i7) {
        this.f49771a = i7;
        this.f49773c = fk0Var;
        this.f49772b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f49771a) {
            case 0:
                fk0 fk0Var = this.f49773c;
                AnimatorSet animatorSet = fk0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fk0Var.N = null;
                    return;
                }
                return;
            default:
                fk0 fk0Var2 = this.f49773c;
                AnimatorSet animatorSet2 = fk0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fk0Var2.N = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49771a) {
            case 0:
                fk0 fk0Var = this.f49773c;
                AnimatorSet animatorSet = fk0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f49772b) {
                        fk0Var.O.setVisibility(4);
                        return;
                    } else {
                        fk0Var.M.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                fk0 fk0Var2 = this.f49773c;
                AnimatorSet animatorSet2 = fk0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f49772b) {
                        fk0Var2.Q.setVisibility(4);
                        return;
                    } else {
                        fk0Var2.P.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
