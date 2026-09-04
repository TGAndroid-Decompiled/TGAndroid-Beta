package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22194a;
    public final boolean f22195b;
    public final m8 f22196c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22194a = i10;
        this.f22196c = m8Var;
        this.f22195b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22194a) {
            case 0:
                if (!this.f22195b) {
                    this.f22196c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22195b) {
                    this.f22196c.f22303x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22194a) {
            case 0:
                if (this.f22195b) {
                    this.f22196c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22195b) {
                    this.f22196c.f22303x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
