package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h0 extends AnimatorListenerAdapter {
    public final t f29638a;
    public final k0 f29639b;

    public h0(k0 k0Var, t tVar) {
        this.f29639b = k0Var;
        this.f29638a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f29638a;
        if (tVar.getParent() != null) {
            this.f29639b.removeView(tVar);
            tVar.e();
        }
    }
}
