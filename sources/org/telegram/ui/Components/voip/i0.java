package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final t f31514a;
    public final l0 f31515b;

    public i0(l0 l0Var, t tVar) {
        this.f31515b = l0Var;
        this.f31514a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31514a;
        if (tVar.getParent() != null) {
            this.f31515b.removeView(tVar);
            tVar.e();
        }
    }
}
