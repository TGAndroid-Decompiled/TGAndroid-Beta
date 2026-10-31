package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ih0 extends AnimatorListenerAdapter {
    public final int f26979a;
    public final jh0 f26980b;

    public ih0(jh0 jh0Var, int i10) {
        this.f26979a = i10;
        this.f26980b = jh0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26979a) {
            case 1:
                jh0 jh0Var = this.f26980b;
                AnimatorSet animatorSet = jh0Var.f27384s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jh0Var.f27384s = null;
                    jh0Var.getClass();
                    return;
                }
                return;
            case 2:
                jh0 jh0Var2 = this.f26980b;
                AnimatorSet animatorSet2 = jh0Var2.f27384s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jh0Var2.f27384s = null;
                    jh0Var2.getClass();
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
        int i10 = this.f26979a;
        jh0 jh0Var = this.f26980b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = jh0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jh0Var.h = null;
                }
                org.telegram.messenger.zs.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = jh0Var.f27384s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jh0Var.f27384s = null;
                    if (jh0Var.f27386x) {
                        jh0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.zs.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = jh0Var.f27384s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    jh0Var.f27384s = null;
                    org.telegram.messenger.i0.g3(new eb0(this, 14));
                }
                org.telegram.messenger.zs.e().k(99, 512);
                return;
        }
    }
}
