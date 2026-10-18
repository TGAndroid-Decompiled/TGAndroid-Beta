package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class on extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.wc0 f39832a;

    public on(org.telegram.ui.Components.wc0 wc0Var) {
        this.f39832a = wc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39832a.r(1.0f);
    }
}
