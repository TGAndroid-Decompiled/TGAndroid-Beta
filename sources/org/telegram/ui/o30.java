package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o30 extends AnimatorListenerAdapter {
    public final b50 f40126a;

    public o30(b50 b50Var) {
        this.f40126a = b50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40126a.O2 = null;
    }
}
