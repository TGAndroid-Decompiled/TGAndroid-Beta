package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20556a;
    public final boolean f20557b;
    public final m8 f20558c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20556a = i10;
        this.f20558c = m8Var;
        this.f20557b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20556a) {
            case 0:
                if (!this.f20557b) {
                    this.f20558c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20557b) {
                    this.f20558c.f20669x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20556a) {
            case 0:
                if (this.f20557b) {
                    this.f20558c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20557b) {
                    this.f20558c.f20669x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
