package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final u f33618a;
    public final l0 f33619b;

    public b0(l0 l0Var, u uVar) {
        this.f33619b = l0Var;
        this.f33618a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        l0 l0Var = this.f33619b;
        l0Var.f33825x.unlock();
        l0Var.f33816r = null;
        this.f33618a.f34036r = false;
        if (!l0Var.f33796b) {
            l0Var.d();
            l0Var.f33827y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f33796b) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        l0Var.f33798c = f9;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f33796b) {
            l0Var.f33805g0.setVisibility(8);
            l0Var.f33806h0.setVisibility(8);
            l0Var.f33795a0.setVisibility(8);
            l0Var.f33797b0.setVisibility(8);
        }
    }
}
