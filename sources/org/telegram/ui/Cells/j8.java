package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22359a;
    public final boolean f22360b;
    public final m8 f22361c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22359a = i10;
        this.f22361c = m8Var;
        this.f22360b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22359a) {
            case 0:
                if (!this.f22360b) {
                    this.f22361c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22360b) {
                    this.f22361c.f22481x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22359a) {
            case 0:
                if (this.f22360b) {
                    this.f22361c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22360b) {
                    this.f22361c.f22481x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
