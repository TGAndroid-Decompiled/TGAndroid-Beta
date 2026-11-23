package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class fl0 extends AnimatorListenerAdapter {
    public final int f47727a;
    public final boolean f47728b;
    public final ml0 f47729c;

    public fl0(ml0 ml0Var, boolean z10, int i7) {
        this.f47727a = i7;
        this.f47729c = ml0Var;
        this.f47728b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f47727a) {
            case 0:
                ml0 ml0Var = this.f47729c;
                AnimatorSet animatorSet = ml0Var.f49903w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ml0Var.f49903w = null;
                    return;
                }
                return;
            default:
                ml0 ml0Var2 = this.f47729c;
                AnimatorSet animatorSet2 = ml0Var2.f49903w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ml0Var2.f49903w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47727a) {
            case 0:
                ml0 ml0Var = this.f47729c;
                AnimatorSet animatorSet = ml0Var.f49903w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f47728b) {
                        ml0Var.f49896r.setVisibility(4);
                        return;
                    } else {
                        ml0Var.f49891n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ml0 ml0Var2 = this.f47729c;
                AnimatorSet animatorSet2 = ml0Var2.f49903w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f47728b) {
                        ml0Var2.f49898s.setVisibility(4);
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
