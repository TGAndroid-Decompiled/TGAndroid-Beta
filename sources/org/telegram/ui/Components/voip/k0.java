package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31680a;
    public final l0 f31681b;

    public k0(l0 l0Var, t tVar) {
        this.f31681b = l0Var;
        this.f31680a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31680a;
        if (tVar.getParent() != null) {
            this.f31681b.removeView(tVar);
            tVar.e();
        }
    }
}
