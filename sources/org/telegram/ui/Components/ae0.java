package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ae0 extends AnimatorListenerAdapter {
    public final int f24523a;
    public final ci.i9 f24524b;

    public ae0(ci.i9 i9Var, int i10) {
        this.f24523a = i10;
        this.f24524b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24523a) {
            case 0:
                ci.i9 i9Var = this.f24524b;
                AnimatorSet animatorSet = (AnimatorSet) i9Var.f5177e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    i9Var.f5177e = null;
                    return;
                }
                return;
            case 1:
                ci.i9 i9Var2 = this.f24524b;
                AnimatorSet animatorSet2 = (AnimatorSet) i9Var2.f5177e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    i9Var2.f5177e = null;
                    return;
                }
                return;
            default:
                ci.i9 i9Var3 = this.f24524b;
                AnimatorSet animatorSet3 = (AnimatorSet) i9Var3.f5177e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    i9Var3.f5177e = null;
                    return;
                }
                return;
        }
    }
}
