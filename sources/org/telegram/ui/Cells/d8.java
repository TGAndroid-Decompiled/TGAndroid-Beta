package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d8 extends AnimatorListenerAdapter {
    public final int f29030a;
    public final boolean f29031b;
    public final g8 f29032c;

    public d8(g8 g8Var, boolean z9, int i7) {
        this.f29030a = i7;
        this.f29032c = g8Var;
        this.f29031b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29030a) {
            case 0:
                if (!this.f29031b) {
                    this.f29032c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f29031b) {
                    this.f29032c.f29207y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29030a) {
            case 0:
                if (this.f29031b) {
                    this.f29032c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f29031b) {
                    this.f29032c.f29207y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
