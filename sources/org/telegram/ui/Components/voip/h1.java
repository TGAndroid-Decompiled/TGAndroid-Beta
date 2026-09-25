package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1 extends AnimatorListenerAdapter {
    public final k1 f29380a;

    public h1(k1 k1Var) {
        this.f29380a = k1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.f29380a;
        k1Var.f29424b.removeViewImmediate(k1Var.d);
        k1Var.f29426f.d.release();
        k1Var.v = null;
        k1Var.f29430w = true;
        k1Var.f29431x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
