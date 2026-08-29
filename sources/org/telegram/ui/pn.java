package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.yb0 f41437a;

    public pn(org.telegram.ui.Components.yb0 yb0Var) {
        this.f41437a = yb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41437a.s(1.0f);
    }
}
