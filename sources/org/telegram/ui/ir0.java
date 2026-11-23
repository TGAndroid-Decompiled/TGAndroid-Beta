package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ir0 extends AnimatorListenerAdapter {
    public final int f48909a;
    public final pr0 f48910b;

    public ir0(pr0 pr0Var, int i7) {
        this.f48909a = i7;
        this.f48910b = pr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48909a) {
            case 0:
                this.f48910b.S.setTranslationY(0.0f);
                return;
            case 1:
                this.f48910b.S.setTranslationY(0.0f);
                return;
            default:
                pr0 pr0Var = this.f48910b;
                pr0Var.getClass();
                pr0Var.S.setTranslationY(0.0f);
                pr0Var.q0();
                return;
        }
    }
}
