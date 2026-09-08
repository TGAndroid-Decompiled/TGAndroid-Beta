package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31602a;
    public final l0 f31603b;

    public k0(l0 l0Var, t tVar) {
        this.f31603b = l0Var;
        this.f31602a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31602a;
        if (tVar.getParent() != null) {
            this.f31603b.removeView(tVar);
            tVar.e();
        }
    }
}
