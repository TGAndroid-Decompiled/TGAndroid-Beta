package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20540a;
    public final boolean f20541b;
    public final m8 f20542c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20540a = i10;
        this.f20542c = m8Var;
        this.f20541b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20540a) {
            case 0:
                if (!this.f20541b) {
                    this.f20542c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20541b) {
                    this.f20542c.f20653x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20540a) {
            case 0:
                if (this.f20541b) {
                    this.f20542c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20541b) {
                    this.f20542c.f20653x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
