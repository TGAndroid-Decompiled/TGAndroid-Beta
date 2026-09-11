package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class lk extends AnimatorListenerAdapter {
    public final int f28187a = 0;
    public final org.telegram.ui.cr f28188b;

    public lk(org.telegram.ui.cr crVar) {
        this.f28188b = crVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28187a) {
            case 0:
                ((nk) this.f28188b.d).U.unlock();
                return;
            default:
                org.telegram.ui.cr crVar = this.f28188b;
                View view = crVar.f35524b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((nk) crVar.d).X.f29092r.removeView(view);
                return;
        }
    }

    public lk(org.telegram.ui.cr crVar, s4.o0 o0Var) {
        this.f28188b = crVar;
    }
}
