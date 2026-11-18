package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class fl0 extends AnimatorListenerAdapter {
    public final int f47688a;
    public final boolean f47689b;
    public final ml0 f47690c;

    public fl0(ml0 ml0Var, boolean z10, int i7) {
        this.f47688a = i7;
        this.f47690c = ml0Var;
        this.f47689b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f47688a) {
            case 0:
                ml0 ml0Var = this.f47690c;
                AnimatorSet animatorSet = ml0Var.f49889w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ml0Var.f49889w = null;
                    return;
                }
                return;
            default:
                ml0 ml0Var2 = this.f47690c;
                AnimatorSet animatorSet2 = ml0Var2.f49889w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ml0Var2.f49889w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47688a) {
            case 0:
                ml0 ml0Var = this.f47690c;
                AnimatorSet animatorSet = ml0Var.f49889w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f47689b) {
                        ml0Var.f49882r.setVisibility(4);
                        return;
                    } else {
                        ml0Var.f49877n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ml0 ml0Var2 = this.f47690c;
                AnimatorSet animatorSet2 = ml0Var2.f49889w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f47689b) {
                        ml0Var2.f49884s.setVisibility(4);
                        return;
                    } else {
                        ml0Var2.V.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
