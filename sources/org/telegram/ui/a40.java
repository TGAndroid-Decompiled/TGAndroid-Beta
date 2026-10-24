package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a40 extends AnimatorListenerAdapter {
    public final u50 f35575a;

    public a40(u50 u50Var) {
        this.f35575a = u50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35575a.X0 = null;
    }
}
