package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31651a;
    public final l0 f31652b;

    public i0(l0 l0Var, t tVar) {
        this.f31652b = l0Var;
        this.f31651a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31651a;
        if (tVar.getParent() != null) {
            this.f31652b.removeView(tVar);
            tVar.e();
        }
    }
}
