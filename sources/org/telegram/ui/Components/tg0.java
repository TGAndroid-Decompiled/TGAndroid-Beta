package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class tg0 extends AnimatorListenerAdapter {
    public final int f39996a;
    public final ug0 f39997b;

    public tg0(ug0 ug0Var, int i7) {
        this.f39996a = i7;
        this.f39997b = ug0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39996a) {
            case 1:
                ug0 ug0Var = this.f39997b;
                AnimatorSet animatorSet = ug0Var.f40348s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ug0Var.f40348s = null;
                    ug0Var.getClass();
                    return;
                }
                return;
            case 2:
                ug0 ug0Var2 = this.f39997b;
                AnimatorSet animatorSet2 = ug0Var2.f40348s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ug0Var2.f40348s = null;
                    ug0Var2.getClass();
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
        int i7 = this.f39996a;
        ug0 ug0Var = this.f39997b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = ug0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ug0Var.h = null;
                }
                org.telegram.messenger.ks.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ug0Var.f40348s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ug0Var.f40348s = null;
                    if (ug0Var.f40350x) {
                        ug0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.ks.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ug0Var.f40348s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ug0Var.f40348s = null;
                    org.telegram.messenger.g0.g3(new gb0(this, 11));
                }
                org.telegram.messenger.ks.e().k(99, 512);
                return;
        }
    }
}
