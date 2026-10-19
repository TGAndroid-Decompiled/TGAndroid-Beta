package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f22436a;
    public final boolean f22437b;
    public final l8 f22438c;

    public i8(l8 l8Var, boolean z10, int i10) {
        this.f22436a = i10;
        this.f22438c = l8Var;
        this.f22437b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22436a) {
            case 0:
                if (!this.f22437b) {
                    this.f22438c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22437b) {
                    this.f22438c.f22544x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22436a) {
            case 0:
                if (this.f22437b) {
                    this.f22438c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22437b) {
                    this.f22438c.f22544x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
