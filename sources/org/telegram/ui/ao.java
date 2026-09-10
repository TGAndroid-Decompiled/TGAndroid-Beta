package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ao extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.lc0 f31044a;

    public ao(org.telegram.ui.Components.lc0 lc0Var) {
        this.f31044a = lc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f31044a.s(1.0f);
    }
}
