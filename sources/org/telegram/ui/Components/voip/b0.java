package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final t f29772a;
    public final l0 f29773b;

    public b0(l0 l0Var, t tVar) {
        this.f29773b = l0Var;
        this.f29772a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        l0 l0Var = this.f29773b;
        l0Var.f29978x.unlock();
        l0Var.f29969r = null;
        this.f29772a.f30166r = false;
        if (!l0Var.f29950b) {
            l0Var.d();
            l0Var.f29980y = null;
            l0Var.d = 0L;
        }
        if (l0Var.f29950b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        l0Var.f29952c = f7;
        l0Var.l();
        l0Var.i(false);
        if (!l0Var.f29950b) {
            l0Var.f29962k0.setVisibility(8);
            l0Var.f29963l0.setVisibility(8);
            l0Var.f29955e0.setVisibility(8);
            l0Var.f29957f0.setVisibility(8);
        }
    }
}
