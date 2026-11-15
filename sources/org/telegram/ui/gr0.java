package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gr0 extends AnimatorListenerAdapter {
    public final int f47505a;
    public final nr0 f47506b;

    public gr0(nr0 nr0Var, int i7) {
        this.f47505a = i7;
        this.f47506b = nr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47505a) {
            case 0:
                this.f47506b.S.setTranslationY(0.0f);
                return;
            case 1:
                this.f47506b.S.setTranslationY(0.0f);
                return;
            default:
                nr0 nr0Var = this.f47506b;
                nr0Var.getClass();
                nr0Var.S.setTranslationY(0.0f);
                nr0Var.q0();
                return;
        }
    }
}
