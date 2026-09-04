package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31412a;
    public final l0 f31413b;

    public b0(l0 l0Var, t tVar) {
        this.f31413b = l0Var;
        this.f31412a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31413b;
        l0Var.f31626x.unlock();
        l0Var.f31617r = null;
        this.f31412a.f31826r = false;
        if (!l0Var.f31597b) {
            l0Var.d();
            l0Var.f31628y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31597b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31599c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31597b) {
            l0Var.f31610k0.setVisibility(8);
            l0Var.f31611l0.setVisibility(8);
            l0Var.f31603e0.setVisibility(8);
            l0Var.f31605f0.setVisibility(8);
        }
    }
}
