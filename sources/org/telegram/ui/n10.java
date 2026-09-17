package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n10 extends AnimatorListenerAdapter {
    public final int f38811a = 0;
    public final cr f38812b;

    public n10(cr crVar) {
        this.f38812b = crVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38811a) {
            case 0:
                ((x10) this.f38812b.d).f42552l0.unlock();
                return;
            default:
                cr crVar = this.f38812b;
                View view = crVar.f35525b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) crVar.d).f42538b.removeView(view);
                return;
        }
    }

    public n10(cr crVar, s4.o0 o0Var) {
        this.f38812b = crVar;
    }
}
