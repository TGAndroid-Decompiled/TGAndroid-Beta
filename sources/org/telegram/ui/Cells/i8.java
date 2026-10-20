package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f22439a;
    public final boolean f22440b;
    public final l8 f22441c;

    public i8(l8 l8Var, boolean z10, int i10) {
        this.f22439a = i10;
        this.f22441c = l8Var;
        this.f22440b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22439a) {
            case 0:
                if (!this.f22440b) {
                    this.f22441c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22440b) {
                    this.f22441c.f22547x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22439a) {
            case 0:
                if (this.f22440b) {
                    this.f22441c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22440b) {
                    this.f22441c.f22547x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
