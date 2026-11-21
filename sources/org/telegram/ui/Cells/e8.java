package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e8 extends AnimatorListenerAdapter {
    public final int f30613a;
    public final boolean f30614b;
    public final h8 f30615c;

    public e8(h8 h8Var, boolean z10, int i7) {
        this.f30613a = i7;
        this.f30615c = h8Var;
        this.f30614b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30613a) {
            case 0:
                if (!this.f30614b) {
                    this.f30615c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30614b) {
                    this.f30615c.f30796y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30613a) {
            case 0:
                if (this.f30614b) {
                    this.f30615c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f30614b) {
                    this.f30615c.f30796y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
