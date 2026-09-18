package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class po0 extends AnimatorListenerAdapter {
    public final int f36673a;
    public final boolean f36674b;
    public final yo0 f36675c;

    public po0(yo0 yo0Var, boolean z10, int i10) {
        this.f36673a = i10;
        this.f36675c = yo0Var;
        this.f36674b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36673a) {
            case 0:
                yo0 yo0Var = this.f36675c;
                AnimatorSet animatorSet = yo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    yo0Var.v = null;
                    return;
                }
                return;
            default:
                yo0 yo0Var2 = this.f36675c;
                AnimatorSet animatorSet2 = yo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    yo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36673a) {
            case 0:
                yo0 yo0Var = this.f36675c;
                AnimatorSet animatorSet = yo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36674b) {
                        yo0Var.f39976r.setVisibility(4);
                        return;
                    } else {
                        yo0Var.f39971n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                yo0 yo0Var2 = this.f36675c;
                AnimatorSet animatorSet2 = yo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36674b) {
                        yo0Var2.f39978s.setVisibility(4);
                        return;
                    } else {
                        yo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
