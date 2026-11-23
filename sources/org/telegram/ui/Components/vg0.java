package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class vg0 extends AnimatorListenerAdapter {
    public final int f40824a;
    public final wg0 f40825b;

    public vg0(wg0 wg0Var, int i7) {
        this.f40824a = i7;
        this.f40825b = wg0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40824a) {
            case 1:
                wg0 wg0Var = this.f40825b;
                AnimatorSet animatorSet = wg0Var.f41815s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg0Var.f41815s = null;
                    wg0Var.getClass();
                    return;
                }
                return;
            case 2:
                wg0 wg0Var2 = this.f40825b;
                AnimatorSet animatorSet2 = wg0Var2.f41815s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wg0Var2.f41815s = null;
                    wg0Var2.getClass();
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
        int i7 = this.f40824a;
        wg0 wg0Var = this.f40825b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = wg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg0Var.h = null;
                }
                org.telegram.messenger.ls.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = wg0Var.f41815s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wg0Var.f41815s = null;
                    if (wg0Var.f41817x) {
                        wg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.ls.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = wg0Var.f41815s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    wg0Var.f41815s = null;
                    org.telegram.messenger.g0.g3(new hb0(this, 11));
                }
                org.telegram.messenger.ls.e().k(99, 512);
                return;
        }
    }
}
