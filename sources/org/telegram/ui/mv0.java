package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f35392a;
    public final tv0 f35393b;

    public mv0(tv0 tv0Var, int i10) {
        this.f35392a = i10;
        this.f35393b = tv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35392a) {
            case 0:
                this.f35393b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f35393b.R.setTranslationY(0.0f);
                return;
            default:
                tv0 tv0Var = this.f35393b;
                tv0Var.getClass();
                tv0Var.R.setTranslationY(0.0f);
                tv0Var.l0();
                return;
        }
    }
}
