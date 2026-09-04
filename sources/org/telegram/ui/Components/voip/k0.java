package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31575a;
    public final l0 f31576b;

    public k0(l0 l0Var, t tVar) {
        this.f31576b = l0Var;
        this.f31575a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31575a;
        if (tVar.getParent() != null) {
            this.f31576b.removeView(tVar);
            tVar.e();
        }
    }
}
