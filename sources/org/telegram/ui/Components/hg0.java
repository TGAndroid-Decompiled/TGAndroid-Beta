package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class hg0 extends AnimatorListenerAdapter {
    public final int f34294a;
    public final ig0 f34295b;

    public hg0(ig0 ig0Var, int i7) {
        this.f34294a = i7;
        this.f34295b = ig0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34294a) {
            case 1:
                ig0 ig0Var = this.f34295b;
                AnimatorSet animatorSet = ig0Var.f34744s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.f34744s = null;
                    ig0Var.getClass();
                    return;
                }
                return;
            case 2:
                ig0 ig0Var2 = this.f34295b;
                AnimatorSet animatorSet2 = ig0Var2.f34744s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ig0Var2.f34744s = null;
                    ig0Var2.getClass();
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
        int i7 = this.f34294a;
        ig0 ig0Var = this.f34295b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = ig0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.h = null;
                }
                org.telegram.messenger.qs.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ig0Var.f34744s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ig0Var.f34744s = null;
                    if (ig0Var.f34746x) {
                        ig0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.qs.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ig0Var.f34744s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ig0Var.f34744s = null;
                    org.telegram.messenger.g0.h3(new pb0(this, 9));
                }
                org.telegram.messenger.qs.e().k(99, 512);
                return;
        }
    }
}
