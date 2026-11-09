package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kr0 extends AnimatorListenerAdapter {
    public final int f47356a;
    public final rr0 f47357b;

    public kr0(rr0 rr0Var, int i7) {
        this.f47356a = i7;
        this.f47357b = rr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47356a) {
            case 0:
                this.f47357b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f47357b.R.setTranslationY(0.0f);
                return;
            default:
                rr0 rr0Var = this.f47357b;
                rr0Var.getClass();
                rr0Var.R.setTranslationY(0.0f);
                rr0Var.q0();
                return;
        }
    }
}
