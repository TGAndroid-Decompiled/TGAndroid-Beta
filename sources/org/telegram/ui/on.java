package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class on extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.yc0 f40232a;

    public on(org.telegram.ui.Components.yc0 yc0Var) {
        this.f40232a = yc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40232a.r(1.0f);
    }
}
