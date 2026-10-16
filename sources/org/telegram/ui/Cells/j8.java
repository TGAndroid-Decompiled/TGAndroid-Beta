package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f21120a;
    public final boolean f21121b;
    public final m8 f21122c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f21120a = i10;
        this.f21122c = m8Var;
        this.f21121b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21120a) {
            case 0:
                if (!this.f21121b) {
                    this.f21122c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f21121b) {
                    this.f21122c.f21226x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f21120a) {
            case 0:
                if (this.f21121b) {
                    this.f21122c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f21121b) {
                    this.f21122c.f21226x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
