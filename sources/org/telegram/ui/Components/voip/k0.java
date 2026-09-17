package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31576a;
    public final l0 f31577b;

    public k0(l0 l0Var, t tVar) {
        this.f31577b = l0Var;
        this.f31576a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31576a;
        if (tVar.getParent() != null) {
            this.f31577b.removeView(tVar);
            tVar.e();
        }
    }
}
