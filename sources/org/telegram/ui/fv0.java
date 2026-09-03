package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fv0 extends AnimatorListenerAdapter {
    public final int f36918a;
    public final mv0 f36919b;

    public fv0(mv0 mv0Var, int i10) {
        this.f36918a = i10;
        this.f36919b = mv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36918a) {
            case 0:
                this.f36919b.O.setTranslationY(0.0f);
                return;
            case 1:
                this.f36919b.O.setTranslationY(0.0f);
                return;
            default:
                mv0 mv0Var = this.f36919b;
                mv0Var.getClass();
                mv0Var.O.setTranslationY(0.0f);
                mv0Var.l0();
                return;
        }
    }
}
