package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31512a;
    public final l0 f31513b;

    public i0(l0 l0Var, t tVar) {
        this.f31513b = l0Var;
        this.f31512a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31512a;
        if (tVar.getParent() != null) {
            this.f31513b.removeView(tVar);
            tVar.e();
        }
    }
}
