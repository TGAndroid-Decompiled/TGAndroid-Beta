package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f31650a;
    public final l0 f31651b;

    public k0(l0 l0Var, t tVar) {
        this.f31651b = l0Var;
        this.f31650a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f31650a;
        if (tVar.getParent() != null) {
            this.f31651b.removeView(tVar);
            tVar.e();
        }
    }
}
