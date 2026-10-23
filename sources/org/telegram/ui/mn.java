package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.wc0 f39321a;

    public mn(org.telegram.ui.Components.wc0 wc0Var) {
        this.f39321a = wc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39321a.r(1.0f);
    }
}
