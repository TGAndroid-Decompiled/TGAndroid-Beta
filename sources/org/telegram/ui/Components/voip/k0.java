package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f33878a;
    public final l0 f33879b;

    public k0(l0 l0Var, t tVar) {
        this.f33879b = l0Var;
        this.f33878a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33878a;
        if (tVar.getParent() != null) {
            this.f33879b.removeView(tVar);
            tVar.e();
        }
    }
}
