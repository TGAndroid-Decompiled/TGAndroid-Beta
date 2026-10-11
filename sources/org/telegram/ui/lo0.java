package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class lo0 extends AnimatorListenerAdapter {
    public final int f39707a;
    public final boolean f39708b;
    public final uo0 f39709c;

    public lo0(uo0 uo0Var, boolean z10, int i10) {
        this.f39707a = i10;
        this.f39709c = uo0Var;
        this.f39708b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39707a) {
            case 0:
                uo0 uo0Var = this.f39709c;
                AnimatorSet animatorSet = uo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    uo0Var.v = null;
                    return;
                }
                return;
            default:
                uo0 uo0Var2 = this.f39709c;
                AnimatorSet animatorSet2 = uo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    uo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39707a) {
            case 0:
                uo0 uo0Var = this.f39709c;
                AnimatorSet animatorSet = uo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39708b) {
                        uo0Var.f42720r.setVisibility(4);
                        return;
                    } else {
                        uo0Var.f42715n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                uo0 uo0Var2 = this.f39709c;
                AnimatorSet animatorSet2 = uo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39708b) {
                        uo0Var2.f42722s.setVisibility(4);
                        return;
                    } else {
                        uo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
