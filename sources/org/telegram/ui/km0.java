package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class km0 extends AnimatorListenerAdapter {
    public final int f35072a;
    public final boolean f35073b;
    public final gn0 f35074c;

    public km0(gn0 gn0Var, boolean z10, int i10) {
        this.f35072a = i10;
        this.f35074c = gn0Var;
        this.f35073b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f35072a) {
            case 0:
                gn0 gn0Var = this.f35074c;
                AnimatorSet animatorSet = gn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    gn0Var.M = null;
                    return;
                }
                return;
            default:
                gn0 gn0Var2 = this.f35074c;
                AnimatorSet animatorSet2 = gn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    gn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35072a) {
            case 0:
                gn0 gn0Var = this.f35074c;
                AnimatorSet animatorSet = gn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f35073b) {
                        gn0Var.N.setVisibility(4);
                        return;
                    } else {
                        gn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                gn0 gn0Var2 = this.f35074c;
                AnimatorSet animatorSet2 = gn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f35073b) {
                        gn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        gn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
