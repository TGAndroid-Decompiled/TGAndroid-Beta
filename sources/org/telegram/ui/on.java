package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class on extends AnimatorListenerAdapter {

    public final org.telegram.ui.Components.nb0 f41141a;

    public on(org.telegram.ui.Components.nb0 nb0Var) {
        this.f41141a = nb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41141a.s(1.0f);
    }
}
