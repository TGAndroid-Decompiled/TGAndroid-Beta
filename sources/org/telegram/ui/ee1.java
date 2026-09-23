package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ee1 extends AnimatorListenerAdapter {
    public final int f32907a;
    public final fe1 f32908b;

    public ee1(fe1 fe1Var, int i10) {
        this.f32907a = i10;
        this.f32908b = fe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32907a) {
            case 0:
                this.f32908b.h.f34962s.setVisibility(8);
                return;
            default:
                this.f32908b.h.f34956a.setVisibility(8);
                return;
        }
    }
}
