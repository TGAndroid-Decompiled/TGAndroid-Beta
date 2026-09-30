package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ee1 extends AnimatorListenerAdapter {
    public final int f33376a;
    public final fe1 f33377b;

    public ee1(fe1 fe1Var, int i10) {
        this.f33376a = i10;
        this.f33377b = fe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33376a) {
            case 0:
                this.f33377b.h.f35328s.setVisibility(8);
                return;
            default:
                this.f33377b.h.f35322a.setVisibility(8);
                return;
        }
    }
}
