package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f32090a;
    public final u f32091b;
    public final m0 f32092c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f32092c = m0Var;
        this.f32090a = uVar;
        this.f32091b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f32092c;
        m0Var.N0 = null;
        this.f32090a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f32091b.e();
            }
            m0Var.E = null;
        }
    }
}
