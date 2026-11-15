package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p20 extends AnimatorListenerAdapter {
    public final c40 f50091a;

    public p20(c40 c40Var) {
        this.f50091a = c40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f50091a.S2 = null;
    }
}
