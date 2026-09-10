package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class no0 extends AnimatorListenerAdapter {
    public final int f35315a;
    public final boolean f35316b;
    public final wo0 f35317c;

    public no0(wo0 wo0Var, boolean z10, int i10) {
        this.f35315a = i10;
        this.f35317c = wo0Var;
        this.f35316b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f35315a) {
            case 0:
                wo0 wo0Var = this.f35317c;
                AnimatorSet animatorSet = wo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wo0Var.v = null;
                    return;
                }
                return;
            default:
                wo0 wo0Var2 = this.f35317c;
                AnimatorSet animatorSet2 = wo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35315a) {
            case 0:
                wo0 wo0Var = this.f35317c;
                AnimatorSet animatorSet = wo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f35316b) {
                        wo0Var.f38281r.setVisibility(4);
                        return;
                    } else {
                        wo0Var.f38276n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                wo0 wo0Var2 = this.f35317c;
                AnimatorSet animatorSet2 = wo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f35316b) {
                        wo0Var2.f38283s.setVisibility(4);
                        return;
                    } else {
                        wo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
