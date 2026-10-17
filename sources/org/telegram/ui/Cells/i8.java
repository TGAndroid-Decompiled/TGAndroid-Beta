package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f22438a;
    public final boolean f22439b;
    public final l8 f22440c;

    public i8(l8 l8Var, boolean z10, int i10) {
        this.f22438a = i10;
        this.f22440c = l8Var;
        this.f22439b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22438a) {
            case 0:
                if (!this.f22439b) {
                    this.f22440c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22439b) {
                    this.f22440c.f22546x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22438a) {
            case 0:
                if (this.f22439b) {
                    this.f22440c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22439b) {
                    this.f22440c.f22546x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
