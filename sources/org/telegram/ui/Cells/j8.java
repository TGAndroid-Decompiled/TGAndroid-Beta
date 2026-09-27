package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20541a;
    public final boolean f20542b;
    public final m8 f20543c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20541a = i10;
        this.f20543c = m8Var;
        this.f20542b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20541a) {
            case 0:
                if (!this.f20542b) {
                    this.f20543c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20542b) {
                    this.f20543c.f20654x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20541a) {
            case 0:
                if (this.f20542b) {
                    this.f20543c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20542b) {
                    this.f20543c.f20654x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
