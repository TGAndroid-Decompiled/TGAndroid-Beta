package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d8 extends AnimatorListenerAdapter {
    public final int f29049a;
    public final boolean f29050b;
    public final g8 f29051c;

    public d8(g8 g8Var, boolean z9, int i7) {
        this.f29049a = i7;
        this.f29051c = g8Var;
        this.f29050b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29049a) {
            case 0:
                if (!this.f29050b) {
                    this.f29051c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f29050b) {
                    this.f29051c.f29226y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29049a) {
            case 0:
                if (this.f29050b) {
                    this.f29051c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f29050b) {
                    this.f29051c.f29226y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
