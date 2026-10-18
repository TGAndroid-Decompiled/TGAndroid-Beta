package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31541a;
    public final l0 f31542b;

    public k0(l0 l0Var, t tVar) {
        this.f31542b = l0Var;
        this.f31541a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31541a;
        if (tVar.getParent() != null) {
            this.f31542b.removeView(tVar);
            tVar.e();
        }
    }
}
