package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class dl0 extends AnimatorListenerAdapter {
    public final int f46394a;
    public final boolean f46395b;
    public final kl0 f46396c;

    public dl0(kl0 kl0Var, boolean z10, int i7) {
        this.f46394a = i7;
        this.f46396c = kl0Var;
        this.f46395b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f46394a) {
            case 0:
                kl0 kl0Var = this.f46396c;
                AnimatorSet animatorSet = kl0Var.f48710w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kl0Var.f48710w = null;
                    return;
                }
                return;
            default:
                kl0 kl0Var2 = this.f46396c;
                AnimatorSet animatorSet2 = kl0Var2.f48710w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kl0Var2.f48710w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46394a) {
            case 0:
                kl0 kl0Var = this.f46396c;
                AnimatorSet animatorSet = kl0Var.f48710w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f46395b) {
                        kl0Var.f48703r.setVisibility(4);
                        return;
                    } else {
                        kl0Var.f48698n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                kl0 kl0Var2 = this.f46396c;
                AnimatorSet animatorSet2 = kl0Var2.f48710w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f46395b) {
                        kl0Var2.f48705s.setVisibility(4);
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
