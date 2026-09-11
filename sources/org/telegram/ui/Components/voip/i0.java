package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31543a;
    public final l0 f31544b;

    public i0(l0 l0Var, t tVar) {
        this.f31544b = l0Var;
        this.f31543a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31543a;
        if (tVar.getParent() != null) {
            this.f31544b.removeView(tVar);
            tVar.e();
        }
    }
}
