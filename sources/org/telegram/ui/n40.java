package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n40 extends AnimatorListenerAdapter {
    public final f60 f35433a;

    public n40(f60 f60Var) {
        this.f35433a = f60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35433a.X0 = null;
    }
}
