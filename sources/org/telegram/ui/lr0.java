package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lr0 extends AnimatorListenerAdapter {
    public final int f47680a;
    public final sr0 f47681b;

    public lr0(sr0 sr0Var, int i7) {
        this.f47680a = i7;
        this.f47681b = sr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47680a) {
            case 0:
                this.f47681b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f47681b.R.setTranslationY(0.0f);
                return;
            default:
                sr0 sr0Var = this.f47681b;
                sr0Var.getClass();
                sr0Var.R.setTranslationY(0.0f);
                sr0Var.q0();
                return;
        }
    }
}
