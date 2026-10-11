package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final v f32116a;
    public final n0 f32117b;

    public k0(n0 n0Var, v vVar) {
        this.f32117b = n0Var;
        this.f32116a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v vVar = this.f32116a;
        if (vVar.getParent() != null) {
            this.f32117b.removeView(vVar);
            vVar.e();
        }
    }
}
