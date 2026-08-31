package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final u f32087a;
    public final l0 f32088b;

    public i0(l0 l0Var, u uVar) {
        this.f32088b = l0Var;
        this.f32087a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f32087a;
        if (uVar.getParent() != null) {
            this.f32088b.removeView(uVar);
            uVar.e();
        }
    }
}
