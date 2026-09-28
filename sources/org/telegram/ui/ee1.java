package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ee1 extends AnimatorListenerAdapter {
    public final int f33388a;
    public final fe1 f33389b;

    public ee1(fe1 fe1Var, int i10) {
        this.f33388a = i10;
        this.f33389b = fe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33388a) {
            case 0:
                this.f33389b.h.f35346s.setVisibility(8);
                return;
            default:
                this.f33389b.h.f35340a.setVisibility(8);
                return;
        }
    }
}
