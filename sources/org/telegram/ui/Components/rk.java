package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class rk extends AnimatorListenerAdapter {
    public final int f30173a = 0;
    public final org.telegram.ui.cr f30174b;

    public rk(org.telegram.ui.cr crVar) {
        this.f30174b = crVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30173a) {
            case 0:
                ((tk) this.f30174b.d).U.unlock();
                return;
            default:
                org.telegram.ui.cr crVar = this.f30174b;
                View view = crVar.f36497b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((tk) crVar.d).X.f31194r.removeView(view);
                return;
        }
    }

    public rk(org.telegram.ui.cr crVar, s4.p0 p0Var) {
        this.f30174b = crVar;
    }
}
