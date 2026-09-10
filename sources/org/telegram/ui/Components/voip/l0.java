package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final t f28225a;
    public final m0 f28226b;

    public l0(m0 m0Var, t tVar) {
        this.f28226b = m0Var;
        this.f28225a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f28225a;
        if (tVar.getParent() != null) {
            this.f28226b.removeView(tVar);
            tVar.e();
        }
    }
}
