package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class dm0 extends AnimatorListenerAdapter {
    public final int f36648a;
    public final boolean f36649b;
    public final zm0 f36650c;

    public dm0(zm0 zm0Var, boolean z10, int i10) {
        this.f36648a = i10;
        this.f36650c = zm0Var;
        this.f36649b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36648a) {
            case 0:
                zm0 zm0Var = this.f36650c;
                AnimatorSet animatorSet = zm0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    zm0Var.M = null;
                    return;
                }
                return;
            default:
                zm0 zm0Var2 = this.f36650c;
                AnimatorSet animatorSet2 = zm0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    zm0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36648a) {
            case 0:
                zm0 zm0Var = this.f36650c;
                AnimatorSet animatorSet = zm0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36649b) {
                        zm0Var.N.setVisibility(4);
                        return;
                    } else {
                        zm0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                zm0 zm0Var2 = this.f36650c;
                AnimatorSet animatorSet2 = zm0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36649b) {
                        zm0Var2.P.setVisibility(4);
                        return;
                    } else {
                        zm0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
