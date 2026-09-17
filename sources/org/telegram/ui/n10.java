package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n10 extends AnimatorListenerAdapter {
    public final int f38838a = 0;
    public final cr f38839b;

    public n10(cr crVar) {
        this.f38839b = crVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38838a) {
            case 0:
                ((x10) this.f38839b.d).f42579l0.unlock();
                return;
            default:
                cr crVar = this.f38839b;
                View view = crVar.f35552b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) crVar.d).f42565b.removeView(view);
                return;
        }
    }

    public n10(cr crVar, s4.o0 o0Var) {
        this.f38839b = crVar;
    }
}
