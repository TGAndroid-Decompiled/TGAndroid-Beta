package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f22435a;
    public final boolean f22436b;
    public final l8 f22437c;

    public i8(l8 l8Var, boolean z10, int i10) {
        this.f22435a = i10;
        this.f22437c = l8Var;
        this.f22436b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22435a) {
            case 0:
                if (!this.f22436b) {
                    this.f22437c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22436b) {
                    this.f22437c.f22543x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22435a) {
            case 0:
                if (this.f22436b) {
                    this.f22437c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22436b) {
                    this.f22437c.f22543x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
