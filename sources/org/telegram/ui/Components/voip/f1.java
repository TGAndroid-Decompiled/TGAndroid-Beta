package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final i1 f33900a;

    public f1(i1 i1Var) {
        this.f33900a = i1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i1 i1Var = this.f33900a;
        i1Var.f33952b.removeViewImmediate(i1Var.d);
        i1Var.f33954f.d.release();
        i1Var.v = null;
        i1Var.f33958w = true;
        i1Var.f33959x = false;
        i1Var.J = null;
        i1Var.H = false;
    }
}
