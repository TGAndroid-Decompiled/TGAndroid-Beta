package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ae0 extends AnimatorListenerAdapter {
    public final int f24518a;
    public final ci.i9 f24519b;

    public ae0(ci.i9 i9Var, int i10) {
        this.f24518a = i10;
        this.f24519b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24518a) {
            case 0:
                ci.i9 i9Var = this.f24519b;
                AnimatorSet animatorSet = (AnimatorSet) i9Var.f5176e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    i9Var.f5176e = null;
                    return;
                }
                return;
            case 1:
                ci.i9 i9Var2 = this.f24519b;
                AnimatorSet animatorSet2 = (AnimatorSet) i9Var2.f5176e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    i9Var2.f5176e = null;
                    return;
                }
                return;
            default:
                ci.i9 i9Var3 = this.f24519b;
                AnimatorSet animatorSet3 = (AnimatorSet) i9Var3.f5176e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    i9Var3.f5176e = null;
                    return;
                }
                return;
        }
    }
}
