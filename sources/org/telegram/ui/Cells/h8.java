package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h8 extends AnimatorListenerAdapter {
    public final int f22942a;
    public final boolean f22943b;
    public final k8 f22944c;

    public h8(k8 k8Var, boolean z4, int i10) {
        this.f22942a = i10;
        this.f22944c = k8Var;
        this.f22943b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22942a) {
            case 0:
                if (!this.f22943b) {
                    this.f22944c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22943b) {
                    this.f22944c.f23080x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22942a) {
            case 0:
                if (this.f22943b) {
                    this.f22944c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22943b) {
                    this.f22944c.f23080x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
