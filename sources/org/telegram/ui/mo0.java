package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class mo0 extends AnimatorListenerAdapter {
    public final int f40001a;
    public final boolean f40002b;
    public final vo0 f40003c;

    public mo0(vo0 vo0Var, boolean z10, int i10) {
        this.f40001a = i10;
        this.f40003c = vo0Var;
        this.f40002b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f40001a) {
            case 0:
                vo0 vo0Var = this.f40003c;
                AnimatorSet animatorSet = vo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vo0Var.v = null;
                    return;
                }
                return;
            default:
                vo0 vo0Var2 = this.f40003c;
                AnimatorSet animatorSet2 = vo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40001a) {
            case 0:
                vo0 vo0Var = this.f40003c;
                AnimatorSet animatorSet = vo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40002b) {
                        vo0Var.f42985r.setVisibility(4);
                        return;
                    } else {
                        vo0Var.f42980n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                vo0 vo0Var2 = this.f40003c;
                AnimatorSet animatorSet2 = vo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f40002b) {
                        vo0Var2.f42987s.setVisibility(4);
                        return;
                    } else {
                        vo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
