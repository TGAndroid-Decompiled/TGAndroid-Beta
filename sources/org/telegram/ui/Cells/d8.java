package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d8 extends AnimatorListenerAdapter {
    public final int f29031a;
    public final boolean f29032b;
    public final g8 f29033c;

    public d8(g8 g8Var, boolean z9, int i7) {
        this.f29031a = i7;
        this.f29033c = g8Var;
        this.f29032b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29031a) {
            case 0:
                if (!this.f29032b) {
                    this.f29033c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f29032b) {
                    this.f29033c.f29208y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29031a) {
            case 0:
                if (this.f29032b) {
                    this.f29033c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f29032b) {
                    this.f29033c.f29208y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
