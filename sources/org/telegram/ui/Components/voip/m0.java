package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final v f32165a;
    public final n0 f32166b;

    public m0(n0 n0Var, v vVar) {
        this.f32166b = n0Var;
        this.f32165a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v vVar = this.f32165a;
        if (vVar.getParent() != null) {
            this.f32166b.removeView(vVar);
            vVar.e();
        }
    }
}
