package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31494a;
    public final l0 f31495b;

    public k0(l0 l0Var, t tVar) {
        this.f31495b = l0Var;
        this.f31494a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31494a;
        if (tVar.getParent() != null) {
            this.f31495b.removeView(tVar);
            tVar.e();
        }
    }
}
