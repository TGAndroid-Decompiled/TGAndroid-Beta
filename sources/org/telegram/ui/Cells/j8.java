package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20503a;
    public final boolean f20504b;
    public final m8 f20505c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20503a = i10;
        this.f20505c = m8Var;
        this.f20504b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20503a) {
            case 0:
                if (!this.f20504b) {
                    this.f20505c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20504b) {
                    this.f20505c.f20616x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20503a) {
            case 0:
                if (this.f20504b) {
                    this.f20505c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20504b) {
                    this.f20505c.f20616x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
