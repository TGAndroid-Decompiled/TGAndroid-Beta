package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jg0 extends AnimatorListenerAdapter {
    public final int f35069a;
    public final kg0 f35070b;

    public jg0(kg0 kg0Var, int i3) {
        this.f35069a = i3;
        this.f35070b = kg0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35069a) {
            case 1:
                kg0 kg0Var = this.f35070b;
                AnimatorSet animatorSet = kg0Var.f35404s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kg0Var.f35404s = null;
                    kg0Var.getClass();
                    return;
                }
                return;
            case 2:
                kg0 kg0Var2 = this.f35070b;
                AnimatorSet animatorSet2 = kg0Var2.f35404s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kg0Var2.f35404s = null;
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
        int i3 = this.f35069a;
        kg0 kg0Var = this.f35070b;
        switch (i3) {
            case 0:
                AnimatorSet animatorSet = kg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kg0Var.h = null;
                }
                org.telegram.messenger.hs.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = kg0Var.f35404s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kg0Var.f35404s = null;
                    if (kg0Var.f35406x) {
                        kg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.hs.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = kg0Var.f35404s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kg0Var.f35404s = null;
                    org.telegram.messenger.g0.h3(new jb0(this, 11));
                }
                org.telegram.messenger.hs.e().k(99, 512);
                return;
        }
    }
}
