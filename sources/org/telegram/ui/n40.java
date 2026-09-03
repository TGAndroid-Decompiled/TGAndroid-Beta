package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n40 extends AnimatorListenerAdapter {
    public final e60 f36384a;

    public n40(e60 e60Var) {
        this.f36384a = e60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36384a.U0 = null;
    }
}
