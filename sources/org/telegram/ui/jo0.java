package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jo0 extends AnimatorListenerAdapter {
    public final int f37730a;
    public final boolean f37731b;
    public final so0 f37732c;

    public jo0(so0 so0Var, boolean z10, int i10) {
        this.f37730a = i10;
        this.f37732c = so0Var;
        this.f37731b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37730a) {
            case 0:
                so0 so0Var = this.f37732c;
                AnimatorSet animatorSet = so0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    so0Var.v = null;
                    return;
                }
                return;
            default:
                so0 so0Var2 = this.f37732c;
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
        switch (this.f37730a) {
            case 0:
                so0 so0Var = this.f37732c;
                AnimatorSet animatorSet = so0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37731b) {
                        so0Var.f40567r.setVisibility(4);
                        return;
                    } else {
                        so0Var.f40562n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                so0 so0Var2 = this.f37732c;
                AnimatorSet animatorSet2 = so0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37731b) {
                        so0Var2.f40569s.setVisibility(4);
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
