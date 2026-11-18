package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class fl0 extends AnimatorListenerAdapter {
    public final int f47724a;
    public final boolean f47725b;
    public final ml0 f47726c;

    public fl0(ml0 ml0Var, boolean z10, int i7) {
        this.f47724a = i7;
        this.f47726c = ml0Var;
        this.f47725b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f47724a) {
            case 0:
                ml0 ml0Var = this.f47726c;
                AnimatorSet animatorSet = ml0Var.f49915w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ml0Var.f49915w = null;
                    return;
                }
                return;
            default:
                ml0 ml0Var2 = this.f47726c;
                AnimatorSet animatorSet2 = ml0Var2.f49915w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ml0Var2.f49915w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47724a) {
            case 0:
                ml0 ml0Var = this.f47726c;
                AnimatorSet animatorSet = ml0Var.f49915w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f47725b) {
                        ml0Var.f49908r.setVisibility(4);
                        return;
                    } else {
                        ml0Var.f49903n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ml0 ml0Var2 = this.f47726c;
                AnimatorSet animatorSet2 = ml0Var2.f49915w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f47725b) {
                        ml0Var2.f49910s.setVisibility(4);
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
