package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e8 extends AnimatorListenerAdapter {
    public final int f30582a;
    public final boolean f30583b;
    public final h8 f30584c;

    public e8(h8 h8Var, boolean z10, int i7) {
        this.f30582a = i7;
        this.f30584c = h8Var;
        this.f30583b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30582a) {
            case 0:
                if (!this.f30583b) {
                    this.f30584c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30583b) {
                    this.f30584c.f30765y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30582a) {
            case 0:
                if (this.f30583b) {
                    this.f30584c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f30583b) {
                    this.f30584c.f30765y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
