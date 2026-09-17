package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f22195a;
    public final boolean f22196b;
    public final m8 f22197c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f22195a = i10;
        this.f22197c = m8Var;
        this.f22196b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22195a) {
            case 0:
                if (!this.f22196b) {
                    this.f22197c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f22196b) {
                    this.f22197c.f22304x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22195a) {
            case 0:
                if (this.f22196b) {
                    this.f22197c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f22196b) {
                    this.f22197c.f22304x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
