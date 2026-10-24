package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class on extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.wc0 f40220a;

    public on(org.telegram.ui.Components.wc0 wc0Var) {
        this.f40220a = wc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40220a.r(1.0f);
    }
}
