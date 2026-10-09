package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f32025a;
    public final u f32026b;
    public final m0 f32027c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f32027c = m0Var;
        this.f32025a = uVar;
        this.f32026b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f32027c;
        m0Var.N0 = null;
        this.f32025a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f32026b.e();
            }
            m0Var.E = null;
        }
    }
}
