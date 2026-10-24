package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f22541a;
    public final boolean f22542b;
    public final l8 f22543c;

    public i8(l8 l8Var, boolean z10, int i10) {
        this.f22541a = i10;
        this.f22543c = l8Var;
        this.f22542b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22541a) {
            case 0:
                if (!this.f22542b) {
                    this.f22543c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22542b) {
                    this.f22543c.f22693x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22541a) {
            case 0:
                if (this.f22542b) {
                    this.f22543c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22542b) {
                    this.f22543c.f22693x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
