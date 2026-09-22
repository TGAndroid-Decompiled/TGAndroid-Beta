package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20308a;
    public final boolean f20309b;
    public final m8 f20310c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20308a = i10;
        this.f20310c = m8Var;
        this.f20309b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20308a) {
            case 0:
                if (!this.f20309b) {
                    this.f20310c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20309b) {
                    this.f20310c.f20428x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20308a) {
            case 0:
                if (this.f20309b) {
                    this.f20310c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20309b) {
                    this.f20310c.f20428x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
