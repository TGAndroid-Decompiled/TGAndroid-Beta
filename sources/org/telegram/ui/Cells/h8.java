package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h8 extends AnimatorListenerAdapter {
    public final int f21186a;
    public final boolean f21187b;
    public final k8 f21188c;

    public h8(k8 k8Var, boolean z4, int i10) {
        this.f21186a = i10;
        this.f21188c = k8Var;
        this.f21187b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21186a) {
            case 0:
                if (!this.f21187b) {
                    this.f21188c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f21187b) {
                    this.f21188c.f21314x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f21186a) {
            case 0:
                if (this.f21187b) {
                    this.f21188c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f21187b) {
                    this.f21188c.f21314x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
