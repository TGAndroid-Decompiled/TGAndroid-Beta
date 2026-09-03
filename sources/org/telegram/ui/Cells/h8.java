package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h8 extends AnimatorListenerAdapter {
    public final int f22944a;
    public final boolean f22945b;
    public final k8 f22946c;

    public h8(k8 k8Var, boolean z4, int i10) {
        this.f22944a = i10;
        this.f22946c = k8Var;
        this.f22945b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22944a) {
            case 0:
                if (!this.f22945b) {
                    this.f22946c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22945b) {
                    this.f22946c.f23082x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22944a) {
            case 0:
                if (this.f22945b) {
                    this.f22946c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22945b) {
                    this.f22946c.f23082x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
