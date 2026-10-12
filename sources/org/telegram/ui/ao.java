package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ao extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.gd0 f35911a;

    public ao(org.telegram.ui.Components.gd0 gd0Var) {
        this.f35911a = gd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f35911a.s(1.0f);
    }
}
