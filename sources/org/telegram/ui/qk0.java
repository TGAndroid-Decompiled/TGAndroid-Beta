package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class qk0 extends AnimatorListenerAdapter {
    public final int f40998a;
    public final boolean f40999b;
    public final ll0 f41000c;

    public qk0(ll0 ll0Var, boolean z10, int i10) {
        this.f40998a = i10;
        this.f41000c = ll0Var;
        this.f40999b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f40998a) {
            case 0:
                ll0 ll0Var = this.f41000c;
                AnimatorSet animatorSet = ll0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ll0Var.M = null;
                    return;
                }
                return;
            default:
                ll0 ll0Var2 = this.f41000c;
                AnimatorSet animatorSet2 = ll0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ll0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40998a) {
            case 0:
                ll0 ll0Var = this.f41000c;
                AnimatorSet animatorSet = ll0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40999b) {
                        ll0Var.N.setVisibility(4);
                        return;
                    } else {
                        ll0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ll0 ll0Var2 = this.f41000c;
                AnimatorSet animatorSet2 = ll0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f40999b) {
                        ll0Var2.P.setVisibility(4);
                        return;
                    } else {
                        ll0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
