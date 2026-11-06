package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hr0 extends AnimatorListenerAdapter {
    public final int f46473a;
    public final or0 f46474b;

    public hr0(or0 or0Var, int i7) {
        this.f46473a = i7;
        this.f46474b = or0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46473a) {
            case 0:
                this.f46474b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f46474b.R.setTranslationY(0.0f);
                return;
            default:
                or0 or0Var = this.f46474b;
                or0Var.getClass();
                or0Var.R.setTranslationY(0.0f);
                or0Var.q0();
                return;
        }
    }
}
