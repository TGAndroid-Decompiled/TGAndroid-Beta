package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d8 extends AnimatorListenerAdapter {
    public final int f30642a;
    public final boolean f30643b;
    public final g8 f30644c;

    public d8(g8 g8Var, boolean z10, int i7) {
        this.f30642a = i7;
        this.f30644c = g8Var;
        this.f30643b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30642a) {
            case 0:
                if (!this.f30643b) {
                    this.f30644c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30643b) {
                    this.f30644c.f30825y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30642a) {
            case 0:
                if (this.f30643b) {
                    this.f30644c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f30643b) {
                    this.f30644c.f30825y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
