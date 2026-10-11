package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22377a;
    public final boolean f22378b;
    public final m8 f22379c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22377a = i10;
        this.f22379c = m8Var;
        this.f22378b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22377a) {
            case 0:
                if (!this.f22378b) {
                    this.f22379c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22378b) {
                    this.f22379c.f22500x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22377a) {
            case 0:
                if (this.f22378b) {
                    this.f22379c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22378b) {
                    this.f22379c.f22500x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
