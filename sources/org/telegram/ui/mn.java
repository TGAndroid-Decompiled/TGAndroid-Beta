package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.jb0 f40495a;

    public mn(org.telegram.ui.Components.jb0 jb0Var) {
        this.f40495a = jb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40495a.s(1.0f);
    }
}
