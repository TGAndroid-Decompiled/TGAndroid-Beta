package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class rk extends AnimatorListenerAdapter {
    public final int f30169a = 0;
    public final org.telegram.ui.cr f30170b;

    public rk(org.telegram.ui.cr crVar) {
        this.f30170b = crVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30169a) {
            case 0:
                ((tk) this.f30170b.d).U.unlock();
                return;
            default:
                org.telegram.ui.cr crVar = this.f30170b;
                View view = crVar.f36499b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((tk) crVar.d).X.f31186r.removeView(view);
                return;
        }
    }

    public rk(org.telegram.ui.cr crVar, s4.p0 p0Var) {
        this.f30170b = crVar;
    }
}
