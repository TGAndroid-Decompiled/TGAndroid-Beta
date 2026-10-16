package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ao extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.cd0 f34000a;

    public ao(org.telegram.ui.Components.cd0 cd0Var) {
        this.f34000a = cd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f34000a.s(1.0f);
    }
}
