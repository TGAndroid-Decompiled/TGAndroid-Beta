package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d1 extends AnimatorListenerAdapter {
    public final g1 f29594a;

    public d1(g1 g1Var) {
        this.f29594a = g1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g1 g1Var = this.f29594a;
        g1Var.f29638b.removeViewImmediate(g1Var.d);
        g1Var.f29640f.d.release();
        g1Var.v = null;
        g1Var.f29644w = true;
        g1Var.f29645x = false;
        g1Var.G = null;
        g1Var.E = false;
    }
}
