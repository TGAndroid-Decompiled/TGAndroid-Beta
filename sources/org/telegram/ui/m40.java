package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m40 extends AnimatorListenerAdapter {
    public final d60 f38962a;

    public m40(d60 d60Var) {
        this.f38962a = d60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38962a.U0 = null;
    }
}
