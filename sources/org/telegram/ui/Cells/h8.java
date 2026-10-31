package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h8 extends AnimatorListenerAdapter {
    public final int f22001a;
    public final boolean f22002b;
    public final k8 f22003c;

    public h8(k8 k8Var, boolean z10, int i10) {
        this.f22001a = i10;
        this.f22003c = k8Var;
        this.f22002b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22001a) {
            case 0:
                if (!this.f22002b) {
                    this.f22003c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22002b) {
                    this.f22003c.f22185y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22001a) {
            case 0:
                if (this.f22002b) {
                    this.f22003c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22002b) {
                    this.f22003c.f22185y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
