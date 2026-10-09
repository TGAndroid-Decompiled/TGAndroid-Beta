package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class mo0 extends AnimatorListenerAdapter {
    public final int f39955a;
    public final boolean f39956b;
    public final vo0 f39957c;

    public mo0(vo0 vo0Var, boolean z10, int i10) {
        this.f39955a = i10;
        this.f39957c = vo0Var;
        this.f39956b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39955a) {
            case 0:
                vo0 vo0Var = this.f39957c;
                AnimatorSet animatorSet = vo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vo0Var.v = null;
                    return;
                }
                return;
            default:
                vo0 vo0Var2 = this.f39957c;
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
        switch (this.f39955a) {
            case 0:
                vo0 vo0Var = this.f39957c;
                AnimatorSet animatorSet = vo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39956b) {
                        vo0Var.f42939r.setVisibility(4);
                        return;
                    } else {
                        vo0Var.f42934n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                vo0 vo0Var2 = this.f39957c;
                AnimatorSet animatorSet2 = vo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39956b) {
                        vo0Var2.f42941s.setVisibility(4);
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
