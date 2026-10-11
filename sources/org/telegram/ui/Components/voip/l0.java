package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final v f32148a;
    public final v f32149b;
    public final n0 f32150c;

    public l0(n0 n0Var, v vVar, v vVar2) {
        this.f32150c = n0Var;
        this.f32148a = vVar;
        this.f32149b = vVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f32150c;
        n0Var.N0 = null;
        this.f32148a.E = false;
        v vVar = n0Var.E;
        if (vVar != null) {
            if (vVar.getParent() != null) {
                n0Var.removeView(n0Var.E);
                this.f32149b.e();
            }
            n0Var.E = null;
        }
    }
}
