package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e8 extends AnimatorListenerAdapter {
    public final int f30616a;
    public final boolean f30617b;
    public final h8 f30618c;

    public e8(h8 h8Var, boolean z10, int i7) {
        this.f30616a = i7;
        this.f30618c = h8Var;
        this.f30617b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30616a) {
            case 0:
                if (!this.f30617b) {
                    this.f30618c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30617b) {
                    this.f30618c.f30799y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30616a) {
            case 0:
                if (this.f30617b) {
                    this.f30618c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f30617b) {
                    this.f30618c.f30799y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
