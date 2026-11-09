package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d8 extends AnimatorListenerAdapter {
    public final int f29038a;
    public final boolean f29039b;
    public final g8 f29040c;

    public d8(g8 g8Var, boolean z9, int i7) {
        this.f29038a = i7;
        this.f29040c = g8Var;
        this.f29039b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29038a) {
            case 0:
                if (!this.f29039b) {
                    this.f29040c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f29039b) {
                    this.f29040c.f29215y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29038a) {
            case 0:
                if (this.f29039b) {
                    this.f29040c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f29039b) {
                    this.f29040c.f29215y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
