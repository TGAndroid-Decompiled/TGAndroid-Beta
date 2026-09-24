package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20525a;
    public final boolean f20526b;
    public final m8 f20527c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20525a = i10;
        this.f20527c = m8Var;
        this.f20526b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20525a) {
            case 0:
                if (!this.f20526b) {
                    this.f20527c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20526b) {
                    this.f20527c.f20638x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20525a) {
            case 0:
                if (this.f20526b) {
                    this.f20527c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20526b) {
                    this.f20527c.f20638x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
