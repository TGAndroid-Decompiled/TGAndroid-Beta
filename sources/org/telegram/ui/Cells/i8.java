package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f22443a;
    public final boolean f22444b;
    public final l8 f22445c;

    public i8(l8 l8Var, boolean z10, int i10) {
        this.f22443a = i10;
        this.f22445c = l8Var;
        this.f22444b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22443a) {
            case 0:
                if (!this.f22444b) {
                    this.f22445c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22444b) {
                    this.f22445c.f22551x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22443a) {
            case 0:
                if (this.f22444b) {
                    this.f22445c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22444b) {
                    this.f22445c.f22551x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
