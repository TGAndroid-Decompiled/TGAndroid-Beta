package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c40 extends AnimatorListenerAdapter {
    public final v50 f38245a;

    public c40(v50 v50Var) {
        this.f38245a = v50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38245a.X0 = null;
    }
}
