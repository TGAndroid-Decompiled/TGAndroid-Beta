package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class dl0 extends AnimatorListenerAdapter {
    public final int f45007a;
    public final boolean f45008b;
    public final kl0 f45009c;

    public dl0(kl0 kl0Var, boolean z9, int i7) {
        this.f45007a = i7;
        this.f45009c = kl0Var;
        this.f45008b = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f45007a) {
            case 0:
                kl0 kl0Var = this.f45009c;
                AnimatorSet animatorSet = kl0Var.f47360w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kl0Var.f47360w = null;
                    return;
                }
                return;
            default:
                kl0 kl0Var2 = this.f45009c;
                AnimatorSet animatorSet2 = kl0Var2.f47360w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kl0Var2.f47360w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45007a) {
            case 0:
                kl0 kl0Var = this.f45009c;
                AnimatorSet animatorSet = kl0Var.f47360w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f45008b) {
                        kl0Var.f47353r.setVisibility(4);
                        return;
                    } else {
                        kl0Var.f47348n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                kl0 kl0Var2 = this.f45009c;
                AnimatorSet animatorSet2 = kl0Var2.f47360w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f45008b) {
                        kl0Var2.f47355s.setVisibility(4);
                        return;
                    } else {
                        kl0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
