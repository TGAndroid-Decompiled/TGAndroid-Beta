package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ug0 extends AnimatorListenerAdapter {
    public final int f40373a;
    public final vg0 f40374b;

    public ug0(vg0 vg0Var, int i7) {
        this.f40373a = i7;
        this.f40374b = vg0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40373a) {
            case 1:
                vg0 vg0Var = this.f40374b;
                AnimatorSet animatorSet = vg0Var.f40697s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vg0Var.f40697s = null;
                    vg0Var.getClass();
                    return;
                }
                return;
            case 2:
                vg0 vg0Var2 = this.f40374b;
                AnimatorSet animatorSet2 = vg0Var2.f40697s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vg0Var2.f40697s = null;
                    vg0Var2.getClass();
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
        int i7 = this.f40373a;
        vg0 vg0Var = this.f40374b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = vg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vg0Var.h = null;
                }
                org.telegram.messenger.ks.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = vg0Var.f40697s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vg0Var.f40697s = null;
                    if (vg0Var.f40699x) {
                        vg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.ks.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = vg0Var.f40697s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vg0Var.f40697s = null;
                    org.telegram.messenger.g0.g3(new eb0(this, 11));
                }
                org.telegram.messenger.ks.e().k(99, 512);
                return;
        }
    }
}
