package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final u f31629a;
    public final n0 f31630b;

    public d0(n0 n0Var, u uVar) {
        this.f31630b = n0Var;
        this.f31629a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        n0 n0Var = this.f31630b;
        n0Var.f31843x.unlock();
        n0Var.f31834r = null;
        this.f31629a.f32017r = false;
        if (!n0Var.f31814b) {
            n0Var.d();
            n0Var.f31845y = null;
            n0Var.d = 0L;
        }
        if (n0Var.f31814b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        n0Var.f31816c = f7;
        n0Var.l();
        n0Var.i(false);
        if (!n0Var.f31814b) {
            n0Var.f31827k0.setVisibility(8);
            n0Var.f31828l0.setVisibility(8);
            n0Var.f31820e0.setVisibility(8);
            n0Var.f31822f0.setVisibility(8);
        }
    }
}
