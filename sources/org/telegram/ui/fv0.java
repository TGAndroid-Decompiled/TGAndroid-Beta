package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fv0 extends AnimatorListenerAdapter {
    public final int f39480a;
    public final mv0 f39481b;

    public fv0(mv0 mv0Var, int i10) {
        this.f39480a = i10;
        this.f39481b = mv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39480a) {
            case 0:
                this.f39481b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f39481b.R.setTranslationY(0.0f);
                return;
            default:
                mv0 mv0Var = this.f39481b;
                mv0Var.getClass();
                mv0Var.R.setTranslationY(0.0f);
                mv0Var.m0();
                return;
        }
    }
}
