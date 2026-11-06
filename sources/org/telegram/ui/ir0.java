package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ir0 extends AnimatorListenerAdapter {
    public final int f46732a;
    public final pr0 f46733b;

    public ir0(pr0 pr0Var, int i7) {
        this.f46732a = i7;
        this.f46733b = pr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46732a) {
            case 0:
                this.f46733b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f46733b.R.setTranslationY(0.0f);
                return;
            default:
                pr0 pr0Var = this.f46733b;
                pr0Var.getClass();
                pr0Var.R.setTranslationY(0.0f);
                pr0Var.q0();
                return;
        }
    }
}
