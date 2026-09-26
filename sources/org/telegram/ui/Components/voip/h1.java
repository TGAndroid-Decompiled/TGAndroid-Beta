package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1 extends AnimatorListenerAdapter {
    public final k1 f29379a;

    public h1(k1 k1Var) {
        this.f29379a = k1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.f29379a;
        k1Var.f29423b.removeViewImmediate(k1Var.d);
        k1Var.f29425f.d.release();
        k1Var.v = null;
        k1Var.f29429w = true;
        k1Var.f29430x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
