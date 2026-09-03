package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fv0 extends AnimatorListenerAdapter {
    public final int f34234a;
    public final mv0 f34235b;

    public fv0(mv0 mv0Var, int i10) {
        this.f34234a = i10;
        this.f34235b = mv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34234a) {
            case 0:
                this.f34235b.O.setTranslationY(0.0f);
                return;
            case 1:
                this.f34235b.O.setTranslationY(0.0f);
                return;
            default:
                mv0 mv0Var = this.f34235b;
                mv0Var.getClass();
                mv0Var.O.setTranslationY(0.0f);
                mv0Var.l0();
                return;
        }
    }
}
