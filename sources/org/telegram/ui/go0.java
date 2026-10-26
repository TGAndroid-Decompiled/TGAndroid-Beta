package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class go0 extends AnimatorListenerAdapter {
    public final int f39732a;
    public final boolean f39733b;
    public final po0 f39734c;

    public go0(po0 po0Var, boolean z10, int i10) {
        this.f39732a = i10;
        this.f39734c = po0Var;
        this.f39733b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39732a) {
            case 0:
                po0 po0Var = this.f39734c;
                AnimatorSet animatorSet = po0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    po0Var.v = null;
                    return;
                }
                return;
            default:
                po0 po0Var2 = this.f39734c;
                AnimatorSet animatorSet2 = po0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    po0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39732a) {
            case 0:
                po0 po0Var = this.f39734c;
                AnimatorSet animatorSet = po0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39733b) {
                        po0Var.f42613r.setVisibility(4);
                        return;
                    } else {
                        po0Var.f42608n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                po0 po0Var2 = this.f39734c;
                AnimatorSet animatorSet2 = po0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39733b) {
                        po0Var2.f42615s.setVisibility(4);
                        return;
                    } else {
                        po0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
