package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kv0 extends AnimatorListenerAdapter {
    public final int f35147a;
    public final rv0 f35148b;

    public kv0(rv0 rv0Var, int i10) {
        this.f35147a = i10;
        this.f35148b = rv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35147a) {
            case 0:
                this.f35148b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f35148b.R.setTranslationY(0.0f);
                return;
            default:
                rv0 rv0Var = this.f35148b;
                rv0Var.getClass();
                rv0Var.R.setTranslationY(0.0f);
                rv0Var.l0();
                return;
        }
    }
}
