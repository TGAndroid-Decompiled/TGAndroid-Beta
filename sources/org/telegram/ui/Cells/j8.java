package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20539a;
    public final boolean f20540b;
    public final m8 f20541c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20539a = i10;
        this.f20541c = m8Var;
        this.f20540b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20539a) {
            case 0:
                if (!this.f20540b) {
                    this.f20541c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20540b) {
                    this.f20541c.f20652x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20539a) {
            case 0:
                if (this.f20540b) {
                    this.f20541c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20540b) {
                    this.f20541c.f20652x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
