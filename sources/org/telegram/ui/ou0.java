package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ou0 extends AnimatorListenerAdapter {
    public final int f41227a;
    public final vu0 f41228b;

    public ou0(vu0 vu0Var, int i10) {
        this.f41227a = i10;
        this.f41228b = vu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41227a) {
            case 0:
                this.f41228b.N.setTranslationY(0.0f);
                return;
            case 1:
                this.f41228b.N.setTranslationY(0.0f);
                return;
            default:
                vu0 vu0Var = this.f41228b;
                vu0Var.getClass();
                vu0Var.N.setTranslationY(0.0f);
                vu0Var.l0();
                return;
        }
    }
}
