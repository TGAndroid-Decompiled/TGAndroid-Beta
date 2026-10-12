package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22121a;
    public final boolean f22122b;
    public final m8 f22123c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22121a = i10;
        this.f22123c = m8Var;
        this.f22122b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22121a) {
            case 0:
                if (!this.f22122b) {
                    this.f22123c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22122b) {
                    this.f22123c.f22235x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22121a) {
            case 0:
                if (this.f22122b) {
                    this.f22123c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22122b) {
                    this.f22123c.f22235x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
