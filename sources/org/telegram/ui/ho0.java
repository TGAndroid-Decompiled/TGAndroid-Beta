package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ho0 extends AnimatorListenerAdapter {
    public final int f33895a;
    public final boolean f33896b;
    public final qo0 f33897c;

    public ho0(qo0 qo0Var, boolean z10, int i10) {
        this.f33895a = i10;
        this.f33897c = qo0Var;
        this.f33896b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f33895a) {
            case 0:
                qo0 qo0Var = this.f33897c;
                AnimatorSet animatorSet = qo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qo0Var.v = null;
                    return;
                }
                return;
            default:
                qo0 qo0Var2 = this.f33897c;
                AnimatorSet animatorSet2 = qo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33895a) {
            case 0:
                qo0 qo0Var = this.f33897c;
                AnimatorSet animatorSet = qo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f33896b) {
                        qo0Var.f36510r.setVisibility(4);
                        return;
                    } else {
                        qo0Var.f36505n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                qo0 qo0Var2 = this.f33897c;
                AnimatorSet animatorSet2 = qo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f33896b) {
                        qo0Var2.f36512s.setVisibility(4);
                        return;
                    } else {
                        qo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
