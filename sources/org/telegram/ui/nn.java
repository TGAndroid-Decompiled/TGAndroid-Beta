package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.jb0 f40776a;

    public nn(org.telegram.ui.Components.jb0 jb0Var) {
        this.f40776a = jb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40776a.s(1.0f);
    }
}
