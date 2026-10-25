package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class go0 extends AnimatorListenerAdapter {
    public final int f39729a;
    public final boolean f39730b;
    public final po0 f39731c;

    public go0(po0 po0Var, boolean z10, int i10) {
        this.f39729a = i10;
        this.f39731c = po0Var;
        this.f39730b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39729a) {
            case 0:
                po0 po0Var = this.f39731c;
                AnimatorSet animatorSet = po0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    po0Var.v = null;
                    return;
                }
                return;
            default:
                po0 po0Var2 = this.f39731c;
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
        switch (this.f39729a) {
            case 0:
                po0 po0Var = this.f39731c;
                AnimatorSet animatorSet = po0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39730b) {
                        po0Var.f42610r.setVisibility(4);
                        return;
                    } else {
                        po0Var.f42605n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                po0 po0Var2 = this.f39731c;
                AnimatorSet animatorSet2 = po0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39730b) {
                        po0Var2.f42612s.setVisibility(4);
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
