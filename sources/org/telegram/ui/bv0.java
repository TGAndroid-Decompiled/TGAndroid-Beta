package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bv0 extends AnimatorListenerAdapter {
    public final int f36176a;
    public final iv0 f36177b;

    public bv0(iv0 iv0Var, int i10) {
        this.f36176a = i10;
        this.f36177b = iv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36176a) {
            case 0:
                this.f36177b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f36177b.R.setTranslationY(0.0f);
                return;
            default:
                iv0 iv0Var = this.f36177b;
                iv0Var.getClass();
                iv0Var.R.setTranslationY(0.0f);
                iv0Var.l0();
                return;
        }
    }
}
