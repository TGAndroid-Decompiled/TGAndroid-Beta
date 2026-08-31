package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sd0 extends AnimatorListenerAdapter {
    public final int f31040a;
    public final td0 f31041b;

    public sd0(td0 td0Var, int i10) {
        this.f31040a = i10;
        this.f31041b = td0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31040a) {
            case 0:
                td0 td0Var = this.f31041b;
                AnimatorSet animatorSet = (AnimatorSet) td0Var.f31329e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    td0Var.f31329e = null;
                    return;
                }
                return;
            case 1:
                td0 td0Var2 = this.f31041b;
                AnimatorSet animatorSet2 = (AnimatorSet) td0Var2.f31329e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    td0Var2.f31329e = null;
                    return;
                }
                return;
            default:
                td0 td0Var3 = this.f31041b;
                AnimatorSet animatorSet3 = (AnimatorSet) td0Var3.f31329e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    td0Var3.f31329e = null;
                    return;
                }
                return;
        }
    }
}
