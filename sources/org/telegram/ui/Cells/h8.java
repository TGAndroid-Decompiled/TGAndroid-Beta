package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h8 extends AnimatorListenerAdapter {
    public final int f22002a;
    public final boolean f22003b;
    public final k8 f22004c;

    public h8(k8 k8Var, boolean z10, int i10) {
        this.f22002a = i10;
        this.f22004c = k8Var;
        this.f22003b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22002a) {
            case 0:
                if (!this.f22003b) {
                    this.f22004c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22003b) {
                    this.f22004c.f22186y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22002a) {
            case 0:
                if (this.f22003b) {
                    this.f22004c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22003b) {
                    this.f22004c.f22186y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
