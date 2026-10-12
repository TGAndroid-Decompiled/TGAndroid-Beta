package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final v f31738a;
    public final n0 f31739b;

    public k0(n0 n0Var, v vVar) {
        this.f31739b = n0Var;
        this.f31738a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v vVar = this.f31738a;
        if (vVar.getParent() != null) {
            this.f31739b.removeView(vVar);
            vVar.e();
        }
    }
}
