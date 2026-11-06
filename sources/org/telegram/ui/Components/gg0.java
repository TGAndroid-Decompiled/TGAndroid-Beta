package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class gg0 extends AnimatorListenerAdapter {
    public final int f33904a;
    public final hg0 f33905b;

    public gg0(hg0 hg0Var, int i7) {
        this.f33904a = i7;
        this.f33905b = hg0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33904a) {
            case 1:
                hg0 hg0Var = this.f33905b;
                AnimatorSet animatorSet = hg0Var.f34285s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hg0Var.f34285s = null;
                    hg0Var.getClass();
                    return;
                }
                return;
            case 2:
                hg0 hg0Var2 = this.f33905b;
                AnimatorSet animatorSet2 = hg0Var2.f34285s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    hg0Var2.f34285s = null;
                    hg0Var2.getClass();
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
        int i7 = this.f33904a;
        hg0 hg0Var = this.f33905b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = hg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hg0Var.h = null;
                }
                org.telegram.messenger.qs.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = hg0Var.f34285s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    hg0Var.f34285s = null;
                    if (hg0Var.f34287x) {
                        hg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.qs.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = hg0Var.f34285s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    hg0Var.f34285s = null;
                    org.telegram.messenger.g0.h3(new ob0(this, 9));
                }
                org.telegram.messenger.qs.e().k(99, 512);
                return;
        }
    }
}
