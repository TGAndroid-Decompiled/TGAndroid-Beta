package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j8 extends AnimatorListenerAdapter {
    public final int f20344a;
    public final boolean f20345b;
    public final m8 f20346c;

    public j8(m8 m8Var, boolean z10, int i10) {
        this.f20344a = i10;
        this.f20346c = m8Var;
        this.f20345b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20344a) {
            case 0:
                if (!this.f20345b) {
                    this.f20346c.h.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f20345b) {
                    this.f20346c.f20452x.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20344a) {
            case 0:
                if (this.f20345b) {
                    this.f20346c.h.setVisibility(0);
                    return;
                }
                return;
            default:
                if (this.f20345b) {
                    this.f20346c.f20452x.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
