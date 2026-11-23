package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class dl0 extends AnimatorListenerAdapter {
    public final int f47160a;
    public final boolean f47161b;
    public final kl0 f47162c;

    public dl0(kl0 kl0Var, boolean z10, int i7) {
        this.f47160a = i7;
        this.f47162c = kl0Var;
        this.f47161b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f47160a) {
            case 0:
                kl0 kl0Var = this.f47162c;
                AnimatorSet animatorSet = kl0Var.f49489w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kl0Var.f49489w = null;
                    return;
                }
                return;
            default:
                kl0 kl0Var2 = this.f47162c;
                AnimatorSet animatorSet2 = kl0Var2.f49489w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kl0Var2.f49489w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47160a) {
            case 0:
                kl0 kl0Var = this.f47162c;
                AnimatorSet animatorSet = kl0Var.f49489w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f47161b) {
                        kl0Var.f49482r.setVisibility(4);
                        return;
                    } else {
                        kl0Var.f49477n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                kl0 kl0Var2 = this.f47162c;
                AnimatorSet animatorSet2 = kl0Var2.f49489w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f47161b) {
                        kl0Var2.f49484s.setVisibility(4);
                        return;
                    } else {
                        kl0Var2.V.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
