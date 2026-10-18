package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f31391a;
    public final l0 f31392b;

    public b0(l0 l0Var, t tVar) {
        this.f31392b = l0Var;
        this.f31391a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f31392b;
        l0Var.f31589x.unlock();
        l0Var.f31580r = null;
        this.f31391a.f31775r = false;
        if (!l0Var.f31561b) {
            l0Var.d();
            l0Var.f31591y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f31561b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f31563c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f31561b) {
            l0Var.f31573k0.setVisibility(8);
            l0Var.f31574l0.setVisibility(8);
            l0Var.f31566e0.setVisibility(8);
            l0Var.f31568f0.setVisibility(8);
        }
    }
}
