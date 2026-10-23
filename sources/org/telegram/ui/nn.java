package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.wc0 f39661a;

    public nn(org.telegram.ui.Components.wc0 wc0Var) {
        this.f39661a = wc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39661a.r(1.0f);
    }
}
