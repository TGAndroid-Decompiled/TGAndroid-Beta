package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31505a;
    public final l0 f31506b;

    public i0(l0 l0Var, t tVar) {
        this.f31506b = l0Var;
        this.f31505a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31505a;
        if (tVar.getParent() != null) {
            this.f31506b.removeView(tVar);
            tVar.e();
        }
    }
}
