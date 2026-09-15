package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20333a;
    public final boolean f20334b;
    public final m8 f20335c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20333a = i10;
        this.f20335c = m8Var;
        this.f20334b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20333a) {
            case 0:
                if (!this.f20334b) {
                    this.f20335c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20334b) {
                    this.f20335c.f20441x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20333a) {
            case 0:
                if (this.f20334b) {
                    this.f20335c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20334b) {
                    this.f20335c.f20441x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
