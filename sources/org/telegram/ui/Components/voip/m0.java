package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final v f32101a;
    public final n0 f32102b;

    public m0(n0 n0Var, v vVar) {
        this.f32102b = n0Var;
        this.f32101a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v vVar = this.f32101a;
        if (vVar.getParent() != null) {
            this.f32102b.removeView(vVar);
            vVar.e();
        }
    }
}
