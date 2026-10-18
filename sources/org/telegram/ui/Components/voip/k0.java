package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31534a;
    public final l0 f31535b;

    public k0(l0 l0Var, t tVar) {
        this.f31535b = l0Var;
        this.f31534a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31534a;
        if (tVar.getParent() != null) {
            this.f31535b.removeView(tVar);
            tVar.e();
        }
    }
}
