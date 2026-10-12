package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f30263a;
    public final l0 f30264b;

    public k0(l0 l0Var, t tVar) {
        this.f30264b = l0Var;
        this.f30263a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f30263a;
        if (tVar.getParent() != null) {
            this.f30264b.removeView(tVar);
            tVar.e();
        }
    }
}
