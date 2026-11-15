package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gr0 extends AnimatorListenerAdapter {
    public final int f47515a;
    public final nr0 f47516b;

    public gr0(nr0 nr0Var, int i7) {
        this.f47515a = i7;
        this.f47516b = nr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47515a) {
            case 0:
                this.f47516b.S.setTranslationY(0.0f);
                return;
            case 1:
                this.f47516b.S.setTranslationY(0.0f);
                return;
            default:
                nr0 nr0Var = this.f47516b;
                nr0Var.getClass();
                nr0Var.S.setTranslationY(0.0f);
                nr0Var.q0();
                return;
        }
    }
}
