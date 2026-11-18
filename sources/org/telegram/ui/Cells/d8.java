package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d8 extends AnimatorListenerAdapter {
    public final int f30539a;
    public final boolean f30540b;
    public final g8 f30541c;

    public d8(g8 g8Var, boolean z10, int i7) {
        this.f30539a = i7;
        this.f30541c = g8Var;
        this.f30540b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30539a) {
            case 0:
                if (!this.f30540b) {
                    this.f30541c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30540b) {
                    this.f30541c.f30719y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30539a) {
            case 0:
                if (this.f30540b) {
                    this.f30541c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f30540b) {
                    this.f30541c.f30719y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
