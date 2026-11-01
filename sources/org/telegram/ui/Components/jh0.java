package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jh0 extends AnimatorListenerAdapter {
    public final int f27430a;
    public final kh0 f27431b;

    public jh0(kh0 kh0Var, int i10) {
        this.f27430a = i10;
        this.f27431b = kh0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27430a) {
            case 1:
                kh0 kh0Var = this.f27431b;
                AnimatorSet animatorSet = kh0Var.f27852s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kh0Var.f27852s = null;
                    kh0Var.getClass();
                    return;
                }
                return;
            case 2:
                kh0 kh0Var2 = this.f27431b;
                AnimatorSet animatorSet2 = kh0Var2.f27852s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kh0Var2.f27852s = null;
                    kh0Var2.getClass();
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f27430a;
        kh0 kh0Var = this.f27431b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = kh0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kh0Var.h = null;
                }
                org.telegram.messenger.at.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = kh0Var.f27852s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kh0Var.f27852s = null;
                    if (kh0Var.f27854x) {
                        kh0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.at.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = kh0Var.f27852s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kh0Var.f27852s = null;
                    org.telegram.messenger.i0.g3(new eb0(this, 14));
                }
                org.telegram.messenger.at.e().k(99, 512);
                return;
        }
    }
}
