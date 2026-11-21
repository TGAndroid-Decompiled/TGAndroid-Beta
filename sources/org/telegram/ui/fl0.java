package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class fl0 extends AnimatorListenerAdapter {
    public final int f47755a;
    public final boolean f47756b;
    public final ml0 f47757c;

    public fl0(ml0 ml0Var, boolean z10, int i7) {
        this.f47755a = i7;
        this.f47757c = ml0Var;
        this.f47756b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f47755a) {
            case 0:
                ml0 ml0Var = this.f47757c;
                AnimatorSet animatorSet = ml0Var.f49930w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ml0Var.f49930w = null;
                    return;
                }
                return;
            default:
                ml0 ml0Var2 = this.f47757c;
                AnimatorSet animatorSet2 = ml0Var2.f49930w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ml0Var2.f49930w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47755a) {
            case 0:
                ml0 ml0Var = this.f47757c;
                AnimatorSet animatorSet = ml0Var.f49930w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f47756b) {
                        ml0Var.f49923r.setVisibility(4);
                        return;
                    } else {
                        ml0Var.f49918n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ml0 ml0Var2 = this.f47757c;
                AnimatorSet animatorSet2 = ml0Var2.f49930w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f47756b) {
                        ml0Var2.f49925s.setVisibility(4);
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
