package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22349a;
    public final boolean f22350b;
    public final m8 f22351c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22349a = i10;
        this.f22351c = m8Var;
        this.f22350b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22349a) {
            case 0:
                if (!this.f22350b) {
                    this.f22351c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22350b) {
                    this.f22351c.f22472x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22349a) {
            case 0:
                if (this.f22350b) {
                    this.f22351c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22350b) {
                    this.f22351c.f22472x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
