package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class nn extends AnimatorListenerAdapter {

    public final org.telegram.ui.Components.nb0 f40888a;

    public nn(org.telegram.ui.Components.nb0 nb0Var) {
        this.f40888a = nb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40888a.s(1.0f);
    }
}
