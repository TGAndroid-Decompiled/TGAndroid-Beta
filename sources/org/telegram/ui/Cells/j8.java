package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22122a;
    public final boolean f22123b;
    public final m8 f22124c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22122a = i10;
        this.f22124c = m8Var;
        this.f22123b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22122a) {
            case 0:
                if (!this.f22123b) {
                    this.f22124c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22123b) {
                    this.f22124c.f22236x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22122a) {
            case 0:
                if (this.f22123b) {
                    this.f22124c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22123b) {
                    this.f22124c.f22236x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
