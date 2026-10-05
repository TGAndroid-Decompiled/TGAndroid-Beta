package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22367a;
    public final boolean f22368b;
    public final m8 f22369c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22367a = i10;
        this.f22369c = m8Var;
        this.f22368b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22367a) {
            case 0:
                if (!this.f22368b) {
                    this.f22369c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22368b) {
                    this.f22369c.f22488x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22367a) {
            case 0:
                if (this.f22368b) {
                    this.f22369c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22368b) {
                    this.f22369c.f22488x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
