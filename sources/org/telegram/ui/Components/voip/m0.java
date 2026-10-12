package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final v f31786a;
    public final n0 f31787b;

    public m0(n0 n0Var, v vVar) {
        this.f31787b = n0Var;
        this.f31786a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v vVar = this.f31786a;
        if (vVar.getParent() != null) {
            this.f31787b.removeView(vVar);
            vVar.e();
        }
    }
}
