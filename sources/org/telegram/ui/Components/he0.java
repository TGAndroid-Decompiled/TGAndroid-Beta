package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class he0 extends AnimatorListenerAdapter {
    public final int f26874a;
    public final ei.x8 f26875b;

    public he0(ei.x8 x8Var, int i10) {
        this.f26874a = i10;
        this.f26875b = x8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26874a) {
            case 0:
                ei.x8 x8Var = this.f26875b;
                AnimatorSet animatorSet = (AnimatorSet) x8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x8Var.e = null;
                    return;
                }
                return;
            case 1:
                ei.x8 x8Var2 = this.f26875b;
                AnimatorSet animatorSet2 = (AnimatorSet) x8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x8Var2.e = null;
                    return;
                }
                return;
            default:
                ei.x8 x8Var3 = this.f26875b;
                AnimatorSet animatorSet3 = (AnimatorSet) x8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x8Var3.e = null;
                    return;
                }
                return;
        }
    }
}
