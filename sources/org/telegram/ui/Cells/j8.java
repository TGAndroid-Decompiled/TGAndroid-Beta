package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22363a;
    public final boolean f22364b;
    public final m8 f22365c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22363a = i10;
        this.f22365c = m8Var;
        this.f22364b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22363a) {
            case 0:
                if (!this.f22364b) {
                    this.f22365c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22364b) {
                    this.f22365c.f22485x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22363a) {
            case 0:
                if (this.f22364b) {
                    this.f22365c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22364b) {
                    this.f22365c.f22485x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
