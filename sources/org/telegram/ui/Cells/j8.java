package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f21416a;
    public final boolean f21417b;
    public final m8 f21418c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f21416a = i10;
        this.f21418c = m8Var;
        this.f21417b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21416a) {
            case 0:
                if (!this.f21417b) {
                    this.f21418c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f21417b) {
                    this.f21418c.f21528x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f21416a) {
            case 0:
                if (this.f21417b) {
                    this.f21418c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f21417b) {
                    this.f21418c.f21528x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
