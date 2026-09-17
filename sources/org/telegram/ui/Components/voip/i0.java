package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31571a;
    public final l0 f31572b;

    public i0(l0 l0Var, t tVar) {
        this.f31572b = l0Var;
        this.f31571a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31571a;
        if (tVar.getParent() != null) {
            this.f31572b.removeView(tVar);
            tVar.e();
        }
    }
}
