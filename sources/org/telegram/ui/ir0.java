package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ir0 extends AnimatorListenerAdapter {
    public final int f48809a;
    public final pr0 f48810b;

    public ir0(pr0 pr0Var, int i7) {
        this.f48809a = i7;
        this.f48810b = pr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48809a) {
            case 0:
                this.f48810b.S.setTranslationY(0.0f);
                return;
            case 1:
                this.f48810b.S.setTranslationY(0.0f);
                return;
            default:
                pr0 pr0Var = this.f48810b;
                pr0Var.getClass();
                pr0Var.S.setTranslationY(0.0f);
                pr0Var.q0();
                return;
        }
    }
}
