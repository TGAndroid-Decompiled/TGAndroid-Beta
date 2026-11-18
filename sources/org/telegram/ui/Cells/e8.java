package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e8 extends AnimatorListenerAdapter {
    public final int f30585a;
    public final boolean f30586b;
    public final h8 f30587c;

    public e8(h8 h8Var, boolean z10, int i7) {
        this.f30585a = i7;
        this.f30587c = h8Var;
        this.f30586b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30585a) {
            case 0:
                if (!this.f30586b) {
                    this.f30587c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30586b) {
                    this.f30587c.f30768y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30585a) {
            case 0:
                if (this.f30586b) {
                    this.f30587c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f30586b) {
                    this.f30587c.f30768y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
