package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jg0 extends AnimatorListenerAdapter {
    public final int f36005a;
    public final kg0 f36006b;

    public jg0(kg0 kg0Var, int i7) {
        this.f36005a = i7;
        this.f36006b = kg0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36005a) {
            case 1:
                kg0 kg0Var = this.f36006b;
                AnimatorSet animatorSet = kg0Var.f36427s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kg0Var.f36427s = null;
                    kg0Var.getClass();
                    return;
                }
                return;
            case 2:
                kg0 kg0Var2 = this.f36006b;
                AnimatorSet animatorSet2 = kg0Var2.f36427s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kg0Var2.f36427s = null;
                    kg0Var2.getClass();
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
        int i7 = this.f36005a;
        kg0 kg0Var = this.f36006b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = kg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kg0Var.h = null;
                }
                org.telegram.messenger.ns.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = kg0Var.f36427s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kg0Var.f36427s = null;
                    if (kg0Var.f36429x) {
                        kg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.ns.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = kg0Var.f36427s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kg0Var.f36427s = null;
                    org.telegram.messenger.g0.h3(new wa0(this, 11));
                }
                org.telegram.messenger.ns.e().k(99, 512);
                return;
        }
    }
}
