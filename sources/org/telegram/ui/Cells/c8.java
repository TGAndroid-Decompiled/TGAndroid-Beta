package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c8 extends AnimatorListenerAdapter {
    public final int f30120a;
    public final boolean f30121b;
    public final f8 f30122c;

    public c8(f8 f8Var, boolean z10, int i7) {
        this.f30120a = i7;
        this.f30122c = f8Var;
        this.f30121b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30120a) {
            case 0:
                if (!this.f30121b) {
                    this.f30122c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f30121b) {
                    this.f30122c.f30304y.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30120a) {
            case 0:
                if (this.f30121b) {
                    this.f30122c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f30121b) {
                    this.f30122c.f30304y.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
