package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f22540a;
    public final boolean f22541b;
    public final l8 f22542c;

    public i8(l8 l8Var, boolean z10, int i10) {
        this.f22540a = i10;
        this.f22542c = l8Var;
        this.f22541b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22540a) {
            case 0:
                if (!this.f22541b) {
                    this.f22542c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22541b) {
                    this.f22542c.f22692x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22540a) {
            case 0:
                if (this.f22541b) {
                    this.f22542c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22541b) {
                    this.f22542c.f22692x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
