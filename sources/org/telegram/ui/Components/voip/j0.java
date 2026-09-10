package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f28189a;
    public final m0 f28190b;

    public j0(m0 m0Var, t tVar) {
        this.f28190b = m0Var;
        this.f28189a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f28189a;
        if (tVar.getParent() != null) {
            this.f28190b.removeView(tVar);
            tVar.e();
        }
    }
}
