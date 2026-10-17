package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.wc0 f40196a;

    public pn(org.telegram.ui.Components.wc0 wc0Var) {
        this.f40196a = wc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40196a.r(1.0f);
    }
}
