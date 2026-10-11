package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final v f32052a;
    public final n0 f32053b;

    public k0(n0 n0Var, v vVar) {
        this.f32053b = n0Var;
        this.f32052a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v vVar = this.f32052a;
        if (vVar.getParent() != null) {
            this.f32053b.removeView(vVar);
            vVar.e();
        }
    }
}
