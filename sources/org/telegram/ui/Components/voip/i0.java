package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31470a;
    public final l0 f31471b;

    public i0(l0 l0Var, t tVar) {
        this.f31471b = l0Var;
        this.f31470a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31470a;
        if (tVar.getParent() != null) {
            this.f31471b.removeView(tVar);
            tVar.e();
        }
    }
}
