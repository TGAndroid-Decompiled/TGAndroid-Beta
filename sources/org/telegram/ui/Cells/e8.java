package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class e8 extends AnimatorListenerAdapter {

    public final int f24318a;

    public final boolean f24319b;

    public final h8 f24320c;

    public e8(h8 h8Var, boolean z10, int i10) {
        this.f24318a = i10;
        this.f24320c = h8Var;
        this.f24319b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24318a) {
            case 0:
                if (!this.f24319b) {
                    this.f24320c.h.setVisibility(4);
                }
                break;
            default:
                if (!this.f24319b) {
                    this.f24320c.f24461x.setVisibility(4);
                }
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f24318a) {
            case 0:
                if (this.f24319b) {
                    this.f24320c.h.setVisibility(0);
                }
                break;
            default:
                if (this.f24319b) {
                    this.f24320c.f24461x.setVisibility(0);
                }
                break;
        }
    }
}
