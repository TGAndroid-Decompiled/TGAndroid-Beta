package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class po0 extends AnimatorListenerAdapter {
    public final int f36668a;
    public final boolean f36669b;
    public final yo0 f36670c;

    public po0(yo0 yo0Var, boolean z10, int i10) {
        this.f36668a = i10;
        this.f36670c = yo0Var;
        this.f36669b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36668a) {
            case 0:
                yo0 yo0Var = this.f36670c;
                AnimatorSet animatorSet = yo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    yo0Var.v = null;
                    return;
                }
                return;
            default:
                yo0 yo0Var2 = this.f36670c;
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
        switch (this.f36668a) {
            case 0:
                yo0 yo0Var = this.f36670c;
                AnimatorSet animatorSet = yo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36669b) {
                        yo0Var.f39971r.setVisibility(4);
                        return;
                    } else {
                        yo0Var.f39966n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                yo0 yo0Var2 = this.f36670c;
                AnimatorSet animatorSet2 = yo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36669b) {
                        yo0Var2.f39973s.setVisibility(4);
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
