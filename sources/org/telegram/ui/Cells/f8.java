package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f8 extends AnimatorListenerAdapter {
    public final int f24369a;
    public final boolean f24370b;
    public final i8 f24371c;

    public f8(i8 i8Var, boolean z10, int i10) {
        this.f24369a = i10;
        this.f24371c = i8Var;
        this.f24370b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24369a) {
            case 0:
                if (!this.f24370b) {
                    this.f24371c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f24370b) {
                    this.f24371c.f24511x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f24369a) {
            case 0:
                if (this.f24370b) {
                    this.f24371c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f24370b) {
                    this.f24371c.f24511x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
