package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g8 extends AnimatorListenerAdapter {
    public final int f21111a;
    public final boolean f21112b;
    public final j8 f21113c;

    public g8(j8 j8Var, boolean z4, int i10) {
        this.f21111a = i10;
        this.f21113c = j8Var;
        this.f21112b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21111a) {
            case 0:
                if (!this.f21112b) {
                    this.f21113c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f21112b) {
                    this.f21113c.f21244x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f21111a) {
            case 0:
                if (this.f21112b) {
                    this.f21113c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f21112b) {
                    this.f21113c.f21244x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
