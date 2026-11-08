package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d8 extends AnimatorListenerAdapter {
    public final int f29034a;
    public final boolean f29035b;
    public final g8 f29036c;

    public d8(g8 g8Var, boolean z9, int i7) {
        this.f29034a = i7;
        this.f29036c = g8Var;
        this.f29035b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29034a) {
            case 0:
                if (!this.f29035b) {
                    this.f29036c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f29035b) {
                    this.f29036c.f29211y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29034a) {
            case 0:
                if (this.f29035b) {
                    this.f29036c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f29035b) {
                    this.f29036c.f29211y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
