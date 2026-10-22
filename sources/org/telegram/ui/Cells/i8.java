package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f22442a;
    public final boolean f22443b;
    public final l8 f22444c;

    public i8(l8 l8Var, boolean z10, int i10) {
        this.f22442a = i10;
        this.f22444c = l8Var;
        this.f22443b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22442a) {
            case 0:
                if (!this.f22443b) {
                    this.f22444c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22443b) {
                    this.f22444c.f22550x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22442a) {
            case 0:
                if (this.f22443b) {
                    this.f22444c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22443b) {
                    this.f22444c.f22550x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
