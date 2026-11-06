package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g81 extends AnimatorListenerAdapter {
    public final int f45895a;
    public final h81 f45896b;

    public g81(h81 h81Var, int i7) {
        this.f45895a = i7;
        this.f45896b = h81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45895a) {
            case 0:
                this.f45896b.f46272b.f47706s.setVisibility(8);
                return;
            default:
                this.f45896b.f46272b.f47699a.setVisibility(8);
                return;
        }
    }
}
