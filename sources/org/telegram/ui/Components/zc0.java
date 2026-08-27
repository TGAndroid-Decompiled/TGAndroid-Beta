package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

public final class zc0 extends AnimatorListenerAdapter {

    public final int f35222a;

    public final lh.w8 f35223b;

    public zc0(lh.w8 w8Var, int i10) {
        this.f35222a = i10;
        this.f35223b = w8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35222a) {
            case 0:
                lh.w8 w8Var = this.f35223b;
                AnimatorSet animatorSet = (AnimatorSet) w8Var.f17016e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w8Var.f17016e = null;
                    break;
                }
                break;
            case 1:
                lh.w8 w8Var2 = this.f35223b;
                AnimatorSet animatorSet2 = (AnimatorSet) w8Var2.f17016e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w8Var2.f17016e = null;
                    break;
                }
                break;
            default:
                lh.w8 w8Var3 = this.f35223b;
                AnimatorSet animatorSet3 = (AnimatorSet) w8Var3.f17016e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    w8Var3.f17016e = null;
                    break;
                }
                break;
        }
    }
}
