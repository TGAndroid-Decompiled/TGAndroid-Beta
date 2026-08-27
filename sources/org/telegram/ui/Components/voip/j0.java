package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class j0 extends AnimatorListenerAdapter {

    public final t f33635a;

    public final k0 f33636b;

    public j0(k0 k0Var, t tVar) {
        this.f33636b = k0Var;
        this.f33635a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.f33635a;
        if (tVar.getParent() != null) {
            this.f33636b.removeView(tVar);
            tVar.e();
        }
    }
}
