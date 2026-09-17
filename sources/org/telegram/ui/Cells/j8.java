package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20343a;
    public final boolean f20344b;
    public final m8 f20345c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20343a = i10;
        this.f20345c = m8Var;
        this.f20344b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20343a) {
            case 0:
                if (!this.f20344b) {
                    this.f20345c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20344b) {
                    this.f20345c.f20451x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20343a) {
            case 0:
                if (this.f20344b) {
                    this.f20345c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20344b) {
                    this.f20345c.f20451x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
