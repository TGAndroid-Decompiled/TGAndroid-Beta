package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31621a;
    public final l0 f31622b;

    public i0(l0 l0Var, t tVar) {
        this.f31622b = l0Var;
        this.f31621a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31621a;
        if (tVar.getParent() != null) {
            this.f31622b.removeView(tVar);
            tVar.e();
        }
    }
}
