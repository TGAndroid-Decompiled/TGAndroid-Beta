package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e1 extends AnimatorListenerAdapter {
    public final h1 f31468a;

    public e1(h1 h1Var) {
        this.f31468a = h1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var = this.f31468a;
        h1Var.f31519b.removeViewImmediate(h1Var.d);
        h1Var.f31522f.d.release();
        h1Var.v = null;
        h1Var.f31526w = true;
        h1Var.f31527x = false;
        h1Var.J = null;
        h1Var.H = false;
    }
}
