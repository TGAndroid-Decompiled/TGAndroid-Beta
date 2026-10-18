package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.wc0 f40173a;

    public pn(org.telegram.ui.Components.wc0 wc0Var) {
        this.f40173a = wc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40173a.r(1.0f);
    }
}
