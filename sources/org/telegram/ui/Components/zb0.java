package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class zb0 extends AnimatorListenerAdapter {
    public final int f40911a;
    public final fi.a8 f40912b;

    public zb0(fi.a8 a8Var, int i7) {
        this.f40911a = i7;
        this.f40912b = a8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40911a) {
            case 0:
                fi.a8 a8Var = this.f40912b;
                AnimatorSet animatorSet = (AnimatorSet) a8Var.f11614e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    a8Var.f11614e = null;
                    return;
                }
                return;
            case 1:
                fi.a8 a8Var2 = this.f40912b;
                AnimatorSet animatorSet2 = (AnimatorSet) a8Var2.f11614e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    a8Var2.f11614e = null;
                    return;
                }
                return;
            default:
                fi.a8 a8Var3 = this.f40912b;
                AnimatorSet animatorSet3 = (AnimatorSet) a8Var3.f11614e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    a8Var3.f11614e = null;
                    return;
                }
                return;
        }
    }
}
