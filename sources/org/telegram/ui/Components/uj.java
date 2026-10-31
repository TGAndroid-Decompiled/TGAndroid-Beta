package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class uj extends AnimatorListenerAdapter {
    public final int f30952a = 0;
    public final org.telegram.ui.uq f30953b;

    public uj(org.telegram.ui.uq uqVar) {
        this.f30953b = uqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30952a) {
            case 0:
                ((wj) this.f30953b.d).U.e();
                return;
            default:
                org.telegram.ui.uq uqVar = this.f30953b;
                View view = uqVar.f42515b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((wj) uqVar.d).X.f32487r.removeView(view);
                return;
        }
    }

    public uj(org.telegram.ui.uq uqVar, s4.n0 n0Var) {
        this.f30953b = uqVar;
    }
}
