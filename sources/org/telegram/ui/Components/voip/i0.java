package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f30224a;
    public final l0 f30225b;

    public i0(l0 l0Var, t tVar) {
        this.f30225b = l0Var;
        this.f30224a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f30224a;
        if (tVar.getParent() != null) {
            this.f30225b.removeView(tVar);
            tVar.e();
        }
    }
}
