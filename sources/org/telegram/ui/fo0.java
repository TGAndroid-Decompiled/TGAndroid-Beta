package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class fo0 extends AnimatorListenerAdapter {
    public final int f33707a;
    public final boolean f33708b;
    public final oo0 f33709c;

    public fo0(oo0 oo0Var, boolean z10, int i10) {
        this.f33707a = i10;
        this.f33709c = oo0Var;
        this.f33708b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f33707a) {
            case 0:
                oo0 oo0Var = this.f33709c;
                AnimatorSet animatorSet = oo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oo0Var.v = null;
                    return;
                }
                return;
            default:
                oo0 oo0Var2 = this.f33709c;
                AnimatorSet animatorSet2 = oo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    oo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33707a) {
            case 0:
                oo0 oo0Var = this.f33709c;
                AnimatorSet animatorSet = oo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f33708b) {
                        oo0Var.f36305r.setVisibility(4);
                        return;
                    } else {
                        oo0Var.f36300n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                oo0 oo0Var2 = this.f33709c;
                AnimatorSet animatorSet2 = oo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f33708b) {
                        oo0Var2.f36307s.setVisibility(4);
                        return;
                    } else {
                        oo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
