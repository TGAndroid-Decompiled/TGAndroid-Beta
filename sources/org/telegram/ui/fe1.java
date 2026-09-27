package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fe1 extends AnimatorListenerAdapter {
    public final int f33533a;
    public final ge1 f33534b;

    public fe1(ge1 ge1Var, int i10) {
        this.f33533a = i10;
        this.f33534b = ge1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33533a) {
            case 0:
                this.f33534b.h.f35334s.setVisibility(8);
                return;
            default:
                this.f33534b.h.f35328a.setVisibility(8);
                return;
        }
    }
}
