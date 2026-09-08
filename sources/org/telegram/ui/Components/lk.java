package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class lk extends AnimatorListenerAdapter {
    public final int f28214a = 0;
    public final org.telegram.ui.cr f28215b;

    public lk(org.telegram.ui.cr crVar) {
        this.f28215b = crVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28214a) {
            case 0:
                ((nk) this.f28215b.d).U.unlock();
                return;
            default:
                org.telegram.ui.cr crVar = this.f28215b;
                View view = crVar.f35551b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((nk) crVar.d).X.f29119r.removeView(view);
                return;
        }
    }

    public lk(org.telegram.ui.cr crVar, s4.o0 o0Var) {
        this.f28215b = crVar;
    }
}
