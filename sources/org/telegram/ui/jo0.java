package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jo0 extends AnimatorListenerAdapter {
    public final int f37744a;
    public final boolean f37745b;
    public final so0 f37746c;

    public jo0(so0 so0Var, boolean z10, int i10) {
        this.f37744a = i10;
        this.f37746c = so0Var;
        this.f37745b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37744a) {
            case 0:
                so0 so0Var = this.f37746c;
                AnimatorSet animatorSet = so0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    so0Var.v = null;
                    return;
                }
                return;
            default:
                so0 so0Var2 = this.f37746c;
                AnimatorSet animatorSet2 = so0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    so0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37744a) {
            case 0:
                so0 so0Var = this.f37746c;
                AnimatorSet animatorSet = so0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37745b) {
                        so0Var.f40586r.setVisibility(4);
                        return;
                    } else {
                        so0Var.f40581n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                so0 so0Var2 = this.f37746c;
                AnimatorSet animatorSet2 = so0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37745b) {
                        so0Var2.f40588s.setVisibility(4);
                        return;
                    } else {
                        so0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
