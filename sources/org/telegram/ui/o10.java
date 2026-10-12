package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o10 extends AnimatorListenerAdapter {
    public final int f40533a = 0;
    public final cr f40534b;

    public o10(cr crVar) {
        this.f40534b = crVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40533a) {
            case 0:
                ((y10) this.f40534b.d).f44262l0.unlock();
                return;
            default:
                cr crVar = this.f40534b;
                View view = crVar.f36499b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((y10) crVar.d).f44248b.removeView(view);
                return;
        }
    }

    public o10(cr crVar, s4.p0 p0Var) {
        this.f40534b = crVar;
    }
}
