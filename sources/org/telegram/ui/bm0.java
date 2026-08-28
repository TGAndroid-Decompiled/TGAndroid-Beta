package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class bm0 extends AnimatorListenerAdapter {
    public final int f36909a;
    public final boolean f36910b;
    public final wm0 f36911c;

    public bm0(wm0 wm0Var, boolean z10, int i9) {
        this.f36909a = i9;
        this.f36911c = wm0Var;
        this.f36910b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36909a) {
            case 0:
                wm0 wm0Var = this.f36911c;
                AnimatorSet animatorSet = wm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wm0Var.I = null;
                    return;
                }
                return;
            default:
                wm0 wm0Var2 = this.f36911c;
                AnimatorSet animatorSet2 = wm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wm0Var2.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36909a) {
            case 0:
                wm0 wm0Var = this.f36911c;
                AnimatorSet animatorSet = wm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36910b) {
                        wm0Var.J.setVisibility(4);
                        return;
                    } else {
                        wm0Var.H.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                wm0 wm0Var2 = this.f36911c;
                AnimatorSet animatorSet2 = wm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36910b) {
                        wm0Var2.L.setVisibility(4);
                        return;
                    } else {
                        wm0Var2.K.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
