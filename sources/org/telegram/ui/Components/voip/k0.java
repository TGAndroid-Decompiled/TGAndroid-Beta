package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f29932a;
    public final l0 f29933b;

    public k0(l0 l0Var, t tVar) {
        this.f29933b = l0Var;
        this.f29932a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f29932a;
        if (tVar.getParent() != null) {
            this.f29933b.removeView(tVar);
            tVar.e();
        }
    }
}
