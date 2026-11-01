package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jm0 extends AnimatorListenerAdapter {
    public final int f38470a;
    public final boolean f38471b;
    public final qm0 f38472c;

    public jm0(qm0 qm0Var, boolean z10, int i10) {
        this.f38470a = i10;
        this.f38472c = qm0Var;
        this.f38471b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f38470a) {
            case 0:
                qm0 qm0Var = this.f38472c;
                AnimatorSet animatorSet = qm0Var.f40846w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qm0Var.f40846w = null;
                    return;
                }
                return;
            default:
                qm0 qm0Var2 = this.f38472c;
                AnimatorSet animatorSet2 = qm0Var2.f40846w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qm0Var2.f40846w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38470a) {
            case 0:
                qm0 qm0Var = this.f38472c;
                AnimatorSet animatorSet = qm0Var.f40846w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f38471b) {
                        qm0Var.f40839r.setVisibility(4);
                        return;
                    } else {
                        qm0Var.f40834n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                qm0 qm0Var2 = this.f38472c;
                AnimatorSet animatorSet2 = qm0Var2.f40846w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f38471b) {
                        qm0Var2.f40841s.setVisibility(4);
                        return;
                    } else {
                        qm0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
