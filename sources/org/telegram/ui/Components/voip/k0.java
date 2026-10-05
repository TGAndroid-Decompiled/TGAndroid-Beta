package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f31999a;
    public final u f32000b;
    public final m0 f32001c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f32001c = m0Var;
        this.f31999a = uVar;
        this.f32000b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f32001c;
        m0Var.N0 = null;
        this.f31999a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f32000b.e();
            }
            m0Var.E = null;
        }
    }
}
