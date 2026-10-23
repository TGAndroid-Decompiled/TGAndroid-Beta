package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.yc0 f40510a;

    public pn(org.telegram.ui.Components.yc0 yc0Var) {
        this.f40510a = yc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40510a.r(1.0f);
    }
}
