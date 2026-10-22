package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31469a;
    public final l0 f31470b;

    public i0(l0 l0Var, t tVar) {
        this.f31470b = l0Var;
        this.f31469a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31469a;
        if (tVar.getParent() != null) {
            this.f31470b.removeView(tVar);
            tVar.e();
        }
    }
}
