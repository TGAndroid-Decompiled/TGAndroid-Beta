package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne1 extends AnimatorListenerAdapter {
    public final int f40193a;
    public final oe1 f40194b;

    public ne1(oe1 oe1Var, int i10) {
        this.f40193a = i10;
        this.f40194b = oe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40193a) {
            case 0:
                this.f40194b.h.f42419s.setVisibility(8);
                return;
            default:
                this.f40194b.h.f42412a.setVisibility(8);
                return;
        }
    }
}
