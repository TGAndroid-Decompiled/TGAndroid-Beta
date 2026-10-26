package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f33732a;
    public final l0 f33733b;

    public b0(l0 l0Var, t tVar) {
        this.f33733b = l0Var;
        this.f33732a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f33733b;
        l0Var.f33931x.unlock();
        l0Var.f33922r = null;
        this.f33732a.f34095r = false;
        if (!l0Var.f33903b) {
            l0Var.d();
            l0Var.f33933y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f33903b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f33905c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f33903b) {
            l0Var.f33915k0.setVisibility(8);
            l0Var.f33916l0.setVisibility(8);
            l0Var.f33908e0.setVisibility(8);
            l0Var.f33910f0.setVisibility(8);
        }
    }
}
